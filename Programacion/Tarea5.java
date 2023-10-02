import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        ejercicio1();

        System.out.println();

        ejercicio2();

        System.out.println();

        ejercicio3();

        System.out.println();

        ejercicio4();

        System.out.println();

        ejercicio5();

        System.out.println();

        ejercicio6();

        System.out.println();

        ejercicio7();

        System.out.println();

        ejercicio8();

        System.out.println();

        ejercicio9();

        System.out.println();

        ejercicio10();

        System.out.println();

    }
        public static void ejercicio1 (){
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1-  Introduce un numero ");
            int numero = sc.nextInt();
        if (numero % 3==0){
            System.out.println("Es multiplo de 3");
        }
        else
            System.out.println("No es correcto");
        }
    public static void ejercicio2 (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 2- Introduce numero");
        int numero1 = sc.nextInt();
        System.out.println(" 2- Introduce numero");
        int numero2 = sc.nextInt();
        System.out.println(" 2- Introduce numero");
        int numero3 = sc.nextInt();
        int mayor =numero1 ;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El número mayor de los tres es: " + mayor);
    }
    public static void ejercicio3 (){}
    public static void ejercicio4 (){}
    public static void ejercicio5 (){}
    public static void ejercicio6 (){}
    public static void ejercicio7 (){}
    public static void ejercicio8 (){}
    public static void ejercicio9 (){}
    public static void ejercicio10 (){}
    }
