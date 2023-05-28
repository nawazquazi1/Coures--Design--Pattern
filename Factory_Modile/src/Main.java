import com.java.coures.Factory.MobileFactory;
import com.java.coures.InterFace.Mobile;

public class Main {
    public static void main(String[] args) {
        MobileFactory mobileFactory=new MobileFactory();
        Mobile mobile=mobileFactory.crateMobile("IPHONE");
        mobile.createMobile();

        mobile=mobileFactory.crateMobile("ONE-PLUS");
        mobile.createMobile();

        mobile=mobileFactory.crateMobile("REALM");
        mobile.createMobile();
    }
}
