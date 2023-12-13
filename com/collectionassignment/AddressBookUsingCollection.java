package com.collectionassignment;

import java.util.Scanner;

public class AddressBookUsingCollection {
    public static void main(String[] args) {
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Address Book System Menu");
            System.out.println("1. Create new Address Book");
            System.out.println("2. Add person to Address Book");
            System.out.println("3. Display all Address Books");
            System.out.println("4. Search person across Address Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new Address Book: ");
                    scanner.nextLine(); // Consume newline character
                    String addressBookName = scanner.nextLine();
                    addressBookSystem.addAddressBook(addressBookName);
                    System.out.println("Address Book " + addressBookName + " created.\n");
                    break;
                case 2:
                    System.out.print("Enter the name of the Address Book to add person: ");
                    scanner.nextLine(); // Consume newline character
                    addressBookName = scanner.nextLine();

                    System.out.print("Enter person name: ");
                    String personName = scanner.nextLine();

                    System.out.print("Enter person phone number: ");
                    String phoneNumber = scanner.nextLine();

                    Person person = new Person(personName, phoneNumber);
                    addressBookSystem.addPersonToAddressBook(addressBookName, person);
                    System.out.println();
                    break;
                case 3:
                    addressBookSystem.displayAllAddressBooks();
                    break;
                case 4:
                    System.out.print("Enter the name of the person to search: ");
                    scanner.nextLine(); // Consume newline character
                    personName = scanner.nextLine();

                    Person searchedPerson = addressBookSystem.searchPersonAcrossAddressBooks(personName);
                    if (searchedPerson != null) {
                        System.out.println("Person found in Address Book: " + searchedPerson);
                    } else {
                        System.out.println("Person not found in any Address Book.");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting Address Book System...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 0);

        scanner.close();
    }

}

