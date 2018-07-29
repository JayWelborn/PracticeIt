public static double averageLength(String[] arr) {
    int sum = 0;
    for (String str : arr) {
        sum += str.length();
    }
    return (double) sum / (double) arr.length;
}
