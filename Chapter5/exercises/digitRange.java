public static int digitRange(int x) {
    x = Math.abs(x);
    if (x < 10) {
        return 1;
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    while (x > 0) {
        if (x % 10 > max) {
            max = x % 10;
        }
        if (x % 10 < min) {
            min = x % 10;
        }
        x /= 10;
    }

    return max - min + 1;
}
