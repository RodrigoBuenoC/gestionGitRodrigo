public class Contador {
//Atributos

    private String nombre;
    private int contador;
//Constructor

    public Contador(String nombre, int contador) {
        this.nombre = nombre;
        if (contador > 0 && contador < 100) {
            this.contador = contador;
        } else {
            this.contador = 0;
        }
    }
//Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public int getContador() {
        return this.contador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContador(int contador) {

        if (contador > 0 && contador < 100) {
            this.contador = contador ;
        } else {
            this.contador=0;
        }
    }
//Metodos
    public int incrementar() {
        if ( contador < 100) {
            this.contador ++;
        }
       return contador++;
    }

    public int descrementar() {
        if (contador > 0) {
            this.contador--;
        }
        return contador++;
    }
    public String Info (){
        return nombre + " -- " + contador + ".";
    }

}

