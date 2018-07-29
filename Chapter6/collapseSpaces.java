public static void collapseSpaces(Scanner in) {
    while (in.hasNextLine()) {
        Scanner line = new Scanner(in.nextLine());
        while (line.hasNext()) {
            System.out.print(line.next());
            if (line.hasNext()) {
                System.out.print(" ");
            }
        }
        if (in.hasNextLine()) {
            System.out.println();
        }
    }
}
