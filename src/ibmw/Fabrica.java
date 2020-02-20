
package ibmw;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

public class Fabrica {
    
     //  SEMAFOROS
    private Semaphore srMutex, spMutex, srProductor, spProductor, srEnsamblador, spEnsamblador, smMutex, smProductor, smEnsamblador, sManMutex;

    //  ALMACENES
    private Almacen rAlmacen, pAlmacen, mAlmacen;

    //  PRODUCTORES (Chefs)
    private Productor[] rProductor, pProductor, mProductor;

    //  ENSAMBLADORES (waiters=ensambladores)
    private Ensamblador[] ensambladores;

    //  GERENTE (manager=gerente)
    private Gerente gerente;

    //  JEFE (wboss=jefe; Writer = Jefe)
    private Jefe jefe;

    //  CONTADORES DE PRODUCTORES
    private int rProdContador, pProdContador, mProdContador, jContador;

    //  CONTADORES DE PRODUCTOS 
    private static int rContador, pContador, mContador, cContador;

    //  POINTERS
    public static int rPointer, pPointer, mPointer, rCosPointer, pCosPointer, mCosPointer;

    private int tiempoTrabajo;
    private int tiempoParaCierre;
    /*private App app;*/
    
        /**
     *
     * @param tiempoTrabajo
     * @param tiempoParaCierre
     * @param rProdLimit
     * @param pProdLimit
     * @param mProdLimit
     * @param ensambladoresLimit
     * @param rProdInit
     * @param pProdInit
     * @param mProdInit
     * @param ensambladorInit
     * @param rAlmacenLimit
     * @param pAlmacenLimit
     * @param mAlmacenLimit
     */
    
     public Fabrica(int tiempoTrabajo, int tiempoParaCierre, int rProdLimit, int pProdLimit, int mProdLimit, int ensambladoresLimit, int rProdInit, int pProdInit, int mProdInit, int ensambladorInit, int rAlmacenLimit, int pAlmacenLimit, int mAlmacenLimit, IBMW IBMW) {

        this.tiempoTrabajo = tiempoTrabajo;
        this.tiempoParaCierre = tiempoParaCierre;
     /* this.app = app;*/

        this.rAlmacen = new Almacen(rAlmacenLimit, "Rueda");
        this.pAlmacen  = new Almacen(pAlmacenLimit, "Parabrisas");
        this.mAlmacen = new Almacen(mAlmacenLimit, "Motor");

        this.srProductor = new Semaphore(rAlmacenLimit);
        this.spProductor = new Semaphore(pAlmacenLimit);
        this.smProductor = new Semaphore(mAlmacenLimit);

        this.srMutex = new Semaphore(1);
        this.spMutex = new Semaphore(1);
        this.smMutex = new Semaphore(1);

        this.sManMutex = new Semaphore(1);

        this.srEnsamblador = new Semaphore(0);
        this.spEnsamblador = new Semaphore(0);
        this.smEnsamblador = new Semaphore(0);

        this.rProductor = new Productor[rProdLimit];
        this.pProductor = new Productor[pProdLimit];
        this.mProductor = new Productor[mProdLimit];
        this.ensambladores = new Ensamblador[ensambladoresLimit];

        this.rProdContador = 0;
        this.pProdContador = 0;
        this.mProdContador = 0;
        this.jContador = 0;

        Fabrica.rPointer = 0;
        Fabrica.pPointer = 0;
        Fabrica.mPointer = 0;

        Fabrica.rCosPointer = 0;
        Fabrica.pCosPointer = 0;
        Fabrica.mCosPointer = 0;

        Fabrica.rContador = 0;
        Fabrica.pContador = 0;
        Fabrica.mContador = 0;

        for (int i = 0; i < rProdInit; i++) {
            this.contrProductorR();
        }

        for (int i = 0; i < pProdInit; i++) {
            this.contrProductorP();
        }

        for (int i = 0; i < mProdInit; i++) {
            this.contrProductorM();
        }

        for (int i = 0; i < ensambladorInit; i++) {
            this.contrEnsamblador();
        }

        this.gerente = new Gerente(this.getHoras(0.25), this.getHoras(0.45), this.getHoras(0.1), this.tiempoParaCierre, this.sManMutex);
        this.gerente.start();

        this.jefe = new Jefe(this.tiempoParaCierre, this.getHoras(0.05), this.getHoras(8 - 0.05), this.sManMutex);
        this.jefe.start();
    }
     
     public int getHoras(double horas) {
        return (int) (horas * this.tiempoTrabajo * 1000) / 8;
    }

    public boolean contrProductorR() {
        if (this.rProdContador == this.rProductor.length) {
            System.out.println("No se pueden contratar mas productores!");
            return false;
        } else {
            for (int i = 0; i < this.rProductor.length; i++) {
                if (this.rProductor[i] == null) {
                    this.rProductor[i] = new Productor(rAlmacen, srMutex, srProductor, srEnsamblador, this.getHoras(0.25), 1, "Productor Rueda");
                    this.rProductor[i].start();
                    this.rProdContador++;
                   /* if (!this.app.getH1().isEnabled()) {
                        this.app.getH1().setEnabled(true);
                    }*/
                    return true;
                }
            }
        }

        return false;
    }

