package ibmw;

import java.io.*;

public class ManejadorArchivo {

    public static CI leerCondicionesIniciales() throws IOException {
        File file = new File("parametros.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int[] ints = new int[13];

        for (int i = 0; i < 13; i++) {
            ints[i] = Integer.parseInt(bufferedReader.readLine().split(":")[1]);
        }

        return new CI(ints[0],ints[1],ints[2],ints[3],ints[4],ints[5],ints[6],ints[7],ints[8],ints[9],ints[10],ints[11],ints[12]);
    }

}

class CI {
    private int tiempoDia;
    private int diaParaDespacho;
    private int maxRuedas;
    private int maxParabrisas;
    private int maxMotores;
    private int maxProdRuedas;
    private int maxProdParabrisas;
    private int maxProdMotores;
    private int maxEnsambladores;
    private int prodInicialRuedas;
    private int prodInicialParabrisas;
    private int prodInicialMotores;
    private int ensambladoresIniciales;

    public CI(int tiempoDia, int diaParaDespacho, int maxRuedas, int maxParabrisas, int maxMotores, int maxProdRuedas, int maxProdParabrisas, int maxProdMotores, int maxEnsambladores, int prodInicialRuedas, int prodInicialParabrisas, int prodInicialMotores, int ensambladoresIniciales) {
        this.tiempoDia = tiempoDia;
        this.diaParaDespacho = diaParaDespacho;
        this.maxRuedas = maxRuedas;
        this.maxParabrisas = maxParabrisas;
        this.maxMotores = maxMotores;
        this.maxProdRuedas = maxProdRuedas;
        this.maxProdParabrisas = maxProdParabrisas;
        this.maxProdMotores = maxProdMotores;
        this.maxEnsambladores = maxEnsambladores;
        this.prodInicialRuedas = prodInicialRuedas;
        this.prodInicialParabrisas = prodInicialParabrisas;
        this.prodInicialMotores = prodInicialMotores;
        this.ensambladoresIniciales = ensambladoresIniciales;
    }

    public int getTiempoDia() {
        return tiempoDia;
    }

    public int getDiaParaDespacho() {
        return diaParaDespacho;
    }

    public int getMaxRuedas() {
        return maxRuedas;
    }

    public int getMaxParabrisas() {
        return maxParabrisas;
    }

    public int getMaxMotores() {
        return maxMotores;
    }

    public int getMaxProdRuedas() {
        return maxProdRuedas;
    }

    public int getMaxProdParabrisas() {
        return maxProdParabrisas;
    }

    public int getMaxProdMotores() {
        return maxProdMotores;
    }

    public int getMaxEnsambladores() {
        return maxEnsambladores;
    }

    public int getProdInicialRuedas() {
        return prodInicialRuedas;
    }

    public int getProdInicialParabrisas() {
        return prodInicialParabrisas;
    }

    public int getProdInicialMotores() {
        return prodInicialMotores;
    }

    public int getEnsambladoresIniciales() {
        return ensambladoresIniciales;
    }
}
