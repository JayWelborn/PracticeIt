public static void printEntireFile() throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("Type a file name: ");
    Scanner fileScanner = new Scanner(new File(console.next()));
    while (fileScanner.hasNextLine()) {
        System.out.println(fileScanner.nextLine());
    }
}
