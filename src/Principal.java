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
            cargarDatos[i].mostrar();
        }


        System.out.println("------------------------------------------------------\n");
        System.out.println("Ahora calcularemos la cantidad promedia producida");
        System.out.println("\n------------------------------------------------------");

        int sumatoria = 0;
        double promedio, costoTotal=0,ventas_Total=0;


        for (Producto iterador : cargarDatos) {
            sumatoria += iterador.getCantiProducida();
            costoTotal += iterador.precioPorUnidad * iterador.cantiProducida;
            ventas_Total += iterador.precioVenta * iterador.cantiProducida;
        }
        System.out.println(sumatoria);
        promedio = (double) sumatoria / (double)cargarDatos.length;

        System.out.println("el promedio es: " + promedio);


        System.out.println("------------------------------------------------------\n");
        System.out.println("Ahora Calcularemos el total en Bs. que se encuentra en Almacén, debido a la producción del último mes. ");
        System.out.println("\n------------------------------------------------------");

        System.out.println("EL total en bs en producicon del ultimo mes es de:" + costoTotal);

        System.out.println("------------------------------------------------------\n");
        System.out.println(" toda la producción del último mes se vendió?(si/no)");
        String resp = entrada.nextLine();
        System.out.println("\n------------------------------------------------------");

        if (resp.equals("si")){
            System.out.println("las ganancias para la empresa son de: " + (ventas_Total-costoTotal));
        }





    }

}
