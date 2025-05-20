package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    public static List<String> groceryList = new ArrayList<String>();

    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        int kullaniciSecimi;
        do {
            System.out.println("0 -> Uygulamayı Durdur");
            System.out.println("1 -> Ekleme yapmak için");
            System.out.println("2 -> Cıkarma yapmak için");
            System.out.println("3 -> Listeyi görmek için");
            System.out.println("4 -> Eleman kontrolü için");
            kullaniciSecimi = scanner.nextInt();
            if (kullaniciSecimi == 1) {
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String eklenecek = scanner.next();
                addItems(eklenecek);
            } else if (kullaniciSecimi == 2) {
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                String silinecek = scanner.next();
                removeItems(silinecek);
            } else if (kullaniciSecimi ==3) {
                System.out.println(groceryList);

            }else if (kullaniciSecimi ==4) {
                System.out.println("Kontrolünü istediğiniz elemanı giriniz.");
                String kontrolEdilecek = scanner.next();
                checkItemIsInList(kontrolEdilecek);

            }
        }while (kullaniciSecimi != 0);


    }
    public static void addItems(String input){
        String[] eklenecekler = input.split(",");
        for (String s : eklenecekler) {
            if (!groceryList.contains(s)) {
                groceryList.add(s);
            }
        }
        System.out.println(input + " listeye eklendi.");
        Collections.sort(groceryList);
    }
    public static void removeItems(String input){
        String[] silinecekler = input.split(",");
        for (String s : silinecekler) {
            groceryList.remove(s);
        }
        System.out.println(input + " listeden silindi.");
        Collections.sort(groceryList);
    }
    public void checkItemIsInList(String product){
        if(groceryList.contains(product)){
            System.out.println(product + " listede var.");
        }else {
            System.out.println(product + " listede hiç yok.");
        }
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
