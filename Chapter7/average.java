public static double average (int[] arr) {
    int sum = 0;
    for (int x : arr) {
        sum += x;
    }
    return (double) sum / (double) arr.length;
}
