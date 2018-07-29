public static void swapPairs(String[] arr) {
    for (int i = 1; i < arr.length; i += 2) {
        String temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
    }
}
