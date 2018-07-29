public static void printEntireFile2() throws FileNotFoundException {
    String name = getFileName();
    File input = new File(name);
    Scanner fScan = new Scanner(input);
    while (fScan.hasNextLine()) {
        System.out.println(fScan.nextLine());
    }
}
