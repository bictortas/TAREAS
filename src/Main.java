public class Main {
    public static void main(String[] args) {

        //TAREA 11 GARCÍA,JUAN CARLOS

        //LONGITUD DEL NOMBRE
        String nombre = "García, Juan Carlos";
        int longitudCompleto = nombre.length();
        System.out.println("Nombre: " + nombre);
        System.out.println("Longitud del nombre: " + longitudCompleto);

        //APELLIDO
        String apellido = nombre.substring(0,6);
        System.out.println("Apellido:" +apellido);


        //NOMBRE SIN APELLIDO
        String sinApe = nombre.substring(8,19);
        System.out.println("Nombre sin apellido: " + sinApe);

        //PRIMER APELLIDO
        String primerNom = nombre.substring(8,12);
        System.out.println("Primer nombre: " + primerNom);

        //APELLIDO EN MAYÚSCULAS
        String apeMayu = apellido.toUpperCase();
        System.out.println("Apellido en mayusculas: " + apeMayu);

        //NOMBRE COMPLETO EN MINÚSCULAS
        String nomMin = nombre.toLowerCase();
        System.out.println("Nombre en minusculas: " + nomMin);

        //POSICIÓN 5
        char posCinco = nombre.charAt(5);
        System.out.println("Carácter en la posición 5: " + posCinco);

        //PRIMERA OCURRECNIA DE a
        int primeraOcu = nombre.indexOf("a");
        System.out.println("Primera ocurrencia de la letra a: " + primeraOcu);

        //ÚLTIMA OCURRENCIA DE a
        int ultimaOcu = nombre.lastIndexOf("a");
        System.out.println("Última ocurrencia de la letra a: " + ultimaOcu);

        //FIN



    }
}