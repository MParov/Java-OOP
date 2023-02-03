package snejanka;

import java.util.Random;

public abstract class Utility {

    private static final String[] NAMES = {"Tony", "Bony", "Mishony", "Dony", "Svircho"};
    private static final String[] CITIES = {"Sofia", "Varna", "Burgas", "Plovdiv", "Sliven"};
    private static final String[] SIZE = {"S", "M", "L", "XL"};
    private static final String[] MATERIAL = {"Cotton", "Canvas", "Cashmere", "Chenille" , "Chiffon", "Jersey", "Leather", "Organza"};
    private static final String[] HAIRCOLORS = {"Blonde", "Red", "Brown", "Black"};
    private static final String[] GIFTCOLORS = {"Yellow", "Red", "Brown", "Black", "White", "Green"};
    private static Random r = new Random();

    public static String getRandomName() {
        return NAMES[r.nextInt(NAMES.length)];
    }

    public static String getRandomCity() {
        return CITIES[r.nextInt(CITIES.length)];
    }
    public static String getRandomSize() {
        return SIZE[r.nextInt(SIZE.length)];
    }
    public static String getRandomMaterial() {
        return MATERIAL[r.nextInt(MATERIAL.length)];
    }
    public static String getRandomHairColor() {
        return HAIRCOLORS[r.nextInt(HAIRCOLORS.length)];
    }
    public static String getRandomGiftColor() {
        return GIFTCOLORS[r.nextInt(GIFTCOLORS.length)];
    }

    public static int getRandomHeight() {
        return r.nextInt(60, 120);
    }

    public static int gerRandomInt(int min, int max) {
        return r.nextInt(max - min) + min;
    }

    public static Random getRandom() {
        return r;
    }

    public static boolean getChance(int chance) {
        return r.nextInt(100) < chance;
    }
}
