package snejanka.presents;

import snejanka.Child;

public class Book extends Present {

    private String name;
    private byte stories;


    public Book(Child child, String name, byte stories) {
        super(child);
        //TODO validation of name and number of stories (from 1 to 5, included)
        this.name = name;
        if (stories >= 1 && stories <= 5) {
            this.stories = stories;
        } else {
            this.stories = 3;
        }
    }

    @Override
    protected double getMinPrice() {
        return 10;
    }

    @Override
    protected double getMaxPrice() {
        return 20;
    }
}
