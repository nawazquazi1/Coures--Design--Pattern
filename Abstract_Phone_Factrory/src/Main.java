import com.java.course.Factory.IPhoneFactory;
import com.java.course.Factory.OnePlusFactory;
import com.java.course.core.Phone;
import com.java.course.core.PhoneStore;

public class Main {
    public static void main(String[] args) {
        PhoneStore iPone=new IPhoneFactory();
        iPone.orderPhone("IPhone12");

        System.out.println("\n");

        PhoneStore onePlus=new OnePlusFactory();
        onePlus.orderPhone("One-Plus 10 T");
    }
}
