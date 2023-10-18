import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ejecicio para realizar:");
        System.out.println("Ejercicio 1. Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.\n" +
                "\n" +
                "Ejercicio 2. Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.\n" +
                "\n" +
                "Ejercicio 3. Escribe un programa que pida una frase. El programa mostrará por pantalla cada letra de la frase en una línea distinta.\n" +
                "\n" +
                "Ejercicio 4. Escribe un programa que pida el limite inferior y superior de un intervalo.  Si el límite inferior es mayor que el superior lo tiene que volver a pedir.  A continuación se van introduciendo números hasta que introduzcamos el 0. \n" +
                "Cuando termine el programa dará las siguientes informaciones\n" +
                "– La suma de los números que están dentro del intervalo (intervalo abierto).\n" +
                "– Cuantos números están fuera del intervalo.\n" +
                "– Informa si hemos introducido algún número igual a los límites del intervalo.\n" +
                "\n" +
                "Ejercicio 5. Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). \n" +
                "El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
        }
    }
    public static void ejercicio1(){
        int segundos = 0;
        int minutos = 0;
        int horas = 0 ;


        for(horas = 0; horas<24; horas++) {
            for(minutos=0; minutos<60; minutos++) {
                for(segundos=0; segundos<60; segundos++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                }

            }

            System.out.println("Tiempo transcurrido: " + segundos + " segundos");
        }
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce  base ");
        int base = sc.nextInt();

        System.out.print("Introduce el exponente ");
        int exponente = sc.nextInt();

        int resultado = base;

        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de multiplicar "  + resultado);

    }

    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Introduce  frase  ");
        String frase = sc.nextLine();

        for (char letra : frase.toCharArray()) {
            System.out.println(letra);
        }



    }
    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el limite inferior");
        int limInferior = sc.nextInt();
        System.out.println("Introduce el limite superior");
        int limSuperior = sc.nextInt();
        int sumaIntervalo = 0;
        int contadorFuera = 0;

        while (limInferior > limSuperior) {
            limSuperior = sc.nextInt();
            limInferior = sc.nextInt();
        }

        System.out.println("El interalo es "+limInferior+","+limSuperior);
        int numero = sc.nextInt();

        while (numero != 0) {

            if ((numero > limInferior) && (numero < limSuperior)) {
                sumaIntervalo = sumaIntervalo + numero;
                System.out.println("El numero está dentro del intervalo");
            }

            else{
                System.out.println("El numero está fuera del intervalo");
                contadorFuera++;

                if ((numero == limInferior) || (numero == limSuperior)) {
                    System.out.println("El número introducido coincide con uno de los límites");
                }
            }
            numero = sc.nextInt();
        }
        System.out.println("La suma de los números en el intervalo es "+ sumaIntervalo+ " la cantidad de números fuera del intervalo es "+ contadorFuera);
    }


    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int valorEntero = (int) (Math.floor(Math.random()*(1-100+1)+100));
        int contador = 10;
        double introducir = 0;

        while (contador > 0) {
            System.out.println("Introduce un número");
            introducir = sc.nextInt();
            if (introducir > valorEntero) {
                System.out.println("El numero es menor");
                contador--;
            } else {
                if (introducir < valorEntero) {
                    System.out.println("El numero es mayor");
                    contador--;
                } else {
                    int intentos = 10 - contador;
                    System.out.println("Has acertado en " + intentos + " intentos.");

                }
            }
        }
    }
}
