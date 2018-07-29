public static void spending(Scanner console, String name) {
    System.out.print("How much will " + name + " be spending? ");
    double amount = console.nextDouble();
    System.out.println();
    int numBills = (int) (amount / 20.0);
    if (numBills * 20.0 < amount) {
        numBills++;
    }
    System.out.println(name + " needs " + numBills + " bills");
}
