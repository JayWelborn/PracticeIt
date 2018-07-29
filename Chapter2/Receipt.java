// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.
public class Receipt {
    public static void main(String[] args) {
        int subTotal = 38 + 40 + 30;
        double taxRate = .08;
        double tipRate = .15;
        double total = subTotal + subTotal * taxRate + subTotal * tipRate;

        System.out.println("Subtotal:");
        System.out.println(subTotal);
        System.out.println("Tax:");
        System.out.println(subTotal * taxRate);
        System.out.println("Tip:");
        System.out.println(subTotal * tipRate);
        System.out.println("Total:");
        System.out.println(total);

    }
}
