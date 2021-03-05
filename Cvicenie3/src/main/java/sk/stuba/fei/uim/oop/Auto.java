package sk.stuba.fei.uim.oop;

public class Auto {
    private static final double SPOTREBA = 0.5;

    public double kapacitaNadrze;
    public double stavNadrze;

    public void drive(double vzdialenost){
        stavNadrze -= vzdialenost * SPOTREBA;
        if(stavNadrze < 0) {
            stavNadrze = 0;
        }
    }
}
