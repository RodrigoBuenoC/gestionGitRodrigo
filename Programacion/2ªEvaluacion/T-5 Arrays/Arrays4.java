import java.util.Random;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Ejecicio1();
        Ejercicio2();
        Ejercicio3();
        Ejericio4();

    }

    public static void Ejecicio1() {
        int[][] matriz = new int[5][6];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                matriz[i][j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][5] += matriz[i][j];
                matriz[4][j] += matriz[i][j];
                matriz[4][5] += matriz[i][j];
            }
        }
    }

    public static void Ejercicio2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array");
        int tamanoArray = scanner.nextInt();


        int[] array = new int[tamanoArray];
        Random random = new Random();
        for (int i = 0; i < tamanoArray; i++) {
            array[i] = random.nextInt(300) + 1;
        }

        int digito;

        do {
            System.out.println("Ingrese el dígito ");
            digito = scanner.nextInt();
        } while (digito < 0 || digito > 9);

        int[] numerosFiltrados = (array);

        for (int numero : numerosFiltrados) {
            System.out.println(numero);
        }
    }

   public  static  void  Ejercicio3(){
       Scanner scanner = new Scanner(System.in);

       int[] array = new int[100];

       int cur = 0;

       System.out.println("Introduce números :");

       while (true) {
           int num = scanner.nextInt();

           if (num == 0) {
               break;
           }


           for (int i = cur; i > 0; i--) {
               array[i] = array[i - 1];
           }

           array[0] = num;


           if (cur< array.length - 1) {
               cur++;
           }
       }

       System.out.println("Contenido útil del array:");
       for (int i = 0; i < cur; i++) {
           System.out.print(array[i] + " ");
       }
   }

    public static void Ejericio4 (){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int[] array = new int[150];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) + 5;
        }

        System.out.println("Ingrese el número de iteraciones:");
        int numIteraciones = sc.nextInt();

        for (int iteracion = 0; iteracion < numIteraciones; iteracion++) {
            for (int i = 1; i < array.length - 1; i++) {
                array[i] = array[i - 1] + array[i + 1];
            }

        }
    }



    }




