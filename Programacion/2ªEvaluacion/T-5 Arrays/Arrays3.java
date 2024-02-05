import java.util.Random;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();

    }

    public static void Ejercicio1() {
        int[] array;


         Random random = new Random();
        array = new int[5];

        for (int i = 0; i < array.length; i++) {

        }

        System.out.println("[" + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4] + "]");
    }
    public static  void Ejercicio2 () {
        Scanner sc = new Scanner(System.in);


        String[] nombres;
        double[][] kms;


        System.out.print("Ingrese el número de conductores: ");
        int numConductores = sc.nextInt();


        nombres = new String[numConductores];
        kms = new double[numConductores][7];


        for (int i = 0; i < numConductores; i++) {
            sc.nextLine();
            System.out.print(" nombre del conductor : ");
            nombres[i] = sc.nextLine();

            for (int j = 0; j < 7; j++) {

                System.out.print("Ingrese los kilómetros por dia : ");

                kms[i][j] = sc.nextDouble();
            }
        }


        double[] total_kms = new double[numConductores];
        for (int i = 0; i < numConductores; i++) {
            double totalConductor = 0;
            for (int j = 0; j < 7; j++) {
                totalConductor += kms[i][j];
            }
            total_kms[i] = totalConductor;
        }


        System.out.println("Lista de conductores y kilómetros:");

        for (int i = 0; i < numConductores; i++) {
            System.out.println("Conductor: " + nombres[i] + ", Kilómetros totales: " + total_kms[i]);
        }

    }
    public static  void Ejercicio3 () {
        Scanner scanner = new Scanner(System.in);


        double[][] precios = new double[5][4];
        int[][] cantidades = new int[5][4];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el precio del artículo " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                precios[i][j] = scanner.nextDouble();

                System.out.print("Ingrese la cantidad vendida del artículo " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Cantidades totales de cada artículo:");

        for (int i = 0; i < 5; i++) {

            int cantidadTotalArticulo = 0;

            for (int j = 0; j < 4; j++) {

                cantidadTotalArticulo += cantidades[i][j];

            }
            System.out.println("Artículo " + (i + 1) + ": " + cantidadTotalArticulo);
        }


        System.out.println("Cantidad de artículos en la sucursal 2:");

        int cantidadSucursal2 = 0;

        for (int i = 0; i < 5; i++) {

            cantidadSucursal2 += cantidades[i][1];

        }
        System.out.println("En la sucursal 2: " + cantidadSucursal2);




        System.out.println("Recaudación total de cada sucursal:");

        for (int j = 0; j < 4; j++) {
            double recaudacionTotalSucursal = 0;
            for (int i = 0; i < 5; i++) {
                recaudacionTotalSucursal += precios[i][j] * cantidades[i][j];
            }
            System.out.println("Sucursal " + recaudacionTotalSucursal);
        }

        System.out.println("Recaudación total de la empresa:");

        double recaudacionTotalEmpresa = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                recaudacionTotalEmpresa += precios[i][j] * cantidades[i][j];
            }
        }
        System.out.println(recaudacionTotalEmpresa);


        System.out.println("    Sucursal de mayor recaudación:");

        double maxRecaudacion = 0;
        int sucursalMaxRecaudacion = -1;

        for (int j = 0; j < 4; j++) {
            double recaudacionSucursal = 0;
            for (int i = 0; i < 5; i++) {
                recaudacionSucursal += precios[i][j] * cantidades[i][j];
            }
            if (recaudacionSucursal > maxRecaudacion) {
                maxRecaudacion = recaudacionSucursal;
                sucursalMaxRecaudacion = j + 1;
            }
        }

        System.out.println("Sucursal " + sucursalMaxRecaudacion);
    }
    public static  void  Ejercicio4 (){
        Scanner scanner = new Scanner(System.in);


        String[] equipos = new String[15];
        int[][] resultados = new int[15][2];


        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el nombre del equipo local del partido ; ");
            equipos[i] = scanner.nextLine();

            System.out.print("Ingrese el nombre del equipo visitante del partido ;");
            equipos[i] += " vs " + scanner.nextLine();

            System.out.print("Ingrese el número de goles del equipo local en el partido ; ");
            resultados[i][0] = scanner.nextInt();

            System.out.print("Ingrese el número de goles del equipo visitante en el partido ; ");
            resultados[i][1] = scanner.nextInt();


        }


        System.out.println("Quiniela ");

        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ": " + equipos[i] + " - Resultado: " +
                    resultados[i][0] + " - " + resultados[i][1]);
        }
    }
}
