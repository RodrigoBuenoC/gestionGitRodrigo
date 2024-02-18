import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5Tema6 {
    public static void main(String[] args) {

        HashMap<String,Integer>Mapa =new HashMap<>();

        Mapa.put("PP",1000);
        Mapa.put("PSOE",2000);
        Mapa.put("VOX",950);
        Mapa.put("SUMAR",340);
        Mapa.put("PNV",123);
        Mapa.put("C´S",455);


        Scanner sc = new Scanner(System.in);

        System.out.println(" 1 : Introduce partido para ver el numero de votos :");

         String partido = sc.nextLine();

        Integer votosPartido = Mapa.get(partido);

        if (votosPartido != null) {

            System.out.println("El partido " + partido + " obtuvo " + votosPartido + " votos.");
        }
        else
            System.out.println(partido  + "no obtuvo  votos ");


        System.out.println(" 2 : Todos los partidos  ");

        System.out.println(Mapa.keySet());



        System.out.println(" 3 : Todos los partidos  y sus votos :");

        System.out.println(Mapa.entrySet());

        System.out.println(" 4 : El partido con  mas votos : ");

        String ganador = encontrarGanador(Mapa);


        System.out.println("El ganador de las elecciones es: " + ganador);

        }
    public static String encontrarGanador(Map<String, Integer> votos) {
        String ganador = null;
        int maxVotos = Integer.MIN_VALUE;

       
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                ganador = entry.getKey();
            }
        }

        return ganador;
    }


}

