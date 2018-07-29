import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner in = new Scanner(System.in);
        String name1 = in.next();
        String name2 = in.next();
        
        nameGame(name1);
        nameGame(name2);
    }
    
    public static void nameGame(String name) {
        char first = name.charAt(0);
        System.out.println(name + " " + name + ", bo-" + name.replace(first, 'B'));
        System.out.println("Banana-fana fo-" + name.replace(first, 'F'));
        System.out.println("Fee-fi-mo-" + name.replace(first, 'M'));
        System.out.println(name.toUpperCase() + "!");
    }
}
