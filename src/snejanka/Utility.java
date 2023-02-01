package snejanka;

import java.util.Random;

public abstract class Utility {

    private static final String[] NAMES = {"Tony", "Bony", "Mishony", "Dony", "Svircho"};

    private static Random r = new Random();

    public static String getRandomName() {
        return NAMES[r.nextInt(NAMES.length)];
    }

    public static int getRandomHeight(){
        return r.nextInt(60, 120);
    }

    public static int gerRandomInt(int min, int max){
        return r.nextInt(max-min)+min;
    }
}
