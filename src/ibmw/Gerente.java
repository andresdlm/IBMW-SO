
package ibmw;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gerente extends Thread {
    
    private static boolean estado;
    private int diasParaDespacho, minTiempo, maxTiempo;
    public static int carros;
    private Semaphore mutex;

    //Constructor
    public Gerente(int minTiempo, int maxTiempo, int diasParaDespacho, Semaphore mutex) {
        this.maxTiempo = maxTiempo;
        this.minTiempo = minTiempo;
        this.diasParaDespacho = diasParaDespacho;
        this.estado = true;
        this.mutex = mutex;
    }
    
    //reinicializar el contador le toma 0.1 horas al gerente (Falta colocar esto)
    @Override
    public void run() {
        while (true) {
            try {

                int random = ((int) (Math.random() * (this.maxTiempo - this.minTiempo)) + this.minTiempo);
                this.estado = true;
                Thread.sleep(this.minTiempo * 4 - random);   //Verificar que funciona sin el this.minTiempo*4

                this.mutex.acquire();

                if (Jefe.getDiasRestantes() == 0) {
                    this.carros = 0;
                }

                this.estado = false;
                this.mutex.release();
                Thread.sleep(random);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String estado() {
        if (Gerente.estado) {
            return "Trabajando";
        } else {
            return "Durmiendo...";
        }
    }

    public static int getCarros() {
        return Gerente.carros;
    }

    public static void aggCarro() {
        Gerente.carros++;
    }

}
