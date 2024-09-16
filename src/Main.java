import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Calculadora de Costos y Estadísticas de Múltiples Productos


       /*
       PRODUCTO UNO
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del primer producto: ");
        String nombreUno = sc.nextLine();

        System.out.println("Cantidad de productos :");
        int cantidadUno = sc.nextInt();

        System.out.println("Precio unitario del producto: ");
        double precioUno = sc.nextDouble();

        System.out.println("Ingresar porcentaje de descuento del producto (ejemplo: 0.10) : ");
        double descuentoUno = sc.nextDouble();

        System.out.println("Ingresar impuestos aplicables en porcentaje (ejemplo: 0.10) : ");
        double impuestosUno = sc.nextDouble();
        System.out.println("\n");

        //PRIMER PRODUCTO
        double precioSinUno = (cantidadUno * precioUno);
        double descuentoApli = (precioSinUno * descuentoUno);
        double precioConUno = (precioSinUno - descuentoApli);
        double totalImpuesUno = (precioConUno * impuestosUno);
        double totalUno = totalImpuesUno + precioConUno;


        /*
       PRODUCTO DOS
        */

        sc = new Scanner(System.in);

        System.out.println("Nombre del segundo producto: ");
        String nombreDos = sc.nextLine();

        System.out.println("Cantidad de productos :");
        int cantidadDos = sc.nextInt();

        System.out.println("Precio unitario del producto: ");
        double precioDos= sc.nextDouble();

        System.out.println("Porcentaje de descuento del producto: ");
        double descuentoDos = sc.nextDouble();

        System.out.println("Impuestos aplicables en porcentaje: ");
        double impuestosDos = sc.nextDouble();
        System.out.println("\n");

        double precioSinDos = (cantidadDos * precioDos);
        double descuentoApliDos = (precioSinDos * descuentoDos);
        double precioConDos = (precioSinDos - descuentoApliDos);
        double totalImpuesDos = (precioConDos * impuestosDos);
        double totalDos = totalImpuesDos + precioConDos;



          /*
       PRODUCTO TRES
        */

        sc = new Scanner(System.in);

        System.out.println("Nombre del tercer producto: ");
        String nombreTres = sc.nextLine();

        System.out.println("Cantidad de productos :");
        int cantidadTres = sc.nextInt();

        System.out.println("Precio unitario del producto: ");
        double precioTres= sc.nextDouble();

        System.out.println("Porcentaje de descuento del producto: ");
        double descuentoTres = sc.nextDouble();

        System.out.println("Impuestos aplicables en porcentaje: ");
        double impuestosTres = sc.nextDouble();
        System.out.println("\n");

        double precioSinTres = (cantidadTres * precioTres);
        double descuentoApliTres = (precioSinTres * descuentoTres);
        double precioConTres = (precioSinTres - descuentoApliTres);
        double totalImpuesTres = (precioConTres * impuestosTres);
        double totalTres = totalImpuesTres + precioConTres;


        /*
        RESUMEN DEL PEDIDO
         */

        //PRIMER PRODUCTO
        System.out.println("RESUMEN DE TU PEDIDO :");

        System.out.println("Primer Producto: " + nombreUno);
        System.out.println("Cantidad :" + cantidadUno);
        System.out.println( "Precio sin descuento: " + precioSinUno);
        System.out.println("El descuento aplicado es de: " + descuentoApli);
        System.out.println("Precio con descuento: " + precioConUno);
        System.out.println("Impuestos aplicados : " + totalImpuesUno);
        System.out.println("Precio total: " + totalUno);

        System.out.println("\n");

        //SEGUNDO PRODUCTO
        System.out.println("Segundo Producto: " + nombreDos);
        System.out.println("Cantidad :" + cantidadDos);
        System.out.println( "Precio sin descuento: " + precioSinDos);
        System.out.println("El descuento aplicado es de: " + descuentoApliDos);
        System.out.println("Precio con descuento: " + precioConDos);
        System.out.println("Impuestos aplicados : " + totalImpuesDos);
        System.out.println("Precio total: " + totalDos);
        System.out.println("\n");

        //TERCER PRODUCTO
        System.out.println("Tercer Producto: " + nombreTres);
        System.out.println("Cantidad :" + cantidadTres);
        System.out.println( "Precio sin descuento: " + precioSinTres);
        System.out.println("El descuento aplicado es de: " + descuentoApliTres);
        System.out.println("Precio con descuento: " + precioConTres);
        System.out.println("Impuestos aplicados : " + totalImpuesTres);
        System.out.println("Precio total: " + totalTres);
        System.out.println("\n");



        double totalAcum = (totalUno + totalDos + totalTres);

        System.out.println("Total a pagar : " + totalAcum);


        //FIN













    }
}