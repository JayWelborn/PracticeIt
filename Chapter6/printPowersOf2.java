public static void printPowersOf2(int x) {
    System.out.print(1);
    for (int i = 1; i <= x; i++) {
        System.out.print(" " + (int) Math.pow(2, i));
    }
    System.out.println();
}
