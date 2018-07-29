public class LoopTable {
    public static void main(String[] args) {
        printSequence(15, -11);

        printSequence(-10, 40);

        printSequence(4, -11);

        printSequence(-3, 100);
    }

    public static void printSequence(int coefficient, int constant) {
        System.out.println("coefficient = " + coefficient);
        System.out.println("constant = " + constant);
        for (int i = 1; i <= 6; i++) {
            System.out.print(coefficient * i + constant + ", ");
        }
        System.out.println("\n");
    }
}
