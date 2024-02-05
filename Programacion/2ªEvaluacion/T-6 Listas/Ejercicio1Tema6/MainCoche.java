import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MainCoche {
    public static void main(String[] args) {
        Random random = new Random();

        Coche coche1 = new Coche("Seat","1234ABC");
        Coche coche2 = new Coche("BMW" ,"9876ZYX");
        Coche coche3 = new Coche("Mercedes" ,"2222ZZZ");
        Coche coche4 = new Coche("Jeep" ,"4567PLT");
        Coche coche5 = new Coche("Ferrari" ,"7777VGT");

        Queue<Coche> ColaCoche = new LinkedList<Coche>();

        ColaCoche.add(coche1);
        ColaCoche.add(coche2);
        ColaCoche.add(coche3);
        ColaCoche.add(coche4);
        ColaCoche.add(coche5);

        System.out.println(ColaCoche);
        for( int ticket = random.nextInt(6) +5; ticket>5 ; ticket--) {


            System.out.println(ColaCoche.poll() + " -Ticket: " + ticket + ".");
        }
        System.out.println("Ya no hay más tickets disponibles.");

    }
}
