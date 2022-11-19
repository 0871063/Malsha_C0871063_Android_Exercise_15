public abstract class Post {

    protected double weight;
    protected ShippingMethod shippingMethod;

    protected String destination;

    public Post(double weight, ShippingMethod shippingMethod , String destination) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        this.destination = destination;
    }

    public abstract double shoppingAmount();

    public Boolean invalidMail(){
        return destination == "" ? true : false;
    }

    public String display(){
        String valid = invalidMail() ? "\n\t(Invalid courier)" : "";
        String shipping = shippingMethod == ShippingMethod.EXPRESS ? "yes" : "no";
        return  getClass().getSimpleName() +  valid + "\n\tWeight " + weight + " grams \n\tExpress: " +
                shipping +"\n\tDestination: " + destination + " Price: $" + shoppingAmount();
    }
}
