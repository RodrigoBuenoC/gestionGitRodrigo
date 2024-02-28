import java.util.ArrayList;
import java.util.Scanner;

public class GestorJugador {
    Scanner sc = new Scanner(System.in);

    ArrayList <Jugador> jugadores  = new ArrayList<>();



        public void AñadirJugador() {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese los apellidos del jugador: ");
            String apellidos = sc.nextLine();
            System.out.print("Ingrese la posición del jugador: ");
            String posicion = sc.nextLine();
            Jugador nuevoJugador = new Jugador(nombre, apellidos, posicion);
            jugadores.add(nuevoJugador);
            System.out.println("Jugador añadido con éxito.");

    }
    public  Jugador BuscarJugador (String nombre ) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().trim().equalsIgnoreCase(nombre.trim()))
                return jugador;
        }
        return null;

    }
    public boolean BorrarJugador(String nombre){
        Jugador j = BuscarJugador(nombre);
        return jugadores.remove(j);
    }

    public boolean EditarJugador(String nombre ) {
        boolean encontrado = false;
        int indiceEncontrado = -1;
        for (int i = 0; i < jugadores.size() && !encontrado; i++) {
            if (jugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                indiceEncontrado = i;
            }
        }

        return encontrado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<jugadores.size();i++) {
            sb.append("Persona "+ i + "-" + jugadores.get(i) + "\n");
        }

        return sb.toString();
    }


}
