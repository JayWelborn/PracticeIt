public static int countFactors(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {  // a factor
            count++;
        }
    }
    return count;
}
