public static int pow(int base, int exp) {
    if (exp == 0) {
        return 1;
    }

    int product = base;
    for (int i = 1; i < exp; i++ ) {
        product *= base;
    }
    return product;
}
