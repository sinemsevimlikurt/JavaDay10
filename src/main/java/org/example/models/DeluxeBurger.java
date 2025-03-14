package org.example.models;

public class DeluxeBurger extends Hamburger {

    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("DeluxeBurger", "double", 19.10, "normal");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }
}
