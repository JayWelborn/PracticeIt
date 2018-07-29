import java.io.*;
import java.util.Scanner;

public class PrintMyself {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner self = new Scanner(new File("PrintMyself.java"));
        while (self.hasNextLine()) {
            System.out.println(self.nextLine());
        }
    }
}
