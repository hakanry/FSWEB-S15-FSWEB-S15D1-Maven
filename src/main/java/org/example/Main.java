package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Grocery grocery = new Grocery();
        Grocery.groceryList.add("tomato");
        //grocery.startGrocery();


        Contact contact1 = Contact.createContact("Bob", "31415926");

        Contact contact2 = new Contact("Alice ","16180339");
        Contact contact3 = new Contact("Tom","11235813");
        Contact contact4 = new Contact("Jane","23571113");

        List<Contact> c1 = new ArrayList<>();

        c1.add(contact1);
        c1.add(contact2);
        c1.add(contact3);
        c1.add(contact4);

        MobilePhone mobilePhone = new MobilePhone("555555555",c1);
        mobilePhone.printContact();
        System.out.println("---------------------------------");
        mobilePhone.removeContact(contact4);
        mobilePhone.printContact();
        System.out.println("---------------------------------");

        Contact updatedContact = new Contact("Test", "12345679");
        mobilePhone.updateContact(contact3,updatedContact);
        mobilePhone.printContact();
        System.out.println("---------------------------------");
        System.out.println(mobilePhone.findContact(updatedContact));
        System.out.println("---------------------------------");
        System.out.println(mobilePhone.queryContact("Bob"));
    }
}
