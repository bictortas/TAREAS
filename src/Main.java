import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TAREA 8. CÁLCULO DE LA DISTANCIA Y ÁNGULO ENTRE DOS PUNTOS

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las coordenadas del primer punto: ");
        double xUno = sc.nextDouble();
        double yUno  = sc.nextDouble();

        System.out.println("Ingresa las coordenadas del segundo punto: ");
        double xDos = sc.nextDouble();
        double yDos = sc.nextDouble();

        //DISTANCIA ENTRE LOS PUNTOS
        System.out.println("La distancia entre los puntos (x1,y1), (x2,y2) es: ");
        double ladoUno = Math.pow(xDos - xUno , 2) + Math.pow(yDos - yUno, 2);
        double ladoRaizUno = Math.sqrt( ladoUno);
        System.out.println(ladoRaizUno );
        System.out.println("\n");

        //Ángulo entre la línea que une los dos puntos y el eje x
        System.out.println("Ángulo en radianes: ");
        double numeradorUno = yDos - yUno;
        double denominadorUno = xDos - xUno;
        double anguloUno = Math. atan2(numeradorUno, denominadorUno);
        System.out.println(anguloUno + " " + "radianes");
        System.out.println("\n");

        //CONVERSIÓN RADIANES A GRADOS
        System.out.println("Ángulo en grados: ");
        double grados = Math.toDegrees(anguloUno);
        System.out.println(grados + " " + "grados");

        //FIN














    }
}