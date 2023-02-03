package snejanka;

import snejanka.presents.*;

public class Child {

    public static Factory FACTORY;
    private String name;
    private String city;
    private boolean hasChimney;
    private boolean isNaughty;
    private Letter letter;

    public Child(String name, String city) {
        this.name = name;
        this.city = city;
        this.hasChimney = Utility.getRandom().nextBoolean();
        this.isNaughty = Utility.getChance(40);
    }

    public void sendLetter() {
        int presents = Utility.gerRandomInt(1, 10);
        Letter letter = new Letter(this);
        this.letter = letter;
        for (int i = 0; i < presents; i++) {
            Present p = createPresent();
            letter.addPresent(p);
        }
        FACTORY.receiveLetter(letter);
    }

    private Present createPresent() {
        int chance = Utility.gerRandomInt(1, 100);
        if (chance < 20) {
            return new Doll(this, Utility.getRandomHairColor(), "");// ToDo fix dimensions
        }
        if (chance < 40) {
            return new Train(this, Utility.getChance(50));
        }
        if (chance < 60) {
            return new Car(this, Utility.gerRandomInt(2, 6));
        }
        if (chance < 80) {
            return new Cloth(this, Utility.getRandomSize(), Utility.getRandomMaterial());
        }
        return new Book(this, "Java", Utility.gerRandomInt(1, 5));
    }

    public boolean isNaughty() {
        return isNaughty;
    }

    public Letter getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "Child - " +
                "name: " + name +
                ", city - " + city + ',';
    }

    public String getName() {
        return name;
    }
}
