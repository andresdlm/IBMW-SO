package ibmw;

import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

public class Fabrica {
    
     //  SEMAFOROS
    private Semaphore srMutex, spMutex, srProductor, spProductor, srEnsamblador, spEnsamblador, smMutex, smProductor, smEnsamblador, sJefe;

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

    private int tiempoDia;

    /*private App app;*/


    public Fabrica(int tiempoDia, int diaHastaDespacho, int rProdLimit, int pProdLimit, int mProdLimit, int ensambladoresLimit, int rProdInit, int pProdInit, int mProdInit, int ensambladorInit, int rAlmacenLimit, int pAlmacenLimit, int mAlmacenLimit) {

        this.tiempoDia = tiempoDia;

        this.rAlmacen = new Almacen(rAlmacenLimit);
        this.pAlmacen  = new Almacen(pAlmacenLimit);
        this.mAlmacen = new Almacen(mAlmacenLimit);

        this.srProductor = new Semaphore(rAlmacenLimit);
        this.spProductor = new Semaphore(pAlmacenLimit);
        this.smProductor = new Semaphore(mAlmacenLimit);

        this.srMutex = new Semaphore(1);
        this.spMutex = new Semaphore(1);
        this.smMutex = new Semaphore(1);

        this.sJefe = new Semaphore(1);

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

        this.gerente = new Gerente(this.getDias(0.25), this.getDias(0.75), this.sJefe);
        this.jefe = new Jefe(diaHastaDespacho, this.getDias(0.0625), this.getDias(0.9375), this.sJefe);
        this.jefe.start();
        this.gerente.start();
    }
     
    public int getDias(double dias) {
        return (int) (dias * this.tiempoDia * 1000);
    }

    public boolean contrProductorR() {
        if (this.rProdContador == this.rProductor.length) {
            System.out.println("No se pueden contratar mas productores!");
            return false;
        } else {
            for (int i = 0; i < this.rProductor.length; i++) {
                if (this.rProductor[i] == null) {
                    this.rProductor[i] = new Productor(rAlmacen, srMutex, srProductor, srEnsamblador, this.getDias(1), 1);
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
                    this.pProductor[i] = new Productor(pAlmacen, spMutex, spProductor, spEnsamblador, this.getDias(2), 2);
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
                    this.mProductor[i] = new Productor(mAlmacen, smMutex, smProductor, smEnsamblador, this.getDias(3), 3);
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
                    this.ensambladores[i] = new Ensamblador(rAlmacen, pAlmacen, mAlmacen, srMutex, srProductor, srEnsamblador, spMutex, spProductor, spEnsamblador, smMutex, smProductor, smEnsamblador, this.getDias(2));
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
