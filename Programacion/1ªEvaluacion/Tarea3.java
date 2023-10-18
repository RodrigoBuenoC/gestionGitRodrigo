import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        ejercicio1();
        System.out.println("");
        ejercicio2();
        System.out.println("");
        ejercicio3();
        System.out.println("");
        ejercicio4();
        System.out.println("");

    }
    public static void ejercicio1 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce su nombre de usuario");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " +nombre );
    }
    public static void ejercicio2 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce password");
        String password = sc.nextLine();
        String contrasena = "Castelar";
        if ( password.equals(contrasena) ){
            System.out.println("Correcto , su contraseña es " +password);
        }
        else
            System.out.println("Contraseña incorrecta");
    }

    public static void ejercicio3 (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Escriba una frase : La frase ");
        String frase = sc.nextLine();
        System.out.println("La longitud de la frase es " +frase.length());
        System.out.println("La primera letra de la frase es  " +frase.charAt(0));
        System.out.println("La ultima  letra de la frase es  " +frase.charAt(frase.length()-1));
    }
    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la frase " +"Hola amigo ¿cómo estás?");
        String frase = sc.nextLine();
        System.out.println(frase.substring(5,10));

    }

}

