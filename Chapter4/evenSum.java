public static void evenSum() {
    Scanner console = new Scanner(System.in);
    int sum = 0;
    int max = Integer.MIN_VALUE;
    System.out.print("how many integers? ");
    int loops = console.nextInt();

    for (int i = 0; i < loops; i++) {
        System.out.print("next integer? ");
        int userIn = console.nextInt();
        if (userIn % 2 == 0) {
            sum += userIn;
            if (userIn > max) {
                max = userIn;
            }
        }
    }

    System.out.println("even sum = " + sum);
    System.out.println("even max = " + max);
}
