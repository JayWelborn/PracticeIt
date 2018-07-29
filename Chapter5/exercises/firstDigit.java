public static int firstDigit(int x) {
    x = Math.abs(x);
    while (x >= 10) {
        x /= 10;
    }
    return x;
}
