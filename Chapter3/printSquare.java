public static void printSquare(int min, int max) {
    for (int i = min; i <= max; i++) {
        for (int j = 0; j <= max - min; j++) {
            if (i + j <= max) {
                System.out.print(i + j);
            } else {
                System.out.print(i + j - max + min - 1);
            }
        }
        System.out.println();
    }
}
