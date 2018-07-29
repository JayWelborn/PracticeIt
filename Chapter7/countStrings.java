public static int countStrings(String[] haystack, String needle) {
    int ret = 0;
    for (String straw : haystack) {
        if (straw.equals(needle)) {
            ret++;
        }
    }
    return ret;
}
