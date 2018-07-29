public static void writeSquares(int num) {
    if (num < 1) {
        throw new IllegalArgumentException();
    } else if (num == 1) {
        System.out.print(1);
    } else if (num % 2 == 0) {
        writeSquares(num - 1);
        System.out.print(", " + (num * num));
    } else {
        System.out.print(num * num + ", ");
        writeSquares(num - 1);
    }
}
