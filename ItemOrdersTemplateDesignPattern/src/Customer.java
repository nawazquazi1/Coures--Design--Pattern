public class Customer {
    public static void main(String[] args) {
        StoreOrder storeOrder=new StoreOrder();
        storeOrder.processOrder();
        System.out.println("\n");

        OnlineOrder onlineOrder=new OnlineOrder();
        onlineOrder.isGiftWrap=true;
        onlineOrder.processOrder();
    }
}
