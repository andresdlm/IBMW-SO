package ibmw;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread{
    
    private Almacen alm;
    private Semaphore mutex, sProductor, sEnsamblador;
    private int tiempo, type;
    private boolean contratar;

    public Productor(Semaphore mutex, Semaphore sProductor, Semaphore sEnsamblador, int type) {
        this.mutex = mutex;
        this.sProductor = sProductor;
        this.sEnsamblador = sEnsamblador;
        this.type = type;
        this.contratar = true;
    }
    
    public Productor(Almacen alm, Semaphore mutex, Semaphore sProductor, Semaphore sEnsamblador, int tiempo, int type) {
        this.alm = alm;
        this.mutex = mutex;
        this.sProductor = sProductor;
        this.sEnsamblador = sEnsamblador;
        this.tiempo = tiempo;
        this.type = type;
        this.contratar = true;
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
                        System.out.println("Rueda Producida");
                        Fabrica.rPointer = (Fabrica.rPointer + 1) % this.alm.getCapacidad();
                        Fabrica.aggContadorR();
                        break;
                    case 2:

                        System.out.println("Parabrisas Producido");
                        Fabrica.pPointer = (Fabrica.pPointer + 1) % this.alm.getCapacidad();
                        Fabrica.aggContadorP();
                        break;
                    case 3:

                        System.out.println("Motor Producido");
                        Fabrica.mPointer = (Fabrica.mPointer + 1) % this.alm.getCapacidad();
                        Fabrica.aggContadorM();
                        break;
                }
                this.mutex.release();
                this.sEnsamblador.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Despedir() {
        this.contratar = false;
    }
}
