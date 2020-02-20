
package ibmw;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jefe extends Thread{
    
    private static int horasRestantes;
    private int tiempoTrabajo, tiempoDescanso;
    private static boolean estado;
    private Semaphore mutex;

    public Jefe(int horasRestantes, int tiempoTrabajo, int tiempoDescanso, Semaphore mutex) {
        this.horasRestantes = horasRestantes;
        this.tiempoTrabajo = tiempoTrabajo;
        this.tiempoDescanso = tiempoDescanso;
        this.estado = false;
        this.mutex = mutex;
    }
    
    //Methods
    @Override
    public void run() {
        while (true) {
            try {
                this.mutex.acquire();
                this.estado = true;
                Thread.sleep(tiempoTrabajo);
                /*System.out.println("*-*-*-*-*-*-*-*");
                System.out.println("Writer Working");
                System.out.println("*-*-*-*-*-*-*-*");*/
                this.horasRestantes--;

                /*System.out.println("*-*-*-*-*-*-*-*");
                System.out.println("Time for closing: " + hoursLeft);
                System.out.println("*-*-*-*-*-*-*-*");*/
                this.estado = false;
                this.mutex.release();

                /*System.out.println("*-*-*-*-*-*-*-*");
                System.out.println("I'm Sleeping Now zZzZ");
                System.out.println("*-*-*-*-*-*-*-*");*/
                Thread.sleep(tiempoDescanso);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
            }//getName cuidado (getNombre??)
        }
    }

    public static int getHorasRestantes() {
        return Jefe.horasRestantes;
    }

    public static void initHorasRestantes(int hrsParaCierre) {
        Jefe.horasRestantes = hrsParaCierre;
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
