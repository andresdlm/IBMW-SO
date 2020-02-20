
package ibmw;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread{
    
    private Almacen alm;
    private Semaphore mutex, sProductor, sEnsamblador;
    private int tiempo, type;
    private boolean contratar;
    private String nombre;

    public Productor(Semaphore mutex, Semaphore sProductor, Semaphore sEnsamblador, int type, String nombre) {
        this.mutex = mutex;
        this.sProductor = sProductor;
        this.sEnsamblador = sEnsamblador;
        this.type = type;
        this.contratar = true;
        this.nombre = nombre;
    }
    
    public Productor(Almacen alm, Semaphore mutex, Semaphore sProductor, Semaphore sEnsamblador, int tiempo, int type, String nombre) {
        this.alm = alm;
        this.mutex = mutex;
        this.sProductor = sProductor;
        this.sEnsamblador = sEnsamblador;
        this.tiempo = tiempo;
        this.type = type;
        this.contratar = true;
        this.nombre = nombre;
        System.out.println("Productor contratado!");
    }
    
    @Override
    public void run() {
        while (this.contratar) {
            try {
                this.sProductor.acquire();
                Thread.sleep(this.tiempo);
                this.mutex.acquire();
                switch (this.type) {
                    case 1:
                        this.alm.producir(Fabrica.rPointer, type);
                        System.out.println("Rueda Producida || Space left " + this.alm.getSpaceLeft());
                        Fabrica.rPointer = (Fabrica.rPointer + 1) % this.alm.getCapacidad();
                        Fabrica.aggContadorR();
                        break;
                    case 2:
                        this.alm.producir(Fabrica.pPointer, type);
                        System.out.println("Parabrisas Producido || Space left " + this.alm.getSpaceLeft());
                        Fabrica.pPointer = (Fabrica.pPointer + 1) % this.alm.getCapacidad();
                        Fabrica.aggContadorP();
                        break;
                    case 3:
                        this.alm.producir(Fabrica.mPointer, type);
                        System.out.println("Motor Producido || Space left " + this.alm.getSpaceLeft());
                        Fabrica.mPointer = (Fabrica.mPointer + 1) % this.alm.getCapacidad();
                        Fabrica.aggContadorM();
                        break;
                }
                this.mutex.release();
                this.sEnsamblador.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }//getName cuidado (getNombre?)
        }
    }
    
    public void Despedir() {
        this.contratar = false;
    }
}
