package snejanka.presents;

import snejanka.Child;

public class Car extends Present {

    private byte batteries;

    public Car(Child child, byte batteries) {
        super(child);
        //TODO validation of batteries (from 2 to 6 included).
        this.batteries = batteries;
    }

    @Override
    protected double getMinPrice() {
        return 20;
    }

    @Override
    protected double getMaxPrice() {
        return 40;
    }
}
