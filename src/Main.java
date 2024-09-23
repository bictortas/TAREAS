public class Main {
    public static void main(String[] args) {

        //TAREA 10

        // MOSTRAR LONGITUD
        String palabra ="supercalifragilisiticoespialidoso";
        int longitud = palabra.length();
        System.out.println("Palabra : " + palabra);
        System.out.println("Longitud de la palabra: "+ longitud);

        //CARÁCTER POSICIÓN 10
        char posDiez = palabra.charAt(10);
        System.out.println("El carácter en la posición 10 es: " + posDiez);

        //CONVERTIR A MAYÚSCULAS
        String mayusculas = palabra.toUpperCase();
        System.out.println("Palabra en mayúscualas: " + mayusculas);

        //SUBCADENA
        String subcadena = palabra.substring(5 , 16);
        System.out.println("Subcadena 5-15 : " +subcadena);

        //PRIMERA OCURRENCIA DE LA LETRA I
        int primeraOcu = palabra.indexOf('i');
        System.out.println("Primera ocurrencia de la letra i: " + primeraOcu);

        //ULTIMA OCURRENCIA DE LA LETRA O
        int ultimaOcu = palabra.lastIndexOf('o');
        System.out.println("L última ocurrencia de la letra o: " + ultimaOcu);

        //CONVERTIR A MINÚSCULAS
        String minusculas = palabra.toLowerCase();
        System.out.println("Palabra en minúculas: " + minusculas);

        //SUBCADENA POSICIÓN 7 AL FINAL
        String subcadenaDos = palabra.substring(7);
        System.out.println("Subcadena 7 al final : " +subcadenaDos);

        //ÚLTIMA OCURRENCIA DE LA FRASE LI
        int ultimaOcuDos = palabra.lastIndexOf("li");
        System.out.println("La ultima ocurrencia de la frase li: " + ultimaOcuDos);

        //FIN












    }
}