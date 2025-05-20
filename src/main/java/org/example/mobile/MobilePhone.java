package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact c){
        if(myContacts.contains(c)){
            return false;
        }else {
            myContacts.add(c);
            return true;
        }
    }
    public boolean updateContact(Contact a, Contact b){
        if(myContacts.contains(a)){
            myContacts.set(myContacts.indexOf(a),b);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact sil){
        if(myContacts.contains(sil)){
            myContacts.remove(sil);
            return true;
        }
        return false;
    }
    public int findContact(Contact find){
        if(myContacts.contains(find)){
            return myContacts.indexOf(find);
        }
        return -1;
    }
    public int findContact(String name){
        for(Contact gezen : myContacts){
            if(gezen.getName().equals(name)){
                return myContacts.indexOf(gezen);
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for(Contact gezen : myContacts){
            if(gezen.getName().equals(name)){
                return gezen;
            }
        }
        return null;
    }
    public void printContact(){
        for (int i = 0 ; i < myContacts.size() ; i++){
            System.out.println(i + ". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getphoneNumber());
        }
    }
}
