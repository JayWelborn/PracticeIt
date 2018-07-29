public int max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int x : arr) {
        if (max < x) {
            max = x;
        }
    }
    return max;
}
