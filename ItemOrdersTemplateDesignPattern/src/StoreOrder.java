public class StoreOrder extends OrderProcessTemplate{
    @Override
    public void selectProduct() {
        System.out.println("Selecting Product on Store");
    }

    @Override
    public void makePayment() {
        System.out.println("Making Cash/Card Payment at Store");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Product delivered to customer");
    }
}
