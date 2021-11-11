package com.company;

public class Hamburger {
    private String burgerName;
    private String meat;
    private double price;
    private String bread;

    private String addition1Name;
    private double Addition1Price;

    private String addition2Name;
    private double Addition2Price;

    private String addition3Name;
    private double Addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String burgerName, String meat, double price, String bread) {
        this.burgerName = burgerName;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addAdditions1(String name, double price) {
        this.addition1Name = name;
        this.Addition1Price = price;
    }

    public void addAdditions2(String name, double price) {
        this.addition2Name = name;
        this.Addition2Price = price;
    }

    public void addAdditions3(String name, double price) {
        this.addition3Name = name;
        this.Addition3Price = price;
    }

    public void addAdditions4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
       double hamburgerPrice = this.price;
        System.out.println(this.burgerName + " hamburger on a " + this.bread + " roll" + " with " + this.meat + " price is " + this.price);
        if(this.addition1Name != null){
            hamburgerPrice += this.Addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.Addition1Price);
        }
        if(this.addition2Name != null){
            hamburgerPrice += this.Addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.Addition2Price);
        }
        if(this.addition3Name != null){
            hamburgerPrice += this.Addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.Addition3Price);
        }
        if(this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }




}
