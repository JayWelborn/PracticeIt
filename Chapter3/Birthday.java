import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        inputBirthday(in);
    }
    public static void inputBirthday(Scanner in) {

        System.out.print("On what day of the month were you born? ");
        int day = in.nextInt();

        System.out.print("What is the name of the month in which you were born? ");
        String month = in.next();

        System.out.print("During what year were you born? ");
        int year = in.nextInt();

        String birthday = month + " " + day + ", " + year;
        System.out.print("You were born on " + birthday + ".");
        System.out.println(" You're mighty old!");
    }
}
