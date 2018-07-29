public static void xo(int size) {
    for (int i = 0; i < size; i++) {
        String line = "";
        for (int j = 0; j < size; j++) {
            if (j == i || j == size - (i + 1)) {
                line += "x";
            } else {
                line += "o";
            }
        }
        System.out.println(line);
    }
}
