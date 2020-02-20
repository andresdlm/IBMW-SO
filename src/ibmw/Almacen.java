
package ibmw;

public class Almacen {
    
    private int[] almacen;
    private int capacidad;
    private String nombre;
    
    public Almacen(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.almacen = new int[capacidad];
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void producir(int i, int data) {
        almacen[i] = data;/*
        System.out.println("______________________");
        switch (data) {
            case 0:
                System.out.println("Ensamblado " + data);
                break;
            case 1:
                System.out.println("Rueda Producida " + data);
                break;
            case 2:
                System.out.println("Parabrisas Producido " + data);
                break;
            case 3:
                System.out.println("Motor Producido " + data);
                break;
        }
        System.out.println("----------------------");*/
    }

    public int getSpaceLeft() /*que es space left?? */ {
        int temp = this.almacen.length;
        for (int i = 0; i < this.almacen.length; i++) {
            if (this.almacen[i] != 0) {
                temp--;
            } else {
                return temp;
            }
        }
        
        return 0;
    }
}
