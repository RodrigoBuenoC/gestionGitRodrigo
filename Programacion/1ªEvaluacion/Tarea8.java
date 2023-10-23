import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ejecicio para realizar:");
        System.out.println("1. Es multiplo");
        System.out.println("2. Temperatura media");
        System.out.println("3. espaciado");
        System.out.println("4. Area y perimetro de una circunfurencia");
        System.out.println("5. Login");
        System.out.println("6. MCD");
        System.out.println("7. Horas a segundos y al revés");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Ejercicio1();
                break;

            case 2:
                Ejercicio2();
                break;

            case 3:
                Ejercicio3();
                break;

            case 4:
                Ejercicio4();
                break;

            case 5:
                Ejercicio5();
                break;

            case 6:
                Ejercicio6();
                break;

            case 7:
                Ejercicio7();
                break;
        }


    }

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1- Introduce Numero ");
        int numero = sc.nextInt();
        System.out.println(" 1- Introduce Numero ");
        int numero2 = sc.nextInt();
        System.out.println(EsMultiplo(numero, numero2));

    }

    public static boolean EsMultiplo(int numero1, int numero2) {
        return (numero1 % numero2 == 0);
    }

    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 2- Cuantas medias quieres calcular");
        int calculosTotales = sc.nextInt();
        for (int i = 0; i < calculosTotales; i++) {
            System.out.println("Dame una temperatura máxima");
            float tempMax = sc.nextInt();
            System.out.println("Dame una temperatura mínima");
            float tempMin = sc.nextInt();
            System.out.println(
                    "En el día " + i + " tenemos una temperatura media de: " + calcularMedia(tempMax, tempMin));

        }
    }

    public static float calcularMedia(float temperaturaMin, float temperaturaMax) {
        return (temperaturaMax + temperaturaMin) / 2;
    }

    public static void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 3- Introduce Texto ");
        String texto = sc.nextLine();

        System.out.println(ConvertirEspaciado(texto));

    }

    public static String ConvertirEspaciado(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            resultado.append(caracter);
            if (i < texto.length() - 1) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }

    public static void Ejercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 4- Introduce Radio de la circunferencía para saber el Perímetro y el Área ");

        int radio = sc.nextInt();

        System.out.println(" Area: " + CalcularArea(radio));
        System.out.println(" Perimetro: " + CalcularPerimetro(radio));

    }
    public static double CalcularArea (double radio){
        return Math.PI * (radio*radio);

    }
    public static double CalcularPerimetro (double radio){
        return  2 * Math.PI * radio;
    }

    public static void Ejercicio5(){
        Scanner sc = new Scanner(System.in);
        int intentos=0;
        System.out.println(" 5- Introduce user : ");
        String usuario = sc.nextLine();
        System.out.println(" 5- Introduce Contraseña : ");
        String Contraseña= sc.nextLine();

        System.out.println(Login(usuario,Contraseña,intentos));

    }

    public static String Login (String User , String Psswd,int intentos) {
        while (intentos < 3) {
            if (User.equals("usuario1") && Psswd.equals("asdasd")) {
                return "Inicio de sescion correctamente";
            } else
                return "Login fallido" ;
        }
     return  "ya";
    }

    public static void  Ejercicio6 (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 6- Introduce numero");
        int numero = sc.nextInt();
        System.out.println(" 6- Introduce otro numero");
        int numero2 = sc.nextInt();

        System.out.println(CalcularMCD(numero,numero2));

    }
    public static int CalcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void Ejercicio7(){
        Scanner sc = new Scanner(System.in);
        System.out.println( " -7 Introduce horas ---- ");
        int horas = sc.nextInt();
        System.out.println( "7- Introduce minutos ---- ");
        int minutos = sc.nextInt();
        System.out.println(" 7- Introduce segundo ---- ");
        int segundos = sc.nextInt();

        System.out.println(" Segundos "+HorasSegundos(horas,minutos,segundos));

        System.out.println(" 7- Introduce Segundos ");
        int segundos2= sc.nextInt();
        System.out.println(SegundosHoras(segundos2));
    }
    public static int HorasSegundos (int Hora , int Minutos , int Segundos){
        return  ((Hora*3600)+(Minutos*60)+Segundos);
    }
    public static String SegundosHoras (int Segundos){
        return  Segundos/3600 + " Horas " + (Segundos%3600)/60 + " Minutos " + Segundos%60 + " Segundos " ;
    }

}
