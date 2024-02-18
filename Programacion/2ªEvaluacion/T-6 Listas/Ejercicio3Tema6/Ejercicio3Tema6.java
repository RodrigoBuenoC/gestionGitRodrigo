import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Tema6 {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Añadir jugador");
            System.out.println("2. Buscar un jugador");
            System.out.println("3. Eliminar un jugador");
            System.out.println("4. Editar la información de un jugador");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese los apellidos del jugador: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese la posición del jugador: ");
                    String posicion = scanner.nextLine();
                    Jugador nuevoJugador = new Jugador(nombre, apellidos, posicion);
                    jugadores.add(nuevoJugador);
                    System.out.println("Jugador añadido con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del jugador a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Jugador encontrado:");
                            System.out.println(jugador);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del jugador a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    for (int i = 0; i < jugadores.size(); i++) {
                        if (jugadores.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                            jugadores.remove(i);
                            System.out.println("Jugador eliminado con éxito.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del jugador a editar: ");
                    String nombreEditar = scanner.nextLine();
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombreEditar)) {
                            System.out.print("Ingrese el nuevo nombre del jugador: ");
                            String nuevoNombre = scanner.nextLine();
                            System.out.print("Ingrese los nuevos apellidos del jugador: ");
                            String nuevosApellidos = scanner.nextLine();
                            System.out.print("Ingrese la nueva posición del jugador: ");
                            String nuevaPosicion = scanner.nextLine();
                            jugador.setNombre(nuevoNombre);
                            jugador.setApellidos(nuevosApellidos);
                            jugador.setPosicion(nuevaPosicion);
                            System.out.println("Información del jugador actualizada con éxito.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");


            Ejercicio1();

            }

        }
    }




    public static void  Ejercicio1 (){

        List <Integer> lista = new ArrayList<Integer>();

        Random random = new Random();
        System.out.println("--------- Bucle for : ---------");
        System.out.println("");
        System.out.println("");

        for (int i = 1; i < 5 + 1; i++) {

            int aleatorio = random.nextInt(10);

            lista.add(aleatorio);


        }
        System.out.println(lista);

        System.out.println("--------- Bucle for each : ---------");
        System.out.println("");
        System.out.println("");


        for (int numero : lista){


        }
        System.out.println(lista);

        System.out.println("--------- to String : ---------");
        System.out.println("");
        System.out.println("");

        System.out.println(lista.toString());




}






}
