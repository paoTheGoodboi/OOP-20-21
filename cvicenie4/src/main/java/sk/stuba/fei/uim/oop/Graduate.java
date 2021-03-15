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

    @Override
    public String getZnamy() {
        var builder = new StringBuilder();
        builder.append("Moji znamy: \n");
        for (int i = 0; i < this.friends.length; i++) {
            builder.append(this.friends[i].akoText());
            builder.append("\n");
        }
        return builder.toString();
    }

//    @Override
//    public String toString() {
//        return String.format("Volam sa %s", super.akoText());
//    }
}
