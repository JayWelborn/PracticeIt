public static int zeroDigits(int number) {
    int zeros = 0;
    do {
        if (number % 10 == 0) {
            zeros++;
        }
        number /= 10;
    } while(number > 0);
    return zeros;
}
