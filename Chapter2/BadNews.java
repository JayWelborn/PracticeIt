public class BadNews {
    public static final int MAX_ODD = 21;

    public static void writeOdds(int max) {
        // print each odd number
        for (int count = 1; count <= max; count += 2) {
            System.out.print(count + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // write all odds up to 21
        writeOdds(MAX_ODD);

        // now, write all odds up to 11
        int maxOdd = 11;
        writeOdds(maxOdd);
    }
}
