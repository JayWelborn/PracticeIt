public static void printPowersOfN(int n, int x) {
    System.out.print(1);
    for (int i = 1; i <= x; i++) {
        System.out.print(" " + (int) Math.pow(n, i));
    }
    System.out.println();
}
