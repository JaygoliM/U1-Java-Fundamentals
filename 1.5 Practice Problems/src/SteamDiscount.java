public class SteamDiscount {
    public static void main(String[] args) {
        double steamGame = 60;
        double discount = .20;
        double discount2 = steamGame * discount;
        double price = steamGame - discount2;

        System.out.println(price);
    }
    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
}
