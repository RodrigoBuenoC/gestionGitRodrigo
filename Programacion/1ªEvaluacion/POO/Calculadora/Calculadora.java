public class Calculadora {
    //Atributos

    private  int resultado ;

    //Constructores

    public Calculadora (){

        this.resultado = 0;

    }

    public Calculadora (int resultado) {

        this.resultado = resultado ;

    }

    //Getter y Setter


    public int getResultado() {

        return resultado;

    }

    public void setResultado(int resultado) {

        this.resultado = resultado;

    }

    //Metodos

    public   int Sumar (int n){

        resultado=resultado+n;

        return  resultado ;

    }

    public  int Restar (int n){

        resultado = resultado-n ;

        return  resultado;
    }

    public int Multiplicar (int n){

        resultado = resultado * n ;

        return resultado;
    }

    public int Dividir (int n){

        resultado = resultado/n ;

        return  resultado ;

    }

    public  int Factorial (int n){

        int multiplicacion= 1 ;

        for (int i =1 ; i <=n ; i++){

            multiplicacion*=i ;

        }
        return multiplicacion ;
    }
    public static boolean esPrimo(int numero){
        boolean esPrimo=true;
        if (numero <= 1) esPrimo=false;
        for (int i=2;i<=numero/2 && esPrimo;i++){
            if (numero%i==0) esPrimo=false;
        }
        return esPrimo;
    }
    public int Inicializar (){
        resultado =0 ;
        return resultado ;
    }
    public String toString (){
        return resultado  + ":" ;
    }
}