package snejanka.presents;

import snejanka.Child;

public abstract class Present {

    private String color;
    private Child child;
    private double price;

    public Present(Child child) {
        this.child = child;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (validPrice(price)) {
            this.price = price;
        } else {
            this.price = getDefaultPrice();
        }
    }

    protected double getDefaultPrice() {
        return (getMaxPrice() + getMinPrice()) / 2;
    }

    protected boolean validPrice(double price) {
        return price >= getMinPrice() && price <= getMaxPrice();
    }

    protected abstract double getMinPrice();

    protected abstract double getMaxPrice();
}
