public boolean hasAnOddDigit(int x) {
    x = Math.abs(x);
    while (x > 0) {
        if ((x % 10) % 2 == 1) {
            return true;
        }
        x /= 10;
    }
    return false;
}
