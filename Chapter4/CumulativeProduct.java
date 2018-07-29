import java.util.Scanner;

public class CumulativeProduct {
    public static void main(String[] args) {
        System.out.print("How many numbers? ");
        Scanner in = new Scanner(System.in);

        int reps = in.nextInt();
        int product = 1;
        for (int i = 0; i < reps; i++) {
            System.out.print("Next number --> ");
            product *= in.nextInt();
        }

        System.out.printf("Product = %d\n", product);
    }
}
