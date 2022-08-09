package com.solvd.onlineshop.people;

import java.util.Objects;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String contact;

    public Person() {

    }

    public Person(String firstName, String lastName, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" + firstName + lastName + '\''
                + ", contact =" + contact + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.hashCode(), lastName.hashCode(), contact.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return hashCode() == person.hashCode();
    }
}
