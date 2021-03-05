package sk.stuba.fei.uim.oop;

public class Cvicenie3 {
    public static void main(String[]args) {
        Auto skoda = new Auto(80);

        System.out.println("Dotankoval som: " + skoda.dotankovat());
        System.out.println(skoda.stavAuta());

        skoda.drive(100);

        System.out.println(skoda.getStavNadrze());
        System.out.println("Dotankoval som: " + skoda.dotankovat());
        System.out.println(skoda.stavAuta());

        skoda.drive(100);

        System.out.println(skoda.getStavNadrze());
        System.out.println(skoda.stavAuta());

    }

}
