
package ibmw;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ensamblador extends Thread{
    
    private Almacen rAlm, pAlm, mAlm;
    private Semaphore srMutex, srProductor, srEnsamblador;
    private Semaphore spMutex, spProductor, spEnsamblador;
    private Semaphore smMutex, smProductor, smEnsamblador;
    private boolean contratar;
    private int tiempo;
    
    public Ensamblador(Almacen rAlm, Almacen pAlm, Almacen mAlm, Semaphore srMutex, Semaphore srProductor, Semaphore srEnsamblador, Semaphore spMutex, Semaphore spProductor, Semaphore spEnsamblador, Semaphore smMutex, Semaphore smProductor, Semaphore smEnsamblador, int tiempo) {
        this.rAlm = rAlm;
        this.pAlm = pAlm;
        this.mAlm = mAlm;
        this.srMutex = srMutex;
        this.srProductor = srProductor;
        this.srEnsamblador = srEnsamblador;
        this.spMutex = spMutex;
        this.spProductor = spProductor;
        this.spEnsamblador = spEnsamblador;
        this.smMutex = smMutex;
        this.smProductor = smProductor;
        this.smEnsamblador = smEnsamblador;
        this.tiempo = tiempo;
        this.contratar = true;
    }
    
    @Override
    public void run() {
        while (this.contratar) {
            try {
                this.srEnsamblador.acquire(4);
                this.spEnsamblador.acquire(1);
                this.smEnsamblador.acquire(1);

                this.srMutex.acquire();
                for (int i = 0; i < 3; i++) {
                    this.rAlm.producir(Fabrica.rCosPointer, 0);
                    Fabrica.rCosPointer = (Fabrica.rCosPointer + 1) % this.rAlm.getCapacidad();
                }
                Fabrica.subContadorR();
                this.srMutex.release();

                this.spMutex.acquire();
                for (int i = 0; i < 2; i++) {
                    this.pAlm.producir(Fabrica.pCosPointer, 0);
                    Fabrica.pCosPointer = (Fabrica.pCosPointer + 1) % this.pAlm.getCapacidad();
                }
                Fabrica.subContadorP();
                this.spMutex.release();

                this.smMutex.acquire();
                this.mAlm.producir(Fabrica.mCosPointer, 0);
                Fabrica.mCosPointer = (Fabrica.mCosPointer + 1) % this.mAlm.getCapacidad();
                Fabrica.subContadorM();
                this.smMutex.release();

                this.srProductor.release(4);
                this.spProductor.release(1);
                this.smProductor.release(1);

                this.Entregar();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void Entregar() throws InterruptedException {
        Thread.sleep(this.tiempo);
        System.out.println("Carro ensamblado");
        Gerente.aggCarro();
    }

    public void Despedir() {
        this.contratar = false;
    }
}
