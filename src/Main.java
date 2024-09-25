public class Main {
    public static void main(String[] args) {

     String direccionCompleta = " Av. Libertador, 1234, Ciudad de México, C.P. 06000";
     System.out.println("Dirección Completa: " + direccionCompleta);

     //LONGITUD
     int longitud = direccionCompleta.length();
     System.out.println("La longitd de la direccipon es: " + longitud);

     //PRIMER CARACTER
     char primerCaracter = direccionCompleta.charAt(1);
     System.out.println("El primer caracter de la dirección es: " + primerCaracter);
     //ULTIMO CARACTER
     char ultimoCaracter = direccionCompleta.charAt(50);
     System.out.println("El ultimo caracter de la dirección es: " + ultimoCaracter);

     //DIRECCIÓN EN MAYUSCULAS
     String mayusculas = direccionCompleta.toUpperCase();
     System.out.println("Dirección en mayusculas: " + mayusculas);

     //DIRECCIÓN EN MINUSCULAS
     String minusculas = direccionCompleta.toLowerCase();
     System.out.println("Dirección en minusculas:" + minusculas);

     //CALLE
     String calle = direccionCompleta.substring(1, 15);
     System.out.println("Calle: " + calle);

     //NUMERO
     String numero = direccionCompleta.substring(17,21);
     System.out.println("Numero: " + numero);

     //CIUDAD
     String ciudad = direccionCompleta.substring(23,39);
     System.out.println("Ciudad: " + ciudad);

     //CODIGO POSTAL
     String codigoPostal = direccionCompleta.substring(46,51);
     System.out.println("Codigo Postal: " + codigoPostal);

     //LA PRIMERA APARICIÓN DE UN NÚMERO
     int primerNum = direccionCompleta.indexOf("1");
     System.out.println("la primera aparición de un número está en la posición: " + primerNum);

     //CORREGIR DIRECCIÓN
     String corregida = direccionCompleta.replace("," , " ").replace("." , " ");
     System.out.println("Dirección corregida : " + corregida);

     //DIRECCIÓN SIN ESPACIOS
     String sinEspacios = direccionCompleta.replace(" " , "").replace(" " , "");
     System.out.println("Dirección sin espacios : " + sinEspacios);

     //VERSION ABREVIADA
     String abreviada = direccionCompleta.substring(5).replace("Ciudad de" ,"");
     System.out.println("Versión abreviada de la dirección: " + abreviada);



    }
}