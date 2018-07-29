public static void smallestLargest() {
    Scanner console = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    System.out.print("How many numbers do you want to enter? ");
    int loops = console.nextInt();

    for (int i = 1; i <= loops; i++) {
        System.out.printf("Number %d: ", i);
        int userIn = console.nextInt();
        if (userIn < min) {
            min = userIn;
        }
        if (userIn > max) {
            max = userIn;
        }
    }
    System.out.println("Smallest = " + min);
    System.out.println("Largest = " + max);
}
