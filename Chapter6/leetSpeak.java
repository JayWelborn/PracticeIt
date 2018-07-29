public static void leetSpeak(Scanner in, PrintStream out) {
    while (in.hasNextLine()) {
        Scanner lineScanner = new Scanner(in.nextLine());
        while (lineScanner.hasNext()) {
            leetify(lineScanner.next(), out);
        }
    out.println();
    }
}

public static void leetify(String word, PrintStream out) {
    out.print("(");
    word = word.replace("o", "0");
    word = word.replace("l", "1");
    word = word.replace("e", "3");
    word = word.replace("a", "4");
    word = word.replace("t", "7");
    if (word.charAt(word.length() - 1) == 's') {
        word = word.substring(0, word.length() - 1) + "Z";
    }
    out.print(word);
    out.print(") ");
}
