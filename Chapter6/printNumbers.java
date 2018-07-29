public static void printNumbers(int x) {
    for (int i = 1; i <= x; i++) {
        System.out.printf("[%d]", i);
        if (i != x ) {
            System.out.print(" ");
        }
    }
    System.out.println();
}
