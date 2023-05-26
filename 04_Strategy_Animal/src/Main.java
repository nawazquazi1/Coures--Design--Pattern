import com.kejeiri.java.Controller.ItFlys;
import com.kejeiri.java.course.model.Animal;
import com.kejeiri.java.course.model.Bird;
import com.kejeiri.java.course.model.Dog;

public class Main {
    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();
        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());
        // This allows dynamic changes for flyingType
        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFly());

    }
}
