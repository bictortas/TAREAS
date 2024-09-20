import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //CALCULAR LONGITUD

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las coordenadas del primer punto: ");
        double xUno = sc.nextDouble();
        double yUno  = sc.nextDouble();

        System.out.println("Ingresa las coordenadas del segundo punto: ");
        double xDos = sc.nextDouble();
        double yDos = sc.nextDouble();

        System.out.println("Ingresa las coordenadas del tercer punto: ");
        double xTres = sc.nextDouble();
        double yTres = sc.nextDouble();

        System.out.println("Las longitudes de los lados son : ");
        double ladoAB = Math.sqrt(Math.pow( xDos - xUno, 2) + Math.pow( yDos - yUno, 2 ) );
        System.out.println("Lado AB: " + ladoAB);

        double ladoBC = Math.sqrt( Math.pow( xTres - xDos, 2) + Math.pow( yTres - yDos, 2 ) );
        System.out.println("Lado BC: " + ladoBC);

        double ladoCA = Math.sqrt( Math.pow( xUno - xTres, 2) + Math.pow( yUno- yTres, 2 ) );
        System.out.println("Lado CA: " + ladoCA);
        System.out.println("\n");

        //PERIMETRO

        double Perimetro = ladoAB + ladoBC + ladoCA;
        System.out.println("Perimetro: " + Perimetro);


        //SEMIPERIMETRO

        double s = ((ladoAB + ladoBC + ladoCA) / 2);

         //ÁREA

        double area = Math.sqrt(s * (s - ladoAB) * (s - ladoBC) * (s - ladoCA));
        System.out.println("Area: " + area);


        //ALTURA

        double altura = ((2 * area) / ladoAB);
        System.out.println("Altura: " + altura);
        System.out.println("\n");

        System.out.println("Los ángulos del triángulo son: ");
        //ÁNGULOS A
        double numeradorUno = Math.pow(ladoBC, 2) + Math.pow(ladoCA, 2) - Math.pow(ladoAB, 2);
        double dividendoUno = 2 * (ladoBC * ladoCA);
        double divisionA = numeradorUno / dividendoUno;
        double cosA = Math.acos(divisionA);
        double anguloA = Math.toDegrees(cosA);
        System.out.println("Angulo a: " + anguloA + " " + "grados");


        //ÁNGULO B
        double numeradorDos = Math.pow(ladoCA, 2) + Math.pow(ladoAB, 2) - Math.pow(ladoBC, 2);
        double dividendoDos = 2 * (ladoCA * ladoAB);
        double divisionB = numeradorDos / dividendoDos;
        double cosB = Math.acos(divisionB);
        double anguloB = Math.toDegrees(cosB);
        System.out.println("Angulo b: " + anguloB + " " + "grados");


        //ÁNGULO C
        double numeradorTres = Math.pow(ladoAB, 2) + Math.pow(ladoBC, 2) - Math.pow(ladoCA, 2);
        double dividendoTres = 2 * (ladoAB * ladoBC);
        double divisionC = numeradorTres / dividendoTres;
        double cosC = Math.acos(divisionC);
        double anguloC = Math.toDegrees(cosC);
        System.out.println("Angulo c: " + anguloC + " " + "grados");


        //TRIANGULO EQUILATERO

        double diferencia = Math.abs(ladoAB - ladoBC) + Math.abs(ladoBC - ladoCA) + Math.abs(ladoCA - ladoAB);
        System.out.println("Diferencia: " + diferencia);
        boolean equilatero = (diferencia == 0);
        System.out.println("\n");
        System.out.println("¿El triangulo es equilatero? : " + equilatero);
        System.out.println("\n");

        //PUNTO MEDIO AB

        double abCoordenadaUno = (xUno + xDos)/2;
        double abCoordenadaDos = (yUno + yDos)/2;
        System.out.println("El punto medio del lado AB es : " + abCoordenadaUno + ", " + abCoordenadaDos);

        //PUNTO MEDIO BC
        double bcCoordenadaUno = (xDos + xTres)/2;
        double bcCoordenadaDos = (yDos + yTres)/2;
        System.out.println("El punto medio del lado AB es : " + bcCoordenadaUno + ", " + bcCoordenadaDos);

        //PUNTO MEDIO BC
        double caCoordenadaUno = (xTres + xUno)/2;
        double caCoordenadaDos = (yTres + yUno)/2;
        System.out.println("El punto medio del lado AB es : " + caCoordenadaUno + ", " + caCoordenadaDos);

        //FIN














    }
}