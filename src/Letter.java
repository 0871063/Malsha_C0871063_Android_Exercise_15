public class Letter extends Post {
    private Format format;

    public Letter(double weight, ShippingMethod shippingMethod, String destination, Format format) {
        super(weight,shippingMethod,destination);
        this.format = format;
    }

    @Override
    public double shoppingAmount() {
        double basefare = 0.0;

        if (format == Format.A3) {
            basefare = 3.50;
        } else {
            basefare = 2.50;
        }
        double amount = basefare + 1.0 * (weight/1000.0);
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

    @Override
    public String display() {
        return super.display()  + "\n\tFormat : " + format;
    }
}