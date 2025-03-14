package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(double price, String breadRollType) {
        super("Healthy Burger", "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyHamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Healthy addition 1: " + this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            healthyHamburgerPrice += this.healthyExtra2Price;
            System.out.println("Healthy addition 2: " + this.healthyExtra2Name);
        }
        System.out.println("price: " + healthyHamburgerPrice);
        return healthyHamburgerPrice;
    }
}
