public class Parcel extends Post {

    private double volume;

    public Parcel(double weight, ShippingMethod shippingMethod, String destination, double volume) {
        super(weight,shippingMethod,destination);
        this.volume = volume;
    }

    @Override
    public double shoppingAmount() {
        double amount = 0.25 * volume + weight / 1000.0 * 1.0;
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
    public Boolean invalidMail() {
        return destination == "" || volume > 50 ? true : false;
    }

    @Override
    public String display() {
        return super.display() + "\n\tVolume : " + volume + " liters";
    }
}
