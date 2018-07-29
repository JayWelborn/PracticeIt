public static void printGrid (int rows, int cols) {
    for (int i = 1; i <= rows; i++) {
        System.out.print(i);
        for (int j = 1; j < cols; j++) {
            System.out.print(", " + (i + rows * j));
        }
        System.out.println();
    }
}
