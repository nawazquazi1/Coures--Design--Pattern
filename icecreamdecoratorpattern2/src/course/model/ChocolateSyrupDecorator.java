package course.model;

import course.imodel.IceCream;
import course.imodel.IceCreamDecorator;

public class ChocolateSyrupDecorator extends IceCreamDecorator {
    IceCream iceCream;

    public ChocolateSyrupDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int cost() {
        return iceCream.cost()+30;
    }
    @Override
    public String getDescription(){
        return iceCream.getDescription()+" Chocolate Syrup";
    }

}
