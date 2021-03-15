package sk.stuba.fei.uim.oop;

public class Contact {

    private String firstName;
    private String surname;

    private Contact[] friends;

    public Contact(String firstName, String surName) {
        this.firstName = firstName;
        this.surname = surName;
    }

    public Contact(String fullName) {
        var parts = fullName.split(" ");
        firstName = parts[0];
        surname = parts[1];
    }

    public static Contact parseFromFullName(String fullName) {
        return new Contact(fullName);
    }

    public void setFriends(Contact... newFriends) {
        this.friends = newFriends;
    }

    public void setFriendsFromArray(Contact[] newFriends) {
        this.friends = newFriends;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
