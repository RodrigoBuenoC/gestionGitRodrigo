 import java.util.Scanner;

    public class Tarea2 {
        public static void main(String[] args) {
            ejercicio1();
            System.out.println("");
            ejercicio2();
            System.out.println("");

            ejercicio3();
            System.out.println("");

            ejercicio4();
            System.out.println("");

            ejercicio5();
            System.out.println("");

        }
        public static void ejercicio1 () {
            Scanner sc =new Scanner(System.in);
            System.out.println("Introduce numero 1");
            int x = sc.nextInt();
            System.out.println("Introduce numero2");
            int y= sc.nextInt();
            System.out.println("La suma es "+ (x+y));
            System.out.println("La resta "+ (x-y));
            System.out.println("La multiplicacion es  "+ (x*y));


        }


        public static void ejercicio2 () {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce numero para hacer la raiz cuadrada");
            int numero = teclado.nextInt();
            double resultado = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es " + resultado);
        }


        public static void ejercicio3 () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce base");
            int base = sc.nextInt();
            System.out.println("Introduce exponente");
            int exponente = sc.nextInt();

            System.out.println(base + " elevado a " + exponente + " es igual a " +Math.pow(base,exponente));
        }


        public static void ejercicio4 () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce lo que mide el radio de un circulo");
            int radio = sc.nextInt();

            System.out.println("El area del circulo es" + Math.PI * (radio * radio));

        }
        public static void ejercicio5 () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce radio de circunferencia");
            int radio = sc.nextInt();
            System.out.println("La longitud de la circunferncia es " + (2 * Math.PI * radio));

        }
    }


