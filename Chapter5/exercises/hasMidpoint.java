public static boolean hasMidpoint(int a, int b, int c) {
    return c - b == b - a || c - a == a - b || a - c == c - b;
}
