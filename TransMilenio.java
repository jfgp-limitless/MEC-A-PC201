import java.util.ArrayList;



public class TransMilenio {
    public static void main(String[] args) {
        Estacion estacion1 = new Estacion("Portal 20 de Julio");
        Estacion estacion2 = new Estacion("Av. Boyacá - Kr 68");
        Estacion estacion3 = new Estacion("Av. Caracas - Kr 30");
        Estacion estacion4 = new Estacion("Calle 100");
        Estacion estacion5 = new Estacion("Portal de la 80");

        Ruta ruta1 = new Ruta(1);
        ruta1.agregarEstacion(estacion1);
        ruta1.agregarEstacion(estacion2);
        ruta1.agregarEstacion(estacion3);

        Ruta ruta2 = new Ruta(2);
        ruta2.agregarEstacion(estacion2);
        ruta2.agregarEstacion(estacion3);
        ruta2.agregarEstacion(estacion4);

        Ruta ruta3 = new Ruta(3);
        ruta3.agregarEstacion(estacion1);
        ruta3.agregarEstacion(estacion2);
        ruta3.agregarEstacion(estacion4);
        ruta3.agregarEstacion(estacion5);

        System.out.println("Ruta 1: ");
        for (Estacion estacion : ruta1.getEstaciones()) {
            System.out.println(estacion.getNombre());
        }

        System.out.println("Ruta 2: ");
        for (Estacion estacion : ruta2.getEstaciones()) {
            System.out.println(estacion.getNombre());
        }

        System.out.println("Ruta 3: ");
        for (Estacion estacion : ruta3.getEstaciones()) {
            System.out.println(estacion.getNombre());
        }
    }
}

class Estacion {
    private String nombre;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Ruta {
    private int numero;
    private ArrayList<Estacion> estaciones;

    public Ruta(int numero) {
        this.numero = numero;
        this.estaciones = new ArrayList<Estacion>();
    }

    public int getNumero() {
        return numero;
    }

    public void agregarEstacion(Estacion estacion) {
        this.estaciones.add(estacion);
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }
}


/*
Creacion de Mas clases
class Troncales{
    

}

*/
