public static String readEntireFile(Scanner file) {
    String ret = "";
    while (file.hasNextLine()) {
        ret += file.nextLine() + "\n";
    }
    return ret;
}
