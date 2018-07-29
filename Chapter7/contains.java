public static boolean contains (int[] a1, int[] a2) {
    if (a1.length < a2.length) {
        return false;
    }
    if (Arrays.equals(a1, a2)) {
        return true;
    }

    for (int i = 0; i < a1.length - a2.length + 1; i++) {
        if (a1[i] == a2[0]) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i + j] != a2[j]) {
                    break;
                }
                if (j == a2.length - 1) {
                    return true;
                }
            }
        }
    }
    return false;
}
