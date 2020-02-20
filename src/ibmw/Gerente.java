
package ibmw;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gerente extends Thread {
    
    private static boolean estado;
    private int hrsParaCierre, minTiempo, maxTiempo, cambiarTiempo;
    public static int carros;
    private Semaphore mutex;

    //Constructor
    public Gerente(int minTiempo, int maxTiempo, int cambiarTiempo, int hrsParaCierre, Semaphore mutex) {
        this.maxTiempo = maxTiempo;
        this.minTiempo = minTiempo;
        this.cambiarTiempo = cambiarTiempo;
        this.hrsParaCierre = hrsParaCierre;
        this.estado = true;
        this.mutex = mutex;
    }
    
    //reinicializar el contador le toma 0.1 horas al gerente (Falta colocar esto)
    @Override
    public void run() {
        while (true) {
            try {
                //int random = this.minTiempo + ((int) (Math.random() * (this.maxTiempo-this.minTiempo)) + 1);
                int random = ((int) (Math.random() * (this.maxTiempo - this.minTiempo)) + this.minTiempo);
                this.estado = true;
                Thread.sleep(this.minTiempo * 4 - random);                //Verificar que funciona sin el this.minTiempo*4
                //System.out.println("Gerente leyendo");
                this.mutex.acquire();
                /*System.out.println("**************");
                System.out.println("Gerente leyendo");
                System.out.println("**************");*/
                if (Jefe.getHorasRestantes() == 0) {
                    this.carros = 0;
                    Thread.sleep(this.cambiarTiempo);
                    Jefe.initHorasRestantes(this.hrsParaCierre);
                    /*System.out.println("/////////////////////////////////////////////");
                    System.out.println("New Day, new Objects... Starting Positively :)");
                    System.out.println("/////////////////////////////////////////////");*/
                }
                this.estado = false;
                this.mutex.release();
                /*System.out.println("zZzZzZzZzZzZzZzZzZzZzZ");
                System.out.println("Reader Sleeping zZzZzZ");
                System.out.println("zZzZzZzZzZzZzZzZzZzZzZ");*/
                Thread.sleep(random);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }//getName cuidado (getNombre?)
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
