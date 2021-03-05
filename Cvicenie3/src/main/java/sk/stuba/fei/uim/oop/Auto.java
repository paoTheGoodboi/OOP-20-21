package sk.stuba.fei.uim.oop;

public class Auto {
    private static final double SPOTREBA = 0.5;

    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean nove;

    public Auto() {
        nove = true;
    }

    public void drive(double vzdialenost){
        nove = false;
        stavNadrze -= vzdialenost * SPOTREBA;
        if(stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public String stavAuta() {
        String vysledok;
        if (this.nove) {
            vysledok = "Auto je nojazdene.";
        }else {
            vysledok = "Auto je ojazdene.";
        }
        vysledok += "\n"+stavNadrze+"/"+kapacitaNadrze;
        return vysledok;
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public boolean isNove() {
        return nove;
    }

    public void setNove(boolean nove) {
        this.nove = nove;
    }


}
