package snejanka;

public class Demo {
    public static void main(String[] args) {
        Factory factory = new Factory("IT Talents gift shop");

        Dwarf.FACTORY = factory;
        Child.FACTORY = factory;
        SnowWhite.FACTORY = factory; //ToDo use SINGELTON 2h16min in movie

        for (int i = 0; i < 100; i++) {
            Child c = new Child(Utility.getRandomName() + i, Utility.getRandomCity());
            c.sendLetter();
        }

        SnowWhite snowWhite = new SnowWhite();
        factory.setSnowWhite(snowWhite);

        snowWhite.startWork();
    }
}
