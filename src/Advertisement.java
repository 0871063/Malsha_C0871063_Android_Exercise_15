public class Advertisement extends Post {

    public Advertisement(double weight, ShippingMethod shippingMethod,String destination) {
        super(weight,shippingMethod,destination);
    }

    @Override
    public double shoppingAmount() {
        double amount = 5.0 * weight/1000.0;
        if (!invalidMail()) {
            if (shippingMethod == ShippingMethod.NORMAL) {
                return amount;
            } else {
                return amount * 2.0;
            }
        }else {
            return 0.0;
        }
    }

}
