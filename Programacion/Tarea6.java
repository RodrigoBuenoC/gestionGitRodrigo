import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ejecicio para realizar:");
        System.out.println("Ejercicio 1\n" +
                "\n" +
                "Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.\n" +
                "\n" +
                "Ejercicio 2\n" +
                "\n" +
                "Pedir números hasta que se introduzca uno negativo, y calcular la media.\n" +
                "\n" +
                "Ejercicio 3\n" +
                "\n" +
                "Escribir todos los números del 100 al 0 de 7 en 7.\n" +
                "\n" +
                "Ejercicio 4\n" +
                "\n" +
                "Diseñar un programa que muestre el producto de los 10 primeros números impares.\n" +
                "\n" +
                "Ejercicio 5\n" +
                "\n" +
                "Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.\n" +
                "\n" +
                "Ejercicio 6\n" +
                "\n" +
                "Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.\n" +
                "\n" +
                "Ejercicio 7\n" +
                "\n" +
                "Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.\n" +
                "\n" +
                "Ejercicio 8\n" +
                "\n" +
                "Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.\n" +
                "\n" +
                "Ejercicio 9\n" +
                "\n" +
                "Escribe un programa que pida un número N y comprueba si es un número primo. Recuerda un número primo es aquel que solo se puede dividir entre el mismo y la unidad, en cualquier otro caso la división tiene decimales.\n" +
                "\n" +
                " Ejercicio 10\n" +
                "\n" +
                "Realiza el control de acceso a una caja fuerte. La combinación será un número de cuatro cifras. El programa nos pide la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Clave incorrecta le quedan x intentos”, si agota los intentos mostrará el mensaje “Lo siento has agotado las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja fuerte”.\n" +
                "\n");
        int opcion = sc.nextInt();
        switch (opcion){
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
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
            case 10:
                ejercicio10();
                break;
        }


    }

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println(" 1- Introduzca un número (negativo para salir): " );
            numero= sc.nextInt();
            if (numero >= 0) {

                System.out.println("El cuadrado de " + numero + " es " +numero*numero);
            }
        } while (numero >= 0);
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int contador= 0;
        int numero ;
        do {
            System.out.println(" 2- Introduzca un número (negativo para calcular la media): ");
            numero=sc.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }

    public static void ejercicio3(){
        System.out.println(" 3- Numero de 7 en 7 (100-0) ");
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
    }

    public static void  ejercicio4(){
        System.out.println(" 4- programa que muestre el producto de los 10 primeros números impares");
        for (int i = 19; i >= 1; i -= 2) {
            System.out.println(i);
        }
    }

    public static void  ejercicio5(){

    }
    public static void  ejercicio6(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 6- Introduce numero del 1 al 10");
        int numero = sc.nextInt();
        if (numero <=10 &&  numero>=1){
            System.out.println(numero*1);
            System.out.println(numero*2);
            System.out.println(numero*3);
            System.out.println(numero*4);
            System.out.println(numero*5);
            System.out.println(numero*6);
            System.out.println(numero*7);
            System.out.println(numero*8);
            System.out.println(numero*9);
            System.out.println(numero*10);
        }
        else
            System.out.println("no esta entre el 1 y el 10");
    }

    public static void ejercicio7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de sueldos: ");
        int n = scanner.nextInt();


        double sueldoMaximo = Double.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo #" + (i + 1) + ": ");
            double sueldo = scanner.nextDouble();


            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }
    }

    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 8- Introduce numero para adivinar");
        int numero = sc.nextInt();
        System.out.println("Adivina el numero metido anteriormente");

        int intento = sc.nextInt();
        while (intento != numero) {
            if (intento < numero) {
                System.out.println("ERROR,es mas alto");
                intento = sc.nextInt();
            } else if (intento > numero) {
                System.out.println("ERROR, es mas bajo");
                intento = sc.nextInt();
            }
            else if (intento ==numero)
                System.out.println("Has acertado");


        }
    }

    public static void  ejercicio9(){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println(" 9- Introduzca un número para verificar si es primo: ");
        numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static void  ejercicio10(){
        Scanner sc = new Scanner(System.in);
        int contraseña = 3333 ;
        int intentosRestantes = 4;
        int intento;
        do {
            System.out.println(" 10- Introduzca la combinación de la caja fuerte (4 cifras): ");
            intento = sc.nextInt();
            if (intento != contraseña) {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Clave incorrecta. Le quedan " + intentosRestantes + " intentos.");
                } else {
                    System.out.println("Lo siento  has agotado las 4 oportunidades.");
                }
            }
        } while (intento != contraseña && intentosRestantes > 0);

        if (intento == contraseña) {
            System.out.println("Has acertado la contraseña");
        }

    }

}
