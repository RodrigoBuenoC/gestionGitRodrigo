import java.util.Scanner;
import java.util.Stack;

public class MainLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("El quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Gerónimo Stilton", "Juan Parejo");
        Libro libro3 = new Libro("La biblia", "Dios");
        Libro libro4 = new Libro("La jungla", "Jose Correa");
        Libro libro5 = new Libro("Diario", "Anna Frank");

        Stack<Libro> pila = new Stack<Libro>();

        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);


        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre de un libro : ");

        String pedido = sc.nextLine();

while (pila.empty() == false && !pedido.equals(pila.peek().getNombre())){

    pila.pop();

}
        if (pedido.equals(pila.peek().getNombre())) {
            System.out.println("Tu libro se ha encontrado:" + " " + pila.peek().getNombre());
        } else {
            System.out.println("Error en la ejecucion del programa, te jodes.");
        }

        }

}
