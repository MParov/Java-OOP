package snejanka;

import snejanka.presents.Present;

public class Factory {
    private String name;
    private String address;
    private int postCode;
    private Dwarf[] dwarves;
    private SnowWhite snowWhite;
    private Letter[] postBox;
    private double expenses;
    private Present[] storage;
    private Present[] sleigh;
    private int presentDenials;

    public Factory(String name) {
        //TODO validate Factory name.
        this.name = name;
        this.snowWhite = new SnowWhite();
        this.dwarves = new Dwarf[15];
        for (int i = 0; i < dwarves.length; i++) {
            dwarves[i] = new Dwarf(Utility.getRandomName() + i, Utility.getRandomHeight());
        }
    }
}
