package ibmw;

public class WindowUpdater extends Thread {

    private Fabrica fabrica;
    private Jefe jefe;
    private Gerente gerente;

    public WindowUpdater(Fabrica fabrica, Jefe jefe, Gerente gerente) {
        this.fabrica = fabrica;
        this.jefe = jefe;
        this.gerente = gerente;
    }

    @Override
    public void run() {
        while (true) {
            IBMW.cantEnsambladoresLabel.setText("" + this.fabrica.getEnsambladorContador());
            IBMW.cantProdRuedas.setText("" + this.fabrica.getProductorRContador());
            IBMW.cantProdParabrisas.setText("" + this.fabrica.getProductorPContador());
            IBMW.cantProdMotores.setText("" + this.fabrica.getProductorMContador());
            IBMW.nCarrosLabel.setText("" + Gerente.getCarros());
            IBMW.nRuedasLabel.setText("" + this.fabrica.getContadorR());
            IBMW.nParabrisasLabel.setText("" + this.fabrica.getContadorP());
            IBMW.nMotoresLabel.setText("" + this.fabrica.getContadorM());
            IBMW.estadoGerenteLabel.setText(Gerente.estado());
            IBMW.estadoJefeLabel.setText(Jefe.statusWaiter());
            IBMW.diasDespachoLabel.setText(String.valueOf(Jefe.getDiasRestantes()));
        }
    }
}
