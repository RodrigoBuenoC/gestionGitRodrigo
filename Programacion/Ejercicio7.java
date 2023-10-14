import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio5();
    }
    public static void ejercicio1(){
        int segundos = 0;
        int minutos = 0;
        int horas = 0 ;


            for(horas = 0; horas<24; horas++) {
                for(minutos=0; minutos<60; minutos++) {
                    for(segundos=0; segundos<60; segundos++) {
                        while (true) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        System.out.println(horas + ":" + minutos + ":" + segundos);
                    }
                }
            }
            segundos++;
            System.out.println("Tiempo transcurrido: " + segundos + " segundos");
        }
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce  base ");
        int base = sc.nextInt();

        System.out.print("Introduce el exponente ");
        int exponente = sc.nextInt();

        int resultado = base;

        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de multiplicar "  + resultado);

    }

    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Introduce  frase  ");
        String frase = sc.nextLine();

        for (char letra : frase.toCharArray()) {
            System.out.println(letra);
        }



    }
    public static void ejercicio4(){

    }
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int valorEntero = (int) (Math.floor(Math.random()*(1-100+1)+100));
        int contador = 10;
        double introducir = 0;

        while (contador > 0) {
            System.out.println("Introduce un número");
            introducir = sc.nextInt();
            if (introducir > valorEntero) {
                System.out.println("El numero es menor");
                contador--;
            } else {
                if (introducir < valorEntero) {
                    System.out.println("El numero es mayor");
                    contador--;
                } else {
                    int intentos = 10 - contador;
                    System.out.println("Has acertado en " + intentos + " intentos.");

                }
            }
        }
    }
}