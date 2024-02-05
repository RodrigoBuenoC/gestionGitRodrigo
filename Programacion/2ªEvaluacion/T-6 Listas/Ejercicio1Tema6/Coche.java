public class Coche {
    //Atributos
    private  String Modelo ;

    private  String Matricula ;

    //Contructor
    public Coche (String modelo , String matricula){

        Modelo = modelo;

        Matricula = matricula;

    }

    //Getters y Setters

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
    @Override

    public  String toString(){
        return "Modelo : " + Modelo + "-------------" +"Matricula : " + Matricula ;
    }
}
