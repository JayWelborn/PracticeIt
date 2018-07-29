public static int countInRange(int[] arr, int min, int max) {
    int count = 0;
    for (int x : arr) {
        if (x <= max && x >= min) {
            count++;
        }
    }
    return count;
}
