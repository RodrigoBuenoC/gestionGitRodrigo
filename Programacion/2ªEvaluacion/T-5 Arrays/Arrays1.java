import java.util.Random;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
        Ejercicio5();
    }

    public static void Ejercicio1() {
        Random random = new Random();

        int vector_numeros[];

        vector_numeros = new int[10];
        int valor = 0;
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = random.nextInt(10) + 1;
            vector_numeros[i] = numero;
            valor = vector_numeros[i];
        }

        for (int i : vector_numeros) {
            System.out.println(i + " -----cuadrado----- " + i * i + "-----cubo---------" + i * i * i);
        }

    }

    public static void Ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        String[] vector = new String[5];

        System.out.println("Introduce 5 cadenas de caracteres ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextLine();
        }

        String[] vectorInverso = new String[5];
        for (int i = 0; i < vector.length; i++) {
            vectorInverso[i] = vector[vector.length - 1 - i];
        }

        System.out.println("Al reves :");
        for (String cadena : vectorInverso) {
            System.out.println(cadena);
        }
    }

    public static void Ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[5];

        System.out.println("Introduce 5 notas del 0 al 10");

        for (int i = 0; i < notas.length; i++) {

            notas[i] = scanner.nextInt();

        }

        int suma = 0;

        int maxNota = notas[0];

        int minNota = notas[0];

        System.out.println("Notas:");

        for (int nota : notas) {

            System.out.println(nota);

            suma += nota;

            if (nota > maxNota) {

                maxNota = nota;
            }
            if (nota < minNota) {
                minNota = nota;
            }
            System.out.println("Nota media: " + maxNota/minNota);
            System.out.println("Nota más alta: " + maxNota);
            System.out.println("Nota más baja: " + minNota);
        }
    }
    public static void  Ejercicio4 (){

        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[10];

        int contador = 0;

        System.out.println("Introduce números");

        while (contador < vector.length) {

            int numero = scanner.nextInt();

            if (numero < 0) {

                break;
            }

            vector[contador] = numero;

            contador++;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(vector[i]);
        }

    }
    public static void Ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("VALORES PARA 1 ");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("VALORES PARA 2");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("VECTOR 3 = ");
        for (int valor : vector3) {
            System.out.println(valor);
        }
    }
    }



