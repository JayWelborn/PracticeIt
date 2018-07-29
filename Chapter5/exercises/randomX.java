public static void randomX() {
    Random r = new Random();
    int x = 0;
    while(x <= 16) {
        x = r.nextInt(15) + 5;
        for (int i = 0; i < x; i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
