/*
Se necesita codificar un programa en Java, donde realice una clase llamada Producto
        con los atributos: Descripción de cada producto, el precio de venta unitario y el costo
        unitario, en Bs y la cantidad producida.
        Debe también codificarle a la clase métodos: constructores (por defecto y paramétrico),
        métodos getter, métodos setter, método cargar, método mostrar.
*/

import java.util.Scanner;

public class Producto {
    String DescripcionProducto;
    double precioVenta;
    double precioPorUnidad;
    int cantiProducida;

    //constructores

    public Producto() {
        DescripcionProducto = "";
        this.precioVenta = 0;
        this.precioPorUnidad = 0;
        this.cantiProducida = 0;
    }

    public Producto(String descripcionProducto, double precioVenta, double precioPorUnidad, int cantiProducida) {
        DescripcionProducto = descripcionProducto;
        this.precioVenta = precioVenta;
        this.precioPorUnidad = precioPorUnidad;
        this.cantiProducida = cantiProducida;
    }

    //getters

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public int getCantiProducida() {
        return cantiProducida;
    }

    //setters

    public void setDescripcionProducto(String descripcionProducto) {
        DescripcionProducto = descripcionProducto;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public void setCantiProducida(int cantiProducida) {
        this.cantiProducida = cantiProducida;
    }

    //metodos
    //EL WARNING DE ESTA FUNCION ME PREOCUPA
    public Producto cargar(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba la descripcion del producto");
        DescripcionProducto = entrada.nextLine();

        System.out.println("Digite el precio de venta por unidad");
        precioVenta = entrada.nextDouble();

        System.out.println("Digite el cossto de producto por unidad");
        precioPorUnidad = entrada.nextDouble();

        System.out.println("digite la cantidad producida de " + DescripcionProducto);
        cantiProducida = entrada.nextInt();

        return new Producto(DescripcionProducto,precioVenta,precioPorUnidad,cantiProducida);
    }

    public void mostrar(){
        System.out.println("salu2 a whelee");
    }
}
