public static void showTwos(int product) {
    System.out.print(product + " = ");
    while (product % 2 == 0) {
        System.out.print("2 * ");
        product /= 2;
    }
    System.out.println(product);
}
