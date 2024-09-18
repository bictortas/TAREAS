public class Main {
    public static void main(String[] args) {

        //CÁLCULO DE ESTÁDISTICAS BÁSICAS

        /*
        LISTA DE NÚMEROS ALEATORIOS
         */

        System.out.println("LISTA DE NÚMEROS");
        System.out.println("\n");

        double numeroUno = Math.random() * 100;
        System.out.println(numeroUno);

        double numeroDos = Math.random() * 100;
        System.out.println(numeroDos);

        double numeroTres = Math.random() * 100;
        System.out.println(numeroTres);

        double numeroCuatro = Math.random() * 100;
        System.out.println(numeroCuatro);

        double numeroCinco = Math.random() * 100;
        System.out.println(numeroCinco);

        double numeroSeis = Math.random() * 100;
        System.out.println(numeroSeis);

        double numeroSiete = Math.random() * 100;
        System.out.println(numeroSiete);

        double numeroOcho = Math.random() * 100;
        System.out.println(numeroOcho);

        double numeroNueve = Math.random() * 100;
        System.out.println(numeroNueve);

        double numeroDiez = Math.random() * 100;
        System.out.println(numeroDiez);

        System.out.println("\n");


        /*
        RAÍCES CUADRADAS
         */

        System.out.println("RAÍCES CUADRADAS DE LOS NÚMEROS ALEATORIOS");
        System.out.println("\n");

        double raizUno = Math.sqrt(numeroUno);
        System.out.println(raizUno);

        double raizDos = Math.sqrt(numeroDos);
        System.out.println(raizDos);

        double raizTres = Math.sqrt(numeroTres);
        System.out.println(raizTres);

        double raizCuatro = Math.sqrt(numeroCuatro);
        System.out.println(raizCuatro);

        double raizCinco = Math.sqrt(numeroCinco);
        System.out.println(raizCinco);

        double raizSeis = Math.sqrt(numeroSeis);
        System.out.println(raizSeis);

        double raizSiete = Math.sqrt(numeroSiete);
        System.out.println(raizSiete);

        double raizOcho = Math.sqrt(numeroOcho);
        System.out.println(raizOcho);

        double raizNueve = Math.sqrt(numeroNueve);
        System.out.println(raizNueve);

        double raizDiez = Math.sqrt(numeroDiez);
        System.out.println(raizDiez);

        System.out.println("\n");

        /*
        POTENCIAS
         */

        System.out.println("ELEVACIÓN DE LOS NÚMEROS ALEATORIOS AL CUADRADO");
        System.out.println("\n");

        double potenciaUno = Math.pow(numeroUno, 2);
        System.out.println(potenciaUno);

        double potenciaDos = Math.pow(numeroDos, 2);
        System.out.println(potenciaDos);

        double potenciaTres = Math.pow(numeroTres, 2);
        System.out.println(potenciaTres);

        double potenciaCuatro = Math.pow(numeroCuatro, 2);
        System.out.println(potenciaCuatro);

        double potenciaCinco = Math.pow(numeroCinco, 2);
        System.out.println(potenciaCinco);

        double potenciaSeis = Math.pow(numeroSeis, 2);
        System.out.println(potenciaSeis);

        double potenciaSiete = Math.pow(numeroSiete, 2);
        System.out.println(potenciaSiete);

        double potenciaOcho = Math.pow(numeroOcho, 2);
        System.out.println(potenciaOcho);

        double potenciaNueve = Math.pow(numeroNueve, 2);
        System.out.println(potenciaNueve);

        double potenciaDiez = Math.pow(numeroDiez, 2);
        System.out.println(potenciaDiez);

        System.out.println("\n");

        /*
        MEDIA ARITMETICA
         */

        System.out.println("MEDIA");

        double media = (numeroUno + numeroDos + numeroTres + numeroCuatro + numeroCinco + numeroSeis + numeroSiete + numeroOcho + numeroNueve + numeroDiez) / 10;
        System.out.println(media);
        System.out.println("\n");

        /*
        DESVIACIÓN ESTÁNDAR
         */

        double diferenciaUno = Math.pow((numeroUno - media),2);
        double diferenciaDos = Math.pow((numeroDos - media),2);
        double diferenciaTres = Math.pow((numeroTres - media),2);
        double diferenciaCuatro = Math.pow((numeroCuatro - media),2);
        double diferenciaCinco = Math.pow((numeroCinco - media),2);
        double diferenciaSeis = Math.pow((numeroSeis - media),2);
        double diferenciaSiete = Math.pow((numeroSiete - media),2);
        double diferenciaOcho = Math.pow((numeroOcho - media),2);
        double diferenciaNueve = Math.pow((numeroNueve - media),2);
        double diferenciaDiez = Math.pow((numeroDiez - media),2);

        double numerador = diferenciaUno + diferenciaDos + diferenciaTres + diferenciaCuatro + diferenciaCinco + diferenciaSeis + diferenciaOcho + diferenciaSiete + diferenciaNueve + diferenciaDiez;
        double denominador = 10;

        double resultado =  Math.sqrt(numerador/denominador);

        System.out.println("LA DESVIACIÓN ESTÁNDAR ES: ");
        System.out.println(resultado);

        //FIN




    }
}