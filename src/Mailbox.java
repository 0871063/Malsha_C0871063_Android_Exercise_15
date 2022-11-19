import java.util.ArrayList;

public class Mailbox {
    public static void main(String[] args) {

        ArrayList<Post> postList = new ArrayList<>();
        postList.add(new Letter( 200.0,ShippingMethod.EXPRESS,"Chemin des Acacias 28, 1009 Pully",Format.A3));
        postList.add(new Letter(800.0,ShippingMethod.NORMAL,"",Format.A4));
        postList.add(new Advertisement(1500.0,ShippingMethod.EXPRESS,"Les Moilles 13A, 1913 Saillon"));
        postList.add(new Advertisement(3000.0,ShippingMethod.NORMAL,""));
        postList.add(new Parcel(5000.0,ShippingMethod.EXPRESS,"Grand rue 18, 1950 Sion Price: $25.0",30.0));
        postList.add(new Parcel(3000.0,ShippingMethod.EXPRESS,"Chemin des fleurs 48, 2800 Delemont",70.0));

        System.out.println("The total amount of postage is "  + stamp(postList) );
        display(postList);
        System.out.println("The box contains "  + invalidMails(postList) + " invalid mails" );
    }

    public static double stamp(ArrayList<Post> posts){
        double amount = 0.0;
        for( Post p : posts){
            amount = amount + p.shoppingAmount();
        }
        return amount;
    }

    public static int invalidMails(ArrayList<Post> posts){
        int count = 0;
        for( Post p : posts){
            if(p.invalidMail()) {
                count += 1;
            }
        }
        return count;
    }
    public static void display(ArrayList<Post> posts){
        int count = 0;
        for( Post p : posts){

            System.out.println(p.display());
        }
    }
}

