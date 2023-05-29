public abstract class OrderProcessTemplate {
    boolean isGiftWrap;

    public abstract void selectProduct();

    public abstract void makePayment();

    private void packProduct() {
        if (isGiftWrap) {
            System.out.println("Gift Wrapping Product");
        } else {
            System.out.println("Simply Packed Product");
        }
    }

    public abstract void deliverProduct();

    public final void processOrder() {
        selectProduct();
        makePayment();
        packProduct();
        deliverProduct();
    }

}
