package snejanka;

import snejanka.presents.Present;

import java.util.ArrayList;

public class Letter {

    private Child child;
    private ArrayList<Present> desiredPresents;

    public Letter(Child child) {
        this.child = child;
        this.desiredPresents = new ArrayList<>();
    }

    public void addPresent(Present p) {
        this.desiredPresents.add(p);
    }

    public boolean isNaughtyOwner() {
        return this.child.isNaughty();
    }

    public Present getFirst() {
        return this.desiredPresents.get(0);
    }

    public ArrayList<Present> getDesiredPresents() {
        return desiredPresents;
    }

    public Child getChild() {
        return child;
    }
}
