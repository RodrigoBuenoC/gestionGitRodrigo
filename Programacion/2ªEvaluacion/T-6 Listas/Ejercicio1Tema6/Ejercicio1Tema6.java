import java.util.*;

public class Ejercicio1Tema6 {
    public static void main(String[] args) {
        Ejercicio1();

        Ejercicio2();


    }

    public static void Ejercicio1() {
        Stack<Integer> pila = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Introduce cuantos numero aleatorios quieres : ");

        int numero = sc.nextInt();

        for (int i = 1; i < numero + 1; i++) {

            int aleatorio = random.nextInt(10);

            System.out.println(pila.push(aleatorio));

        }
        System.out.println(pila);
        System.out.println("------------------------------");

        while (!pila.isEmpty()) {

            System.out.println(pila.pop());
        }
        System.out.println(pila);
    }

    public static void Ejercicio2() {
        Queue<Integer> cola = new PriorityQueue<Integer>();

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Introduce cuantos numeros aleatorios quieres : ");

        int numero = sc.nextInt();

        for (int i = 1; i < numero + 1; i++) {

            int aleatorio = random.nextInt(10);

            cola.add(aleatorio);

            System.out.println(aleatorio);
        }
        System.out.println(cola);
        System.out.println("--------------------------------");

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
        System.out.println(cola);
    }


}