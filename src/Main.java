import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        DOMICILIO
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu colonia/avenida : ");
        String colonia = sc.nextLine();

        System.out.println("Calle :");
        String calle = sc.nextLine();

        System.out.println("Número exterior :");
        String numero = sc.nextLine();

        System.out.println("Código Postal :");
        int postal = sc.nextInt();

        System.out.println("Tu domicilio es :" + " / " + colonia + " / " + calle + " / " + "Num"+ " " + numero + " / " + postal + "\n");

        /*
        DATOS ACADÉMICOS
         */

        sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu primaria : ");
        String primaria = sc.nextLine();

        System.out.println("Promedio: ");
        double promUno = sc.nextDouble();

        sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu Secundaria : ");
        String secundaria = sc.nextLine();

        System.out.println("Promedio: ");
        double promDos = sc.nextDouble();

        sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu Preparatoria : ");
        String prepa = sc.nextLine();

        System.out.println("Promedio: ");
        double promTres = sc.nextDouble();

        System.out.println("Primaria : " + primaria + "   " +  "Egresado con: " + promUno);
        System.out.println("Secundaria : " + secundaria + "   " +  "Egresado con: " + promDos);
        System.out.println("Preparatoria : " + prepa + "   " + "Egresado con: " + promTres + "\n"); //



        /*
        DEPORTE FAOVRITO
         */

        sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu deporte favorito : ");
        String deporte = sc.nextLine();

        System.out.println("Se juega con : ");
        String material = sc.nextLine();

        System.out.println("Lugar de origen: ");
        String origen = sc.nextLine();

        System.out.println("Jugadores por equipo: ");
        int equipos = sc.nextInt();

        System.out.println("Tu deporte favorito es: " + deporte + " \n  " +  "Se juega con: " + material + " \n " + "El deporte nació en: " + origen + " \n " + "Cada equipo juega con: " + equipos + "Jugadores en cada equipo" + "\n");

        /*
        FIN
         */





















    }
}