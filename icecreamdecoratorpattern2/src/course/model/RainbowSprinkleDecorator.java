package course.model;

import course.imodel.IceCream;
import course.imodel.IceCreamDecorator;

public class RainbowSprinkleDecorator extends IceCreamDecorator {
    IceCream iceCream;

    public RainbowSprinkleDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription(){
        return iceCream.getDescription()+" With Rainbow Sprinkle";
    }

    @Override
    public int cost() {
        return iceCream.cost()+ 20;

    }
}
