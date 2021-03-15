package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args) {

        var student = new Contact("Jozko Mrkvicka");
        var absolvent = new Graduate("Ing.","Tomas","kovacik");

        System.out.println(student.akoText());
        System.out.println(absolvent.akoText());
        System.out.println(absolvent.akoTextSTitulom());

        System.out.println(absolvent);


        Contact contact = new Contact("Pavol","Lukac");
        var contact2 = new Contact("Peter","Lukac");
        var contac3 = new Contact("Pavol Lukac");

        var pat = Integer.parseInt("5");
        var contact4 = Contact.parseFromFullName("Pavol Lukac");

        var contacts1 = new Contact[] {contact2, contac3, contact4};
        contact.setFriendsFromArray(contacts1);

        contacts1[0].setFirstName("Mato");

        contact.setFriends(contact2,contac3,contact4);

        contac3.setFirstName("Kovy");

        contact.getFriends()[0].setFirstName("Gabo");
    }


}
