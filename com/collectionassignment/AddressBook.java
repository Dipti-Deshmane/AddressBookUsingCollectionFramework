package com.collectionassignment;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private String name;
    private List<Person> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPerson(Person person) {

        contacts.add(person);
    }

    public void display() {
        System.out.println("Address Book: " + name);
        for (Person person : contacts) {
            System.out.println(person);
        }
        System.out.println();
    }

    public Person searchPerson(String name) {
        for (Person person : contacts) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }



}
