package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        addBurger();

    }

    public static void addBurger(){
        Hamburger hamburger = new Hamburger("Basic" , "Chicken" , 3.55, "White");
        double price = 1.12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What additions to add: ");
        String a = scanner.next();
        hamburger.addAdditions1(a ,price );

        System.out.println("Added " + a + " The price now is " + hamburger.itemizeHamburger());

    }

    public void Burgers(){
        Hamburger hamburger = new Hamburger("Basic" , "Sausage" , 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addAdditions1("Tomato" , 0.23);
        hamburger.addAdditions2("Letuce", 0.20);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealtyBurger healtyBurger = new HealtyBurger("Bacon" , 5.12);
        healtyBurger.itemizeHamburger();
        healtyBurger.addHealtAddition1("Letuce", 0.20);
        System.out.println("Total HealtyBurger price is " + healtyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addAdditions1("Letuce" , 0.20);
    }
}
