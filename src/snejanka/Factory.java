package snejanka;

import snejanka.presents.Present;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Factory {
    private String name;
    private String address;
    private int postCode;
    private Dwarf[] dwarves;
    private SnowWhite snowWhite;
    private ArrayList<Letter> postBox;
    private double expenses;
    private Present[] storage;
    private Present[] sleigh;
    private int presentDenials;

    public Factory(String name) {
        //TODO validate Factory name.
        this.name = name;
        this.dwarves = new Dwarf[15];
        this.postBox = new ArrayList<>();
        for (int i = 0; i < dwarves.length; i++) {
            dwarves[i] = new Dwarf(Utility.getRandomName() + i, Utility.getRandomHeight());
        }
    }

    public void receiveLetter(Letter letter) {
        postBox.add(letter);
    }

    public void setSnowWhite(SnowWhite snowWhite) {
        this.snowWhite = snowWhite;
    }

    public ArrayList<Letter> getPostBox() {
        return postBox;
    }

    public void incrementDenials() {
        this.presentDenials++;
    }

    public Dwarf getRandomDwarf() {
        return this.dwarves[Utility.getRandom().nextInt(dwarves.length)];
    }

    public void addExpenses(double cost) {
        this.expenses += cost;
    }

    public void putInStorage(Present present) {
        //ToDo
    }

    public Dwarf[] getDwarves() {
        return dwarves;
    }

    public double getExpenses() {
        return expenses;
    }

    public int getPresentDenials() {
        return presentDenials;
    }
}
