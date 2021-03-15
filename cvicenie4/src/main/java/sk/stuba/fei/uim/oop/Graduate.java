package sk.stuba.fei.uim.oop;

public class Graduate extends Contact {

    private String academicTitle;

    public Graduate(String firstName, String surName) {
        super(firstName, surName);
        this.academicTitle = "";
    }

    public Graduate(String academicTitle,String firstName, String surName) {
        super(firstName, surName);
        this.academicTitle = academicTitle;
    }

    public String akoTextSTitulom() {
        return String.format("%s %s", this.academicTitle, this.akoText() );
    }

    @Override
    public String akoText() {
        return String.format("%s %s", this.academicTitle, super.akoText() );
    }
}
