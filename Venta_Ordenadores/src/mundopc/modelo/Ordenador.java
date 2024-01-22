package mundopc.modelo;

public class Ordenador {
    private int idOrdenador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorOrdenadores;

    private Ordenador (){
        idOrdenador = ++contadorOrdenadores;
    }

    public Ordenador(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();// llamar computador privado
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Ordenador{\n" +
                "idOrdenador=" + idOrdenador +
                ",  nombre= '" + nombre + '\'' +
                ", \n   monitor= " + monitor +
                ", \n   teclado= " + teclado +
                ", \n   raton= " + raton +
                '}';
        // "\n" para que se impirima en una nueva linea
    }
}
