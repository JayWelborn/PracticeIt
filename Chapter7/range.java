public static int range(int[] arr) {
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    for (int x : arr) {
        if (x > max) {
            max = x;
        }
        if (x < min) {
            min = x;
        }
    }
    return max - min + 1;
}
