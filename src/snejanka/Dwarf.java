package snejanka;

import snejanka.presents.Present;

import java.util.HashSet;

public class Dwarf {
    public static Factory FACTORY;

    private String name;
    private int height;
    private HashSet<Present> presentsToMake;

    public Dwarf(String name, int height) {
        this.name = name;
        this.height = height;
    }
}
