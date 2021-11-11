package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe" , "Sausage and bacon" , 14.54 , "White");
        super.addAdditions1("Chips" , 2.00);
        super.addAdditions2("Coke" , 1.12);
    }

    @Override
    public void addAdditions1(String name, double price) {
        System.out.println("Cannot add additional items to DeluxBurger!");
    }

    @Override
    public void addAdditions2(String name, double price) {
        System.out.println("Cannot add additional items to DeluxBurger!");

    }

    @Override
    public void addAdditions3(String name, double price) {
        System.out.println("Cannot add additional items to DeluxBurger!");
    }

    @Override
    public void addAdditions4(String name, double price) {
        System.out.println("Cannot add additional items to DeluxBurger!");
    }
}
