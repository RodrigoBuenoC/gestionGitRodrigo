import java.util.Scanner;

public class MainCuenta2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero de cuenta que quieres crear : ");

        int numeroCuenta = sc.nextInt();

        Cuenta cuenta = new Cuenta(numeroCuenta);
        int opcion ;

        do {
            System.out.println(" 1 - Crear Saldo          : \n" +
                    " 2 - Ingresar             : \n" +
                    " 3 - Retirar              : \n" +
                    " 4 - Morosa               : \n" +
                    " 5 - Fin                  : \n" +
                    " 6 - Contador de cuentas  : \n" +
                    " 7 - Saldo total          :   " );
            opcion = sc.nextInt();



            switch (opcion) {

                case 1:
                    Scanner sc2 = new Scanner(System.in);

                    System.out.println(" Introduce Saldo inicial ");

                    double saldoInicial = sc.nextDouble();

                    cuenta.setSaldo(saldoInicial);

                    System.out.println(cuenta.toString());

                    break;

                case 2:
                    Scanner sc3 = new Scanner(System.in);

                    System.out.println(" Introduce Dinero ");

                    double ingreso = sc3.nextDouble();

                    cuenta.Ingresar(ingreso);

                    System.out.println(cuenta.toString());

                    break;

                case 3:
                    Scanner sc4 = new Scanner(System.in);

                    System.out.println(" Cuanto dinero quieres retirar");

                    double retirada = sc4.nextDouble();

                    cuenta.Retirar(retirada);

                    System.out.println(cuenta.toString());

                    break;


                case 4:

                    cuenta.Moroso();

                    System.out.println(cuenta.Moroso());

                    break;

                case 5:

                    System.out.println(" FIN ");

                    break;

                case 6:

                    System.out.println(Cuenta2.getContadorDecuentas());

                    break;

                case  7:

                    System.out.println(Cuenta2.getSaldoTotal());


            }
        }   while (opcion !=5);
    }
}
