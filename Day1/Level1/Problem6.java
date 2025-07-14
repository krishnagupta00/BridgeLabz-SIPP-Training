public class Problem6 {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("The discounted amount is INR " + discount);
        System.out.println("The fee you have to pay after discount is INR " + finalFee);
    }
}
