public class Libro {
    //Atributos
    private String Nombre;

    private  String Autor;

    //Constructor
    public Libro (String nombre , String autor){

        Nombre = nombre;

        Autor  = autor;
    }
    //Getters y Setters

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString (){
        return "Nombre del libro : " + Nombre + " -------- " + "Autor :" + Autor ;
    }
}
