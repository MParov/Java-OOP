package snejanka.presents;

import snejanka.Child;

public class Cloth extends Present {
    private String size;
    private String material;

    public Cloth(Child child, String size, String material) {
        super(child);
        //ToDo validation of size and material;
        this.size = size;
        this.material = material;
/*        if(size.charAt(0).)

        switch (size) {
            case "S":
                this.size = "S";
                break;
            case "M":
                this.size = "M";
                break;
            case "L":
                this.size = "L";
                break;
            default:
                this.size = "XL";
                break;
        }*/
    }

    @Override
    protected double getMinPrice() {
        return 2;
    }

    @Override
    protected double getMaxPrice() {
        return 12;
    }
}
