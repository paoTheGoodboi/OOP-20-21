package sk.stuba.fei.uim.oop;

public class Cvicenie3 {
    public static void main(String[]args) {
        Auto skoda = new Auto();

        skoda.setStavNadrze(100);

        skoda.drive(100);

        System.out.println(skoda.getStavNadrze());

        skoda.drive(100);

        System.out.println(skoda.getStavNadrze());

    }

}
