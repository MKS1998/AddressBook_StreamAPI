package com.streamapi;


import java.util.*;

/**
 * Purpose - Ability to sort the entries in the address book by City, State, or Zip
 * 
 */

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Map<String, AddressBook> addressBookMap = new HashMap<>();

        while (true) {
            System.out.println("\nWelcome to Address Book System");
            System.out.println("1. New Address Book \n2. Select Address Book \n3. Delete Address Book \n4. Search Contact Data \n5.View Contact Data \n6.Count Contacts \n7. Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    addressBookMap.put(bookName, new AddressBook());// adding bookname as a key and vlue is allocating
                    // memory for addressbook obj
                    AddressBook.addressBookOptions(addressBookMap.get(bookName));// call addressbookoption method with
                    // passing key of hashmap
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    Set<String> keys = addressBookMap.keySet();// retrived keys from hashmap to show addressbooklist
                    Iterator<String> i = keys.iterator();
                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }
                    System.out.println("Enter Address Book name you want to Open : ");
                    String name = sc.nextLine();
                    System.out.println("Current Address Book is : " + name);
                    AddressBook.addressBookOptions(addressBookMap.get(name));// call method with passing address book name
                    break;
                case 3:
                    System.out.println("Enter Address Book name to be delete: ");
                    name = sc.nextLine();
                    addressBookMap.remove(name);// delete hashmap using remove fun
                    break;
                case 4:
                    System.out.println("Welcome to the search option:");
                    addressBook.searchByOptions();
                case 5:
                    System.out.println("Welcome to view By Option:");
                    addressBook.viewByOption(addressBookMap);
                    break;
                case 6:
                    System.out.println("Welcome to the couter");
                    addressBook.countByOption();
                    break;
                case 7:
                    sc.close();// for closing the programme
                    return;
                default:
                    System.out.println("You Entered Invalid Choice....!");
                    break;
            }
        }
    }
}