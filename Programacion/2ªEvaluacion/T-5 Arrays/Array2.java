import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Ejercicio1();

        Ejercicio2();

        Ejercico3();

        Ejercicio4();

        Ejercico5();

    }
    public static void Ejercicio1() {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[100];

        int[] edades = new int[100];

        int contador = 0;

        System.out.println("Introduce nombre y edad de alumno ");
        while (true) {

            System.out.print("Nombre: ");

            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {

                break;

            }


            System.out.print("Edad: ");

            int edad = scanner.nextInt();

            scanner.nextLine();

            nombres[contador] = nombre;
            edades[contador] = edad;
            contador++;
        }

        System.out.println("Mayores de edad:");

        for (int i = 0; i < contador; i++) {

            if (edades[i] >= 18) {

                System.out.println(nombres[i] + " - Edad -  " + edades[i]);
            }
        }

        int mayorEdad = 0;

        for (int i = 0; i < contador; i++) {

            if (edades[i] > mayorEdad) {

                mayorEdad = edades[i];
            }
        }

        System.out.println("Alumnos con la mayor edad (" + mayorEdad + " años):");

        for (int i = 0; i < contador; i++) {

            if (edades[i] == mayorEdad) {

                System.out.println(nombres[i]);
            }
        }
    }

    public static void Ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        double[] tempMinimas = new double[5];
        double[] tempMaximas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: ");
            tempMinimas[i] = scanner.nextDouble();
            System.out.print("Día " + (i + 1) + " - Temperatura máxima: ");
            tempMaximas[i] = scanner.nextDouble();
        }

        System.out.println("Temperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double tempMedia = (tempMinimas[i] + tempMaximas[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + tempMedia);
        }

        double menorTemp = Double.MAX_VALUE;
        System.out.println("Días con menos temperatura:");
        for (int i = 0; i < 5; i++) {
            if (tempMinimas[i] < menorTemp) {
                menorTemp = tempMinimas[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (tempMinimas[i] == menorTemp) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("Introduce una temperatura máxima: ");
        double tempBuscada = scanner.nextDouble();
        boolean encontrado = false;
        System.out.println("Días con temperatura máxima de " + tempBuscada + ":");
        for (int i = 0; i < 5; i++) {
            if (tempMaximas[i] == tempBuscada) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay días con esa temperatura máxima.");
        }
    }

    public static void Ejercico3() {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        System.out.println("Suma de elementos de cada fila:");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("Suma de elementos de cada columna:");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
    }

    public static void Ejercicio4() {
        int[][] diagonal = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        System.out.println("Contenido de la tabla:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Ejercico5() {
        int[][] marco = new int[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println();
        }
    }

}
