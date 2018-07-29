public static String starString(int pow) {
    String stars = "";
    if (pow < 0) {
        throw new IllegalArgumentException();
    } else {
        for (int i = 0; i < Math.pow(2, pow); i++) {
            stars += "*";
        }
    }
    return stars;
}
