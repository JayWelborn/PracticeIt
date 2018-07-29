public class ComputePay {
    public static void main(String[] args) {
        int hoursWorked = 4 + 5 + 8 + 4;
        double wage = 8.75;
        double tax = 0.20;
        double weeklyPay = hoursWorked * wage;

        // Calculate pay at work based on hours worked each day
        System.out.println("My total hours worked:");
        System.out.println(hoursWorked);

        System.out.println("My hourly salary:");
        System.out.println("$" + wage);

        System.out.println("My total pay:");
        System.out.println(weeklyPay);

        System.out.println("My taxes owed:"); // 20% tax
        System.out.println(weeklyPay * tax);
    }
}
