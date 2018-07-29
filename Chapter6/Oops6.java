public class Oops6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner( new File("example.txt"));
        countWords(in);
    }

    // Counts total lines and words in the input scanner.
    public static void countWords(Scanner input) {
        int lineCount = 0;
        int wordCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();   // read one line
            lineCount++;
            Scanner lineInput = new Scanner(line);
            while (lineInput.hasNext()) {         // tokens in line
                String word = lineInput.next();
                wordCount++;
            }
        }
        
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
    }
}
