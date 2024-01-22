package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Ordenador;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.sevicio.Orden;

public class VentaOrdenadoresApp {
    public static void main(String[] args) {
        // Crear objetos

        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",30);
        //System.out.println(monitorLenovo);

        // Creamos un objecto de tipo Ordenador
        Ordenador ordenadorLenovo =
                new Ordenador("Ordenador Lenovo",monitorLenovo,
                        tecladoLenovo, ratonLenovo);
        //System.out.println(ordenadorLenovo);

        // Objeto ordenador
        Monitor monitoDell = new Monitor("Dell", 15);
        Teclado tecaldoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton ("usb", "Dell");
        Ordenador ordenadorDell = new Ordenador("Ordenador Dell",
                monitoDell,tecaldoDell,ratonDell);

        //Crear una orden
        Orden orden1 = new Orden();
        orden1.agregarOrdenador(ordenadorLenovo);
        orden1.agregarOrdenador(ordenadorDell);
        orden1.mostrarOrden();

        // Ordenador Apple
        Monitor monitorApple = new Monitor("Apple", 27);
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Ordenador ordenadorApple = new Ordenador("Mac Apple",
                monitorApple, tecladoApple,ratonApple);

        // Crear orden 2
        Orden orden2 = new Orden();
        orden2.agregarOrdenador(ordenadorApple);
        orden2.agregarOrdenador(ordenadorDell);
        orden2.agregarOrdenador(ordenadorLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}