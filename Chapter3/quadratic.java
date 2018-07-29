public static void quadratic(int a, int b, int c) {
    double topRoot = Math.sqrt(b * b - 4 * a * c);
    double numeratorOne = -b + topRoot;
    double numeratorTwo = -b - topRoot;
    double rootOne = numeratorOne / ((double) 2 * a);
    double rootTwo = numeratorTwo / ((double) 2 * a);

    System.out.println("First root = " + rootOne);
    System.out.println("Second root = " + rootTwo);
}
