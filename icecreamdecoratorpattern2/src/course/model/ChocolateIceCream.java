package course.model;

import course.imodel.IceCream;

public class ChocolateIceCream extends IceCream {

    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    public int cost() {
        return 70;
    }
}
