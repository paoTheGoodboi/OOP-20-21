package sk.stuba.fei.uim.oop;

public class Cvicenie3 {
    public static void main(String[]args) {
        Auto skoda = new Auto();

        skoda.stavNadrze = 100;

        skoda.drive(100);

        System.out.println(skoda.stavNadrze);

        skoda.drive(100);

        System.out.println(skoda.stavNadrze);

    }

}
