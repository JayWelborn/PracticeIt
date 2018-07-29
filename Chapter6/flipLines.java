public static void flipLines (Scanner input) {
    while (input.hasNextLine()) {
        String current = input.nextLine();
        if (input.hasNextLine()) {
            System.out.println(input.nextLine());
            System.out.println(current);
        } else {
            System.out.println(current);
        }
    }
}
