public static boolean equals (String[] one, String[] two) {
    if (one.length != two.length) {
        return false;
    }
    for (int i = 0; i < one.length; i++) {
        if (!one[i].equals(two[i])) {
            return false;
        }
    }
    return true;
}
