public static void printBox(Scanner file, int length) {

    // top Row
    System.out.print("+");
    for (int i = 0; i < length + 2; i++) {
        System.out.print("-");
    }
    System.out.println("+");

    // Body
    while (file.hasNextLine()) {
        String line = file.nextLine();
        int spaces = length - line.length();

        System.out.printf("| %s", line);
        for (int i = 0; i <= spaces; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    // bottom Row
    System.out.print("+");
    for (int i = 0; i < length + 2; i++) {
        System.out.print("-");
    }
    System.out.println("+");
}
