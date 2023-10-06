import java.util.Scanner;

public class TareaScanner {
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
    public static void ejercicio3 (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 3- Introduce Hora");
        int H = sc.nextInt();
        System.out.println(" 3- Introduce Minutos");
        int M = sc.nextInt();
        System.out.println(" 3- Introduce Segundos");
        int S = sc.nextInt();
        if (H<=24 && M<=60 && S<=60 ){
            System.out.println("Hora correcta");
        }

        else
            System.out.println("La hora no es válida");
    }
    public static void ejercicio4 (){  Scanner sc = new Scanner(System.in);
        System.out.println("Introduce mes");
        int mes = sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero 31");
                break;
            case 2:
                System.out.println("Febrero 28");
                break;
            case 3:
                System.out.println("Marzo 31");
                break;
            case 4:
                System.out.println("Abril 30");
                break;
            case 5:
                System.out.println("Mayo 31");
                break;
            case 6:
                System.out.println("Junio 30");
                break;
            case 7:
                System.out.println("Julio 31");
                break;
            case 8:
                System.out.println("Agosto 31");
                break;
            case 9:
                System.out.println("Septiembre 30");
                break;
            case 10:
                System.out.println("Octubre 31");
                break;
            case 11:
                System.out.println("Noviembre 30");
                break;
            case 12:
                System.out.println("Diciembre 31");
                break;
        }}
    public static void ejercicio5 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nota 1ª evaluacion");
        int eva1 = sc.nextInt();
        System.out.println("Introduce nota 2ª evaluacion ");
        int eva2 = sc.nextInt();
        System.out.println("Introduce nota 3ª evaluacion ");
        int eva3 = sc.nextInt();
        if (eva1<5 || eva2<5 || eva3<5 ){
            System.out.println("No se puede hacer media");
        }
        else
            System.out.println("La media es " +(eva1+eva2+eva3)/3);
    }
    public static void ejercicio6 (){Scanner sc = new Scanner(System.in);
        System.out.println("Introduce horas trabajadas");
        int Horas =sc.nextInt();
        System.out.println(Horas);
        int suma =  ((Horas-150 )*20 )+( 150 * 10);
        if (Horas> 150)
            System.out.println("has cobrado "+suma);

        else if (Horas<=150){
            System.out.println("has cobrado " +Horas*10);
        }}
    public static void ejercicio7 (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce numero ");
        int numero = sc.nextInt();
        if (numero%2 ==0){
            System.out.println("El resultado es par");
        }
        else
            System.out.println("Es impar");

    }
    public static void ejercicio8 (){
        Scanner sc =new Scanner(System.in);
        System.out.println("introduce numero del 0-10");
        int numero = sc.nextInt();
        switch (numero){
            case 0 :
                System.out.println("Cero");
                return;
            case 1 :
                System.out.println("Uno");
                return;
            case 2 :
                System.out.println("Dos");
                return;
            case 3 :
                System.out.println("Tres");
                return;
            case 4 :
                System.out.println("Cuatro");
                return;
            case 5 :
                System.out.println("Cinco");
                return;
            case 6 :
                System.out.println("Seis");
                return;
            case 7 :
                System.out.println("Siete");
                return;
            case 8 :
                System.out.println("Ocho");
                return;
            case 9 :
                System.out.println("Nueve");
                return;
            case 10 :
                System.out.println("Diez");
                return;
        }
    }
    public static void ejercicio9 () {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un número entre el 0 al 10 ");
        String num = sc.nextLine();

        switch(num) {
            case "cero":
                System.out.println("0"); ;
                break;

            case "uno":
                System.out.println("1");
                break;

            case "dos":
                System.out.println("2");
                break;

            case "tres":
                System.out.println("3");
                break;

            case "cuatro":
                System.out.println("4");
                break;

            case "cinco":
                System.out.println("5");
                break;

            case "seis":
                System.out.println("6");
                break;

            case "siete":
                System.out.println("7");
                break;

            case "ocho":
                System.out.println("8");
                break;

            case "nueve":
                System.out.println("9");
                break;

            case "diez":
                System.out.println("10");
                break;


        }
    }

    public static void ejercicio10 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce año");
        int ano = sc.nextInt();
        if (ano % 4 ==0){
            System.out.println("Este año es bisiesto");
        }
        else
            System.out.println("Este año no es bisiesto");
    }
}
