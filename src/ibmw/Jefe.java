package ibmw;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jefe extends Thread{
    
    private static int diasParaDespacho;
    private final int dias;
    private int tiempoTrabajo, tiempoDescanso;
    private static boolean estado;
    private Semaphore semaphore;

    public Jefe(int diasParaDespacho, int tiempoTrabajo, int tiempoDescanso, Semaphore semaphore) {
        Jefe.diasParaDespacho = diasParaDespacho;
        this.dias = diasParaDespacho;
        this.tiempoTrabajo = tiempoTrabajo;
        this.tiempoDescanso = tiempoDescanso;
        estado = false;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.semaphore.acquire();
                estado = true;
                Thread.sleep(tiempoTrabajo);

                if (diasParaDespacho != 0) {
                    diasParaDespacho--;
                } else {
                    diasParaDespacho = dias;
                }
                estado = false;
                this.semaphore.release();

                Thread.sleep(tiempoDescanso);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static int getDiasRestantes() {
        return Jefe.diasParaDespacho;
    }

    //If status is true the waiter is working. If status is false the waiter is resting
    public static String statusWaiter() {
        if (Jefe.estado) {
            return "Trabajando";
        } else {
            return "Durmiendo...";
        }
    }
}
