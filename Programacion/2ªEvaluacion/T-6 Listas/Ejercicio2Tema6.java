import java.util.*;

public class Ejercicio2Tema6 {

    public static void main(String[] args) {

        Ejercicio1();

        Ejercicio2();

    }

    public static  boolean BuscarCola (Queue<Integer> Cola ,int numero ){

    return Cola.contains(numero);

    }
    public static void Ejercicio1() {

        Queue<Integer> Cola = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 1; i < 5 + 1; i++) {

            int aleatorio = random.nextInt(10);

            Cola.add(aleatorio);

            System.out.println(aleatorio);

        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numero para buscar :");

        int Numero = sc.nextInt();


        System.out.println(BuscarCola(Cola,Numero));
    }

    public static void Ejercicio2(){
        Random random = new Random();
        Stack <Integer> Pila = new Stack<Integer>();
        for (int i = 1; i < 5 + 1; i++) {

            int aleatorio = random.nextInt(10);

            Pila.push(aleatorio);

            System.out.println(aleatorio);

    }
        System.out.println("Pila Original :");

        System.out.println(Pila);

        Stack <Integer> Pila2 = new Stack<Integer>();

        for (Integer elemento : Pila) {

            Pila2.push(elemento);
        }
        System.out.println("Pila Copiada :");

        System.out.println(Pila2);

}
}
