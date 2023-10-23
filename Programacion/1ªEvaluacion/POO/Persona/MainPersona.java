public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Rodrigo", " Bueno ", "Cavacasillas", 1);

        Persona persona2 = new Persona("Juan", "Parejo", "Garcia", 1);

        Persona persona3 = new Persona("Alejandro", "Sanchez", "Olivero", 1);

        Persona persona4 = new Persona("Jose", "Correa", "Fadis", 1);

        persona1.setEdad(20);

        persona2.setEdad(17);

        persona3.setPeso(60);
        persona3.setAltura(1.70);

        persona4.setPeso(50);
        persona4.setAltura(1.70);


        System.out.println(persona1.MayorDeEdad());

        System.out.println(persona2.MayorDeEdad());

        System.out.println(persona3.Sobrepeso());

        System.out.println(persona4.Sobrepeso());
    }
}
