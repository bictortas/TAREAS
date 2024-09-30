public class Main {
    public static void main(String[] args) {
        //TAREA 13

        String producto ="12345;Laptop HP Pavilion;1500.99;Electronica";
        System.out.println("Nombre del producto:" + producto);

        //LONGITUD
        int prodLong = producto.length();
        System.out.println("Longitud de la cadena:" + prodLong);

        //ID
        String id = producto.substring(0,5);
        System.out.println("ID del producto:" + id);

        //NOMBRE DEL PRODUCTO
        String nombre = producto.substring(6,24);
        System.out.println("Nombre del producto:" + nombre);

        //NOMBRE EN MAYÚSCULAS
        String mayusculas = nombre.toUpperCase();
        System.out.println("Nombre del producto en mayúsculas: "+ mayusculas);

        //PRECIO DEL PRODUCTO
        String precio = producto.substring(25,32);
        System.out.println("Precio del producto:" + precio);

        //CARACTER EN LA POSICIÓN 10
        char posDiez = nombre.charAt(10);
        System.out.println("Caracter en la posición 10 del nombre:" + posDiez);

        //PRIMERA OCURRENCIA DE a
        int primeraOcurrencia = nombre.indexOf("a");
        System.out.println("Primera ocurrencia de a en el nombre: " + primeraOcurrencia);

        //ULTIMA OCURRENCIA DE 0
        int ultimaOcurrencia = nombre.lastIndexOf("o");
        System.out.println("Última ocurrencia de o en el nombre: " + ultimaOcurrencia);

        //PRECIO Y CATEGORÍA
        String categoria = producto.substring(33,44);
        System.out.println("Precio y categoría:" + precio + "-" + categoria);

        //SUBCADENA DESDE LA POSICIÓN 7
        String posSiete = nombre.substring(7);
        System.out.println("Subcadena desde la posición 7 del nombre: " + posSiete);

        //FIN






    }
}