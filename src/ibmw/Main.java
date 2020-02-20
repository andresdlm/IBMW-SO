package ibmw;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            IBMW ibmw = new IBMW();
            CI ci = ManejadorArchivo.leerCondicionesIniciales();
            IBMW.maxRuedasLabel.setText(String.valueOf(ci.getMaxRuedas()));
            IBMW.maxParabrisasLabel.setText(String.valueOf(ci.getMaxParabrisas()));
            IBMW.maxMotoresLabel.setText(String.valueOf(ci.getMaxMotores()));
            ibmw.start(ci.getTiempoDia(), ci.getDiaParaDespacho(), ci.getMaxProdRuedas(), ci.getMaxProdParabrisas(),
                    ci.getMaxProdMotores(), ci.getMaxEnsambladores(), ci.getProdInicialRuedas(), ci.getProdInicialParabrisas(),
                    ci.getProdInicialMotores(), ci.getEnsambladoresIniciales(), ci.getMaxRuedas(), ci.getMaxParabrisas(), ci.getMaxMotores());
            ibmw.setVisible(true);
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de condiciones iniciales.");
        }

    }
}
