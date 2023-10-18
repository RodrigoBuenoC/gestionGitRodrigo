import java.util.Scanner;

public class TareaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ejercicio que quieras realizar");
        System.out.println("Ejercicio 1\n" +
                "\n" +
                "Escribe un programa que pida un número y diga si es o no múltiplo de 3.");
        System.out.println("Ejercicio 2\n" +
                "\n" +
                "Escribe un programa que lee por teclado tres números enteros y calcula y muestra el mayor de los tres.");
        System.out.println("Ejercicio 3\n" +
                "\n" +
                "Escribe un programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.\n" +
                "\n" +
                "Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos");
        System.out.println("Ejercicio 4\n" +
                "\n" +
                "Escribe un programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes.");
        System.out.println("Ejercicio 5\n" +
                "\n" +
                "Escribe un programa que pida la nota de las tres evaluaciones, y si están aprobadas realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si no, escribe que evaluación debe recuperar.");
        System.out.println("Ejercicio 6\n" +
                "\n" +
                "Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el número de horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir de ahí, las restantes horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total del sueldo");
        System.out.println("Ejercicio 7\n" +
                "\n" +
                "Escribe un programa que pida un número por teclado y muestre por pantalla si es par o impar.");
        System.out.println("Ejercicio 8\n" +
                "\n" +
                "Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en pantalla el nombre en letras de ese número.");
        System.out.println("Ejercicio 9\n" +
                "\n" +
                "Escribe un programa que realice lo contrario que el anterior, es decir pide un número en letras y enseña un número.");
        System.out.println("Ejercicio 10\n" +
                "\n" +
                "Escribe un programa que diga si un año es bisiesto. No deber permitir aceptar años negativos.\n" +
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
            case 5:
                ejercicio5();
            case 6:
                ejercicio6();
            case 7:
                ejercicio7();
            case 8:
                ejercicio8();
            case 9:
                ejercicio9();
            case 10:
                ejercicio10();
        }

    }
    public static void ejercicio1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1-  Introduce un numero ");
        int numero = sc.nextInt();
        if (numero % 3==0){
            System.out.println("Es multiplo de 3");
        }
        else
            System.out.println("No es multiplo de 3");
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
        System.out.println(" 4- Introduce mes");
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
        System.out.println(" 5- Introduce nota 1ª evaluacion");
        int eva1 = sc.nextInt();
        System.out.println(" 5- Introduce nota 2ª evaluacion ");
        int eva2 = sc.nextInt();
        System.out.println(" 5- Introduce nota 3ª evaluacion ");
        int eva3 = sc.nextInt();
        if (eva1<5 || eva2<5 || eva3<5 ){
            System.out.println("No se puede hacer media");
        }
        else
            System.out.println("La media es " +(eva1+eva2+eva3)/3);
    }
    public static void ejercicio6 (){Scanner sc = new Scanner(System.in);
        System.out.println(" 6- Introduce horas trabajadas");
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
        System.out.println(" 7- Introduce numero ");
        int numero = sc.nextInt();
        if (numero%2 ==0){
            System.out.println("El resultado es par");
        }
        else
            System.out.println("Es impar");

    }
    public static void ejercicio8 (){
        Scanner sc =new Scanner(System.in);
        System.out.println(" 8- Introduce numero del 0-10");
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


        System.out.println(" 9- Introduce un número entre el 0 al 10 ");
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
        System.out.println(" 10- Introduce año");
        int ano = sc.nextInt();
        if (ano % 4 ==0){
            System.out.println("Este año es bisiesto");
        }
        else
            System.out.println("Este año no es bisiesto");
    }
}
