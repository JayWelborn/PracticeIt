public static String repl(String str, int reps) {
    if (reps < 1) {
        return "";
    }
    String ret = "";
    for (int i = 0; i < reps; i++) {
        ret += str;
    }
    return ret;
}
