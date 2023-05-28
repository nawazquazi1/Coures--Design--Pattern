import course.imodel.IceCream;
import course.model.*;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream=new ButterScotchIceCream();
        iceCream=new ChocoChipsDecorator(new ChocolateSyrupDecorator(iceCream));
        System.out.println("Desc : "+iceCream.getDescription());
        System.out.println("Cost : "+iceCream.cost());

        IceCream chocolateIceCream =new ChocolateIceCream();
        chocolateIceCream=new RainbowSprinkleDecorator(new ChocoChipsDecorator(new ChocolateSyrupDecorator(chocolateIceCream)));
        System.out.println("Desc : "+chocolateIceCream.getDescription());
        System.out.println("Cost : "+chocolateIceCream.cost());

    }
}
