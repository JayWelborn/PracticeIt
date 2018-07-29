public static int priceIsRight(int[] guesses, int price) {
    int minDiff = Integer.MAX_VALUE, bestGuess = -1;
    for (int x : guesses) {
        if (x <= price && price - x < minDiff) {
            minDiff = price - x;
            bestGuess = x;
        }
    }
    return bestGuess;
}
