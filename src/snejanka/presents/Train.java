package snejanka.presents;

import snejanka.Child;

public class Train extends Present {

    private boolean hasSmoke;

    public Train(Child child, boolean hasSmoke) {
        super(child);
        //ToDo validation of hasSmoke.
        this.hasSmoke = hasSmoke;
    }

    @Override
    protected double getMinPrice() {
        return 15;
    }

    @Override
    protected double getMaxPrice() {
        return 30;
    }
}
