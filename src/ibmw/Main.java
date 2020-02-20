package ibmw;

public class Main {
    public static void main(String[] args) {
        IBMW ibmw = new IBMW();

        int duracionDia = 2;
        int diasDespacho = 8;
        int maxRuedasProd = 3;
        int maxParabProd = 4;
        int maxMotoresProd = 2;
        int maxEnsambladores = 6;
        int ruedasProdInicial = 2;
        int parabProdInicial = 2;
        int motoresProdInicial = 1;
        int ensambladoresIniciales = 3;
        int maxRuedas = 30;
        int maxParabrisas = 25;
        int maxMotores = 15;

        ibmw.maxRuedasLabel.setText(String.valueOf(maxRuedas));
        ibmw.maxParabrisasLabel.setText(String.valueOf(maxParabrisas));
        ibmw.maxMotoresLabel.setText(String.valueOf(maxMotores));
        ibmw.start(duracionDia, diasDespacho, maxRuedasProd, maxParabProd, maxMotoresProd, maxEnsambladores, ruedasProdInicial, parabProdInicial, motoresProdInicial, ensambladoresIniciales, maxRuedas, maxParabrisas, maxMotores);
        ibmw.setVisible(true);
    }
}
