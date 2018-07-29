public static void randomLines() {
    Random r = new Random();
    for (int lines = 0; lines < r.nextInt(6) + 5; lines++) {
        for (int chars = 0; chars < r.nextInt(80) + 1; chars++) {
            System.out.print((char) (r.nextInt(26) + 97));
        }
        System.out.println();
    }
}
