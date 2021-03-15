package sk.stuba.fei.uim.oop;

public abstract class Contact implements Znamy {

    private String firstName;
    private String surname;

    protected Contact[] friends;

    public Contact(String firstName, String surName) {
        this.firstName = firstName;
        this.surname = surName;
    }

    public Contact(String fullName) {
        var parts = fullName.split(" ");
        firstName = parts[0];
        surname = parts[1];
    }

    public Contact(Contact other) {
        this.firstName = other.firstName;
        this.surname = other.surname;
    }

//    public static Contact parseFromFullName(String fullName) {
//        return new Contact(fullName);
//    }

    public void setFriends(Contact... newFriends) {
        this.friends = newFriends;
    }

    public void setFriendsFromArray(Contact[] newFriends) {
        this.friends = newFriends;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    public Contact[] getFriends() {
//        var friendsClone = new Contact[this.friends.length];
//        for(int i = 0; i< this.friends.length; i++) {
//            friendsClone[1] = new Contact(this.friends[1]);
//        }
//        return friends;
//    }

    public String akoText() {
        return String.format("%s %s", this.firstName, this.surname);
    }

    public abstract String getZnamy();

    @Override
    public String toString() {
        return String.format("Volam sa %s\n%s", this.akoText(), this.getZnamy());
    }
}
