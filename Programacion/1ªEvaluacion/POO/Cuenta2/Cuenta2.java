public class Cuenta2 {
    //Atributo
    private  int Id ;

    private  double Saldo ;

    private static   int Contador ;

    private static  double SaldoTotal ;



    //Constructor


    public  Cuenta2 (int Id){

        this.Id = Id ;

        this.Saldo = 0 ;

    }
    public  Cuenta2 (int Id , double Saldo){

        this.Id = Id ;

        this.Saldo = Saldo ;

    }
    //Getters y Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    //Métodos
    public  double Ingresar ( double ingreso ){

        Saldo = Saldo + ingreso ;

        return  Saldo ;
    }
    public  double Retirar (double retirada ){
        Saldo = Saldo - retirada ;

        return  Saldo ;
    }
    public boolean Moroso (){
        boolean moroso = true ;
        if (Saldo < 0){
            return  moroso ;
        }
        else
            return  false ;
    }
    public  String toString (){
        return " Cuenta : " + Id + " ========> " + " Saldo : " + Saldo + " € " ;
    }

    public  static int getContadorDecuentas() {
        return Contador;
    }
    public static double getSaldoTotal (){
        return  SaldoTotal ;

    }
}