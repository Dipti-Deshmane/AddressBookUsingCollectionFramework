package com.collectionassignment;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class AddressBookSystem {

        private Dictionary<String, AddressBook> addressBooks;

        public AddressBookSystem() {
            addressBooks = new Hashtable<>();
        }

        public void addAddressBook(String name) {
            AddressBook addressBook = new AddressBook(name);
            addressBooks.put(name, addressBook);
        }

        public void displayAllAddressBooks() {
            Enumeration<String> keys = addressBooks.keys();
            while (keys.hasMoreElements()) {
                String name = keys.nextElement();
                AddressBook addressBook = addressBooks.get(name);
                addressBook.display();
            }
        }

        public void addPersonToAddressBook(String name, Person person) {
            AddressBook addressBook = addressBooks.get(name);
            if (addressBook != null) {
                addressBook.addPerson(person);
                System.out.println("Person " + person.getName() + " added to Address Book " + name);
            } else {
                System.out.println("Address Book " + name + " not found.");
            }
        }

        public Person searchPersonAcrossAddressBooks(String name) {
            Enumeration<String> keys = addressBooks.keys();
            while (keys.hasMoreElements()) {
                String addressBookName = keys.nextElement();
                AddressBook addressBook = addressBooks.get(addressBookName);
                Person person = addressBook.searchPerson(name);
                if (person != null) {
                    return person;
                }
            }
            return null;
        }
    }

