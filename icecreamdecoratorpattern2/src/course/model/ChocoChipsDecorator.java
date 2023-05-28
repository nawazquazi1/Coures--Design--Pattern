package course.model;

import course.imodel.IceCream;
import course.imodel.IceCreamDecorator;

public class ChocoChipsDecorator extends IceCreamDecorator {
    IceCream iceCream;

    public ChocoChipsDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " With Choco Chips";
    }

    @Override
    public int cost() {
        return iceCream.cost() + 20;

    }
}


