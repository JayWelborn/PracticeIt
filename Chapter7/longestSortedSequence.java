public static int longestSortedSequence(int[] arr) {
    if (arr.length == 0) {
        return 0;
    }
    int longest = 1, current = 1;
    for(int i = 1; i < arr.length; i++) {
        if (arr[i] >= arr[i - 1]) {
            current++;
        } else {
            current = 1;
        }
        if (current > longest) {
            longest = current;
        }
    }
    return longest;
}
