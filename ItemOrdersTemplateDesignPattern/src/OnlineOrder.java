public class OnlineOrder extends OrderProcessTemplate{
    @Override
    public void selectProduct() {
        System.out.println("Selecting Product adding to Cart");
    }

    @Override
    public void makePayment() {
        System.out.println("Making Cod of online Payment at App");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Product dispatched..");
    }
}
