public class Main {
    public static void main(String[] args) {

       //INPUT----------------

        String correo = "juan.perez@empresa.com";
        String fecha = "2023-04-15";
        String salario = "50000.75";

        //INDICES
        int indicePunto = correo.indexOf(".");
        int indiceArroba = correo.lastIndexOf("@");

        //Nombre y apellido
        String nombre = correo.substring(0, indicePunto);
        String apellido = correo.substring(indicePunto+1, indiceArroba);

        //invertir nombre
        String nombreInvertido = nombre.replace(nombre, apellido).replace("p", "/").replace("z","p").replace("/","z");
        String apellidoInvertido = apellido.replace(apellido, nombre).replace("j", "/").replace("u", "*").replace("a", "u").replace("n","j").replace("/", "n").replace("*","a");

        String restoCorreo = correo.substring(indiceArroba);
        String correoFinal = nombreInvertido + "." + apellidoInvertido + restoCorreo;



        //FECHA DE ASCENSO
        String numeroUno = fecha.substring(0,4);
        String numeroDos = fecha.substring(5,7);
        String numeroTres = fecha.substring(8,10);


        int ano = Integer.parseInt(numeroUno);
        int mes = Integer.parseInt(numeroDos);
        int dia = Integer.parseInt(numeroTres);

        int sumaFecha = ano + mes + dia;

        //SALARIO
        String primerParte = salario.substring(0,5);
        String segundaParte = salario.substring(6,8);

        double entero = Double.parseDouble(primerParte);
        double decimal = Double.parseDouble(segundaParte);

        double diferencia = Math.abs(entero - decimal);
        double sumaSalario = (diferencia + entero) + (diferencia + decimal);
        double multiplicacion = sumaSalario *2;


        System.out.println("Cadena final: "+ correoFinal + "/" + sumaFecha + "/" + multiplicacion);

        /*
        COMENTARIO: NO ENTENDÍ QUE OPERACIÓN REALIZAR
        EN EL PUNTO 3.
         */







    }
}