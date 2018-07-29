public static void wordWrap(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        while (line.length() > 60) {
            String substr = line.substring(0, 60);
            line = line.substring(60);
            System.out.println(substr);
        }
        System.out.println(line);
    }
}
