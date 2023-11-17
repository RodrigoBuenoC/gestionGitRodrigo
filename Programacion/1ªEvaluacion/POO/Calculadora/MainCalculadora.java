import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {

        Calculadora  calculadora = new Calculadora();

        String opcion ;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Que quieres calcular? \n " +
                    "+ : sumar\n" +
                    " - : restar\n" +
                    " * : multiplicar\n" +
                    " / : dividir\n" +
                    " factorial: factorial del resultado actual.\n" +
                    " primo: calcula si el número es o no primo.\n" +
                    " CE : Inicializa la calculadora a 0\n" +
                    " FIN ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "+":
                    Scanner sc2 = new Scanner(System.in);

                    System.out.println("Introduce valor :");

                    int suma = sc2.nextInt();



                    System.out.println(calculadora.Sumar(suma));

                    break;


                case "-":
                    Scanner sc3 = new Scanner(System.in);

                    System.out.println("Introduce valor :");

                    int resta = sc3.nextInt();

                    System.out.println(calculadora.Restar(resta));

                    break;
                case "*":
                    Scanner sc4 = new Scanner(System.in);

                    System.out.println("Introduce valor :");

                    int multiplicar = sc4.nextInt();

                    System.out.println(calculadora.Multiplicar(multiplicar));

                    break;
                case "/":
                    Scanner sc5 = new Scanner(System.in);

                    System.out.println("Introduce valor :");

                    int dividir = sc5.nextInt();

                    System.out.println(calculadora.Dividir(dividir));

                    break;
                case "factorial":

                    System.out.println(calculadora.Factorial(calculadora.getResultado()));
                    break;
                case "primo":


                    System.out.println(calculadora.esPrimo(calculadora.getResultado()));
                    break;
                case "CE":

                    System.out.println(calculadora.Inicializar());
                    break;
                case  "FIN":
                    return;

            }

        }while (opcion != "FIN ");
    }
}