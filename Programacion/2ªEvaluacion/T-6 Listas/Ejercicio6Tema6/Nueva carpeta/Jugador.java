import java.util.Random;


public class Jugador {

    private String nombre;
    private String apellidos;
    private String posicion;

    public Jugador(String nombre, String apellidos, String posicion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Posición: " + posicion;
    }
}

