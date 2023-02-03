package snejanka;

import snejanka.presents.*;

import java.util.ArrayList;

public class SnowWhite {

    public static Factory FACTORY;

    public void startWork() {
        distributePresentsCreation();
        prepareSleigh();
        prepareReports();
    }

    private void distributePresentsCreation() {
        for (int i = 0; i < FACTORY.getPostBox().size(); i++) {
            Letter letter = FACTORY.getPostBox().get(i);
            if (letter.isNaughtyOwner()) {
                if (Utility.getChance(50)) {
                    giveToDwarf(letter.getFirst());
                } else {
                    FACTORY.incrementDenials();
                }
            } else {
                giveToDwarf(letter.getDesiredPresents());
            }
        }
    }


    private void giveToDwarf(Present present) {
        Dwarf dwarf = FACTORY.getRandomDwarf();
        dwarf.construct(present);
    }

    private void giveToDwarf(ArrayList<Present> presents) {
        Dwarf dwarf = FACTORY.getRandomDwarf();
        for (int i = 0; i < presents.size(); i++) {
            dwarf.construct(presents.get(i));
        }
    }

    private void prepareSleigh() {
        //ToDo
    }

    private void prepareReports() {
        stat1();
        stat2();
        stat3();
        stat4();
        stat5();
        stat6();
        stat7();
        stat8();
        stat9();
        stat10();
        stat11();
        stat12();
        stat13();
    }

    private void stat1() {
        System.out.println("All letters it the Factory are: " + FACTORY.getPostBox().size());
        int naughty = 0;
        for (int i = 0; i < FACTORY.getPostBox().size(); i++) {
            if (FACTORY.getPostBox().get(i).getChild().isNaughty()) {
                naughty++;
            }
        }
        int obedient = FACTORY.getPostBox().size() - naughty;
        System.out.println("Ratio is: " + naughty + "% naughty and " + obedient+ "% obedient.");
    }

    private void stat2() {
        Child childWithMostPresents = null;
        for (int i = 0; i < FACTORY.getPostBox().size(); i++) {
            Letter letter = FACTORY.getPostBox().get(i);
            Child child = letter.getChild();
            if (!child.isNaughty()) {
                if (childWithMostPresents == null) {
                    childWithMostPresents = child;
                } else {
                    if (letter.getDesiredPresents().size() > childWithMostPresents.getLetter().getDesiredPresents().size()) {
                        childWithMostPresents = child;
                    }
                }
            }
        }
        System.out.println("The child with most presents is: " + childWithMostPresents);
    }

    private void stat3() {
    }

    private void stat4() {
        Dwarf[] dwarves = FACTORY.getDwarves();
        for (int i = 0; i < dwarves.length; i++) {
            for (int j = 0; j < dwarves.length - 1; j++) {
                if (dwarves[j].getPresentsMade() < dwarves[j + 1].getPresentsMade()) {
                    Dwarf temp = dwarves[j];
                    dwarves[j] = dwarves[j + 1];
                    dwarves[j + 1] = temp;
                }
            }
        }
        System.out.println(dwarves[0]);
    }

    private void stat5() {
        Dwarf[] dwarves = FACTORY.getDwarves();
        Dwarf highestWorker = null;
        for (int i = 0; i < dwarves.length; i++) {
            if (dwarves[i].getPresentsMade() >= 10) {
                if (highestWorker == null) {
                    highestWorker = dwarves[i];
                } else {
                    if (dwarves[i].getHeight() > highestWorker.getHeight()) {
                        highestWorker = dwarves[i];
                    }
                }
            }
        }
        System.out.println("The highest dwarf with most ot 10 build present is: " + highestWorker.getName() == null ? "Non" : highestWorker);
    }

    private void stat6() {
        //ToDo HashMap<String, ArrayList<Present>> presentPerType;

        //0 = book
        //1 = car
        //2 = doll
        //3 = cloth
        //4 = train

        int[] counters = new int[5];
        for (int i = 0; i < FACTORY.getPostBox().size(); i++) {
            Letter letter = FACTORY.getPostBox().get(i);
            for (int j = 0; j < letter.getDesiredPresents().size(); j++) {
                Present p = letter.getDesiredPresents().get(j);
                if (p instanceof Book) {
                    counters[0]++;
                }
                if (p instanceof Car) {
                    counters[1]++;
                }
                if (p instanceof Doll) {
                    counters[2]++;
                }
                if (p instanceof Cloth) {
                    counters[3]++;
                }
                if (p instanceof Train) {
                    counters[4]++;
                }
            }
        }
        int maxI = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > maxI) {
                maxI = i;
            }
        }
        switch (maxI) {
            case 0:
                System.out.println("The most wanted gift is: Book");
                break;
            case 1:
                System.out.println("The most wanted gift is: Car");
                break;
            case 2:
                System.out.println("The most wanted gift is: Doll");
                break;
            case 3:
                System.out.println("The most wanted gift is: Cloth");
                break;
            case 4:
                System.out.println("The most wanted gift is: Train");
                break;
        }
    }

    private void stat7() {
        ArrayList<String> colors = new ArrayList<>();
        for (int i = 0; i < FACTORY.getPostBox().size(); i++) {
            Letter letter = FACTORY.getPostBox().get(i);
            for (int j = 0; j < letter.getDesiredPresents().size(); j++) {
                Present p = letter.getDesiredPresents().get(j);
                if (!colors.contains(p.getColor())) {
                    colors.add(p.getColor());
                }
            }
        }
        System.out.println("Number of package colors is: " + colors.size());
    }

    private void stat8() {
    }

    private void stat9() {
        Dwarf[] dwarves = FACTORY.getDwarves();
        for (int i = 0; i < dwarves.length; i++) {
            for (int j = 0; j < dwarves.length - 1; j++) {
                if (dwarves[j].getPresentsMade() < dwarves[j + 1].getPresentsMade()) {
                    Dwarf temp = dwarves[j];
                    dwarves[j] = dwarves[j + 1];
                    dwarves[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < dwarves.length; i++) {
            System.out.println(dwarves[i] + ", ");
        }
    }

    private void stat10() {
    }

    private void stat11() {
        System.out.println("The costs of all presents are: " + FACTORY.getExpenses());
    }

    private void stat12() {
        Child mostCostlyChild = null;
        double maxSum = 0;
        for (int i = 0; i < FACTORY.getPostBox().size(); i++) {
            Letter letter = FACTORY.getPostBox().get(i);
            Child child = letter.getChild();
            double sum = 0;
            for (int j = 0; j < letter.getDesiredPresents().size(); j++) {
                sum += letter.getDesiredPresents().get(j).getPrice();
            }
            if (mostCostlyChild == null) {
                mostCostlyChild = child;
                maxSum = sum;
            } else {
                if (maxSum < sum) {
                    maxSum = sum;
                    mostCostlyChild = child;
                }
            }
        }
        System.out.println("The child with the most costly present is: " + mostCostlyChild.getName() + ". Sum ot the present is: " + maxSum);
    }

    private void stat13() {
        System.out.println("Present denials: " + FACTORY.getPresentDenials());
    }
}
