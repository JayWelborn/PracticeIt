import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        longestName(in, 5);
    }

public static void longestName(Scanner in, int reps) {

    String name = "";
    boolean tie = false;

    for (int i = 1; i <= reps; i++) {

        System.out.printf("name #%d? ", i);
        String next = in.next();

        if (next.length() > name.length()) {
            name = next;
            tie = false;
        } else if (next.length() == name.length()) {
            tie = true;
        }
    }

    name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

    System.out.printf("%s's name is longest\n", name);

    if(tie) {
        System.out.println("(There was a tie!)");
    }
}
}
