public static int kthLargest(int k, int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - k - 1];
}
