public class Rectangulo {
    //Atributos
    private int ancho ;
    private int alto ;

    //Constructor

    public Rectangulo (int ancho, int alto ){
        if (ancho >= 5 && ancho <= 10  && alto >= 5 && alto <= 10 ) {
            this.ancho = ancho;
            this.alto = alto ;
        } else {
            this.ancho = 0;
            this.alto  = 0;

        }

    }
    //Getters y Setters


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho >= 5 && ancho <= 10) {
            this.ancho = ancho;
        } else {
            this.ancho = 0;
    }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if (alto >= 5 && alto <= 10 ){
            this.alto = alto;
        } else {
            this.alto = 0;
        }

    }
    //Metodos
    public int Area (){

        return ancho * alto ;
    }
    public  String toString () {
        String cadena = " ";
        if (ancho >= 5 && ancho <= 10 && alto >= 5 && alto <= 10) {
            for (int i = 0; i < alto; i++) {
                for (int j = 0; j < ancho; j++) {
                    cadena += " - ";
                }
                cadena += "\n ";
            }

        }

        return cadena;
    }}

