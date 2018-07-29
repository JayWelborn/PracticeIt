public static String getFileName() {
    Scanner console = new Scanner(System.in);
    while (true) {
        System.out.print("Type a file name: ");
        String name = console.next();
        File file = new File(name);
        if (file.exists()) {
            return name;
        }
    }
}
