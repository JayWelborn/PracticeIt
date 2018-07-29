import java.util.Scanner;

class BoyGirl {
    public static void main(String[] args) {
        String scan = "Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6";
        Scanner input = new Scanner(scan);
        boyGirl(input);
    }
    public static void boyGirl(Scanner file) {
        int boySum = 0;
        int boyCount = 0;
        int girlCount = 0;
        int girlSum = 0;
        int count = 0;

        while (file.hasNext()) {
            if (count % 2 == 0) {
                boyCount++;
                file.next();
                int x = file.nextInt();;
                boySum += x;
            } else {
                girlCount++;
                file.next();
                int x = file.nextInt();
                girlSum += x;
            }
            count++;
        }

        System.out.printf("%d boys, %d girls", boyCount, girlCount);
        System.out.println();
        int diff = Math.abs(boySum - girlSum);
        System.out.println("Difference between boys' and girls' sums: " + diff);
    }
}
