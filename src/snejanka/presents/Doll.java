package snejanka.presents;

import snejanka.Child;

public class Doll extends Present {

    private String hairColor;
    private String dimensions;


    public Doll(Child child, String hairColor, String dimensions) {
        super(child);
        //ToDo validation of HairColor and dimensions.
        this.hairColor = hairColor;
        this.dimensions = dimensions;
    }

    @Override
    protected double getMinPrice() {
        return 5;
    }

    @Override
    protected double getMaxPrice() {
        return 10;
    }
}
