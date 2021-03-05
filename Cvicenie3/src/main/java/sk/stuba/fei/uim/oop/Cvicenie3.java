package sk.stuba.fei.uim.oop;

public class Cvicenie3 {
    public static void main(String[]args) {
        Auto skoda = new Auto(80);
        Auto bmw = new Auto();

        System.out.println("Skoda ------------");
        testAuto(skoda);

        System.out.println("BMW ------------");
        testAuto(bmw);
    }

    public static void testAuto(Auto auto) {
        System.out.println("Dotankoval som: " + auto.dotankovat());
        System.out.println(auto.stavAuta());

        auto.drive(100);

        System.out.println(auto.getStavNadrze());
        System.out.println("Dotankoval som: " + auto.dotankovat());
        System.out.println(auto.stavAuta());

        auto.drive(100);

        System.out.println(auto.getStavNadrze());
        System.out.println(auto.stavAuta());

    }

}
