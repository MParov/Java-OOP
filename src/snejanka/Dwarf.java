package snejanka;

import snejanka.presents.Present;

import java.util.ArrayList;
import java.util.HashSet;

public class Dwarf {
    public static Factory FACTORY;

    private String name;
    private int height;
    private ArrayList<Present> presentsToMake;//HashSet<Present> presentsToMake;

    public Dwarf(String name, int height) {
        this.name = name;
        this.height = height;
        this.presentsToMake = new ArrayList<>();
    }

    public void construct(Present present) {
        present.setColor(Utility.getRandomGiftColor());
        double price = Utility.gerRandomInt(2, 40);
        if (!present.getChild().isNaughty()) {
            price *= 1.2;
        }
        this.presentsToMake.add(present);
        present.setPrice(price);
        FACTORY.addExpenses(price);
        FACTORY.putInStorage(present);
    }

    public int getPresentsMade() {
        return this.presentsToMake.size();
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dwarf - " +
                "name: " + name +
                ", height - " + height +
                ", with presents: " + presentsToMake.size();
    }
}
