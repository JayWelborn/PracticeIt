public static int median(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length / 2];
}
