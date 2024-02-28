import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int opcion;

        Jugador editado;

        GestorJugador gJugador = new GestorJugador();

        Scanner sc = new Scanner(System.in);

        boolean terminar = true;

        while (terminar) {
            System.out.println("""
                    1.- Añadir Jugador.
                    2.- Buscar Jugador.
                    3.- Eliminar Jugador.
                    4.- Editar Jugador.
                    5.- Salir.
                    """);
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    gJugador.AñadirJugador();
                    break;
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Buscar nombre");
                    String Nombre1 = sc1.nextLine();
                    gJugador.BuscarJugador(Nombre1);
                    break;
                case 3:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Buscar nombre");
                    String Nombre2 = sc2.nextLine();
                    gJugador.BorrarJugador(Nombre2);
                case 4:
                    Scanner  sc3 = new Scanner(System.in);
                    System.out.println("Buscar nombre");
                    String Nombre3 = sc3.nextLine();
                    gJugador.EditarJugador(Nombre3);
                case 5:
                    System.out.println("Saliendo del programa");
                    terminar = false;
                    break;
            }
        }
    }
}