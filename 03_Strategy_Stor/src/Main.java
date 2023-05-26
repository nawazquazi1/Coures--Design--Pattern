import com.kejeiri.java.course.Controller.ApplyDiscount;
import com.kejeiri.java.course.model.CashbackDiscount;
import com.kejeiri.java.course.model.FlatDiscount;

public class Main {

    public static void main(String[] args) {
        ApplyDiscount applyDiscount=new ApplyDiscount(new CashbackDiscount());
        applyDiscount.getDiscount();

        ApplyDiscount applyDiscount1=new ApplyDiscount(new FlatDiscount());
        applyDiscount1.getDiscount();
    }
}
