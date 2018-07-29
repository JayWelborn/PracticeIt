public static boolean isPalindrome(String[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        if (!arr[i].equals(arr[arr.length - 1 - i])) {
            return false;
        }
    }
    return true;
}
