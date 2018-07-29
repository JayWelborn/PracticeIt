public static double stdev(int[] arr) {
    // conpute mean
    int sum = 0;
    for (int x : arr) {
        sum += x;
    }
    double mean = (double) sum / (double) arr.length;

    // compute sum of squares of differences
    double sigma = 0;
    for (int x : arr) {
        sigma += ((double) x - mean) * ((double) x - mean);
    }

    // return standard deviation
    return Math.sqrt(sigma / (double) (arr.length - 1));
}
