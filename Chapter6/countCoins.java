public static void countCoins(Scanner in) {
    int sum = 0;
    String coin;
    while(in.hasNext()) {
        int current = in.nextInt();
        coin = in.next().toLowerCase();
        if (coin.equals("quarters")) {
            sum += 25 * current;
        } else if (coin.equals("dimes")) {
            sum += 10 * current;
        } else if (coin.equals("nickels")) {
            sum += 5 * current;
        } else {
            sum += current;
        }
    }
    double total = (double) sum / 100;
    System.out.printf("Total money: $%.2f\n", total);
}
