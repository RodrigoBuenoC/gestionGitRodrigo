import java.sql.PreparedStatement;
import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        ejercicio1();

        System.out.println();

        ejercicio2();

        System.out.println();

        ejercicio3();

        System.out.println();

        ejercicio4();

        System.out.println();

    }
        public static  void ejercicio1 (){
        double nota1 = 5.25 ;
        double nota2 = 7.85 ;
        double nota3 = 3.4  ;

        System.out.println(" 1- La media del alumnos es " + (nota1+nota2+nota3)/3 + " pero reciben 1 punto mas a la media por un trabajo que hicieron  " + (1+(nota1+nota2+nota3)/3) );
        }

    public static void ejercicio2(){
        System.out.println(" 2- Introduce un numero ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int resultado = numero <<1;
        System.out.println(" 2- El resultado de " +numero+ " x 2 es    " +resultado );

    }
    public static void ejercicio3 (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 3- Introduce dividendo");
        int dividendo = sc.nextInt();
        System.out.println(" 3- Introduce divisor");
        int divisor = sc.nextInt();
        System.out.println(" 3- El resultado es " +dividendo/divisor+ " y su resto es  " + dividendo%divisor );
    }
    public static void ejercicio4 (){
        int Max = Integer.MAX_VALUE;
        System.out.println(" 4- El numero entero mas grande posible es " +Max);
    }
}