    public boolean contrProductorP() {
        if (this.pProdContador == this.pProductor.length) {
            System.out.println("No se pueden contratar mas productores!");
            return false;
        } else {
            for (int i = 0; i < this.pProductor.length; i++) {
                if (this.pProductor[i] == null) {
                    this.pProductor[i] = new Productor(pAlmacen, spMutex, spProductor, spEnsamblador, this.getHoras(0.33), 2, "Productor Parabrisas");
                    this.pProductor[i].start();
                    this.pProdContador++;
                    return true;
                }
            }
        }

        return false;
    }
    
    public boolean contrProductorM() {
        if (this.mProdContador == this.mProductor.length) {
            System.out.println("No se pueden contratar mas productores!");
            return false;
        } else {
            for (int i = 0; i < this.mProductor.length; i++) {
                if (this.mProductor[i] == null) {
                    this.mProductor[i] = new Productor(mAlmacen, smMutex, smProductor, smEnsamblador, this.getHoras(0.30), 3, "Productor Motor");
                    this.mProductor[i].start();
                    this.mProdContador++;
                    return true;
                }
            }
        }

        return false;
    }

    public boolean contrEnsamblador() {
        if (this.jContador == this.ensambladores.length) {
            System.out.println("No se pueden contratar mas ensambladores!");
            return false;
        } else {
            for (int i = 0; i < this.ensambladores.length; i++) {
                if (this.ensambladores[i] == null) {
                    this.ensambladores[i] = new Ensamblador(rAlmacen, pAlmacen, mAlmacen, srMutex, srProductor, srEnsamblador, spMutex, spProductor, spEnsamblador, smMutex, smProductor, smEnsamblador, this.getHoras(0.15));
                    this.ensambladores[i].start();
                    this.jContador++;

                    return true;
                }
            }
        }

        return false;
    }
    
    public boolean despedirProductorR() {
        if (this.rProdContador < 0) {
            JOptionPane.showMessageDialog(null, "No hay productores");
            return false;
        } else {
            for (int i = this.rProductor.length - 1; i >= 0; i--) {
                if (this.rProductor[i] != null) {
                    this.rProductor[i].Despedir();
                    this.rProductor[i] = null;
                    this.rProdContador--;

                    return true;
                }
            }
        }

        return false;
    }

    public boolean despedirProductorP() {
        if (this.pProdContador < 0) {
            JOptionPane.showMessageDialog(null, "No hay productores!");
            return false;
        } else {
            for (int i = this.pProductor.length - 1; i >= 0; i--) {
                if (this.pProductor[i] != null) {
                    this.pProductor[i].Despedir();
                    this.pProductor[i] = null;
                    this.pProdContador--;

                    return true;
                }
            }
        }

        return false;
    }
    
    public boolean despedirProductorM() {
        if (this.mProdContador < 0) {
            JOptionPane.showMessageDialog(null, "No hay productores!");
            return false;
        } else {
            for (int i = this.mProductor.length - 1; i >= 0; i--) {
                if (this.mProductor[i] != null) {
                    this.mProductor[i].Despedir();
                    this.mProductor[i] = null;
                    this.mProdContador--;

                    return true;
                }
            }
        }

        return false;
    }

    public boolean despedirEnsamblador() {
        if (this.jContador < 0) {
            JOptionPane.showMessageDialog(null, "No hay ensambladores!");
            return false;
        } else {
            for (int i = this.ensambladores.length - 1; i >= 0; i--) {
                if (this.ensambladores[i] != null) {
                    this.ensambladores[i].Despedir();
                    this.ensambladores[i] = null;
                    this.jContador--;

                    return true;
                }
            }
        }

        return false;
    }
    
    public static void aggContadorR() {
        Fabrica.rContador++;
    }

    public static void aggContadorP() {
        Fabrica.pContador++;
    }

    public static void aggContadorM() {
        Fabrica.mContador++;
    }

    public static void subContadorR() {
        Fabrica.rContador -= 4;
    }

    public static void subContadorP() {
        Fabrica.pContador--;
    }

    public static void subContadorM() {
        Fabrica.mContador--;
    }

    public static void entregarCarros() {
        Fabrica.cContador++;
    }

    public int getContadorR() {
        return Fabrica.rContador;
    }

    public int getContadorP() {
        return Fabrica.pContador;
    }

    public int getContadorM() {
        return Fabrica.mContador;
    }

    public int getCarrosContador() {
        return Fabrica.cContador;
    }

    public int getProductorRContador() {
        return this.rProdContador;
    }

    public int getProductorPContador() {
        return this.pProdContador;
    }

    public int getProductorMContador() {
        return this.mProdContador;
    }

    public int getEnsambladorContador() {
        return this.jContador;
    }

    public ibmw.Jefe getJefe() {
        return this.jefe;
    }

    public ibmw.Gerente getGerente() {
        return this.gerente;
    }
}
