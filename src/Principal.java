/*
        b) Calcular la cantidad promedio producida.
        c) Calcular el total en Bs. que se encuentra en Almacén, debido a la producción
        del último mes.
        d) Mostrar la cantidad producida, de un producto cuyo nombre debe ser solicitado
        al usuario, para que sea introducido por teclado.
        e) Si toda la producción del último mes se vendió, calcule las ganancias para la
        empresa.
        f) Mostrar el nombre de los artículos, con producción por debajo del promedio en
        el último mes.*/


import java.util.Scanner;

public class Principal {
    static int sixeOfVector;
    static Producto[] cargarDatos;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que existen:");
        sixeOfVector = entrada.nextInt();

         cargarDatos = new Producto[sixeOfVector];

        for (int i = 0; i< cargarDatos.length; i++){
            cargarDatos[i] = new Producto();
            cargarDatos[i].cargar();
        }


        System.out.println("\n------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("Ahora calcularemos la cantidad promedia producida");
        System.out.println("\n------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        int sumatoria = 0;
        double promedio=65765;

        for (int i = 0; i < cargarDatos.length; i++) {
            sumatoria += cargarDatos[i].getCantiProducida();
            System.out.println(cargarDatos[i].getCantiProducida());

            System.out.println(sumatoria);
        }
        System.out.println(sumatoria);
        promedio = (double) sumatoria / (double)cargarDatos.length;

        System.out.println("el promedio es: " + promedio);


    }

}
