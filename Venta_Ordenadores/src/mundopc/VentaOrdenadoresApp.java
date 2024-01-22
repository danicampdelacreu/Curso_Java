package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Ordenador;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",30);
        System.out.println(monitorLenovo);
        // Creamos un objecto de tipo Ordenador
        Ordenador ordenadorLenovo =
                new Ordenador("Ordenador Lenovo",monitorLenovo,
                        tecladoLenovo, ratonLenovo);
        System.out.print(ordenadorLenovo);
    }
}