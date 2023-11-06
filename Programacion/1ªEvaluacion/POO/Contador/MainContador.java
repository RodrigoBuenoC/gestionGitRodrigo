public class MainContador {
    public static void main(String[] args) {
        Contador contador1= new Contador("Rodrigo",0);
        Contador contador2= new Contador("Juan",10);
        Contador contador3= new Contador("Jose",50);

        contador1.setContador(70);
        contador2.setContador(6);


        System.out.println(contador1.Incrementar());
        System.out.println(contador1.Info());
        System.out.println(contador2.descrementar());
        System.out.println(contador2.Info());
        System.out.println(contador3.Info());


    }
}
