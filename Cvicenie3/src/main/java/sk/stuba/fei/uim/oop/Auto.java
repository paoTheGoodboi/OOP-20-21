package sk.stuba.fei.uim.oop;

public class Auto {
    private static final double SPOTREBA = 0.5;

    private double kapacitaNadrze;
    private double stavNadrze;

    public void drive(double vzdialenost){
        stavNadrze -= vzdialenost * SPOTREBA;
        if(stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

}
