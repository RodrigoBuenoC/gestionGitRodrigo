public class Persona {
    //ATRIBUTOS
    private String Nombre ;
    private String Apellido1 ;
    private String Apellido2 ;
    private int  Edad ;
    private int  Genero ;
    private double  Peso ;
    private double  Altura ;
    //CONSTRUCTORES

    public Persona ( String Nombre , String Apellido1 , String Apellido2  ){

        this.Nombre = Nombre ;

        this.Apellido1 = Apellido1 ;

        this.Apellido2 = Apellido2 ;

        this.Edad = 0;

        this.Genero = 0;

        this.Peso = 0;

        this.Altura = 0;
    }
    public  Persona (String Nombre , String Apellido1 , String Apellido2 , int Genero ){

        this.Nombre = Nombre ;

        this.Apellido1 = Apellido1 ;

        this.Apellido2 = Apellido2 ;

        this.Genero = Genero ;

        this.Edad = 0;

        this.Peso = 0;

        this.Altura = 0;
    }
    //GETTERS Y SETTERS
    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public int getGenero() {
        return Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    //METODOS

    private double CalcularIMC (){
        return  Peso/ (Altura*Altura) ;
    }

    public boolean MayorDeEdad (){
        if (Edad >=18){
            return true;
        }
        else
            return false;
    }

    public boolean Sobrepeso (){

        if (CalcularIMC()>20){
            return true ;
        }
        else
            return  false ;

    }




}