package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println("name: " + this.name + "meat: " + this.meat + "price: " + this.price + "bread roll type " + this.breadRollType);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("addition 1: " + this.addition1Name);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("addition 2: " + this.addition2Name);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("addition 3: " + this.addition3Name);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("addition 4: " + this.addition4Name);
        }
        return hamburgerPrice;
    }

}
