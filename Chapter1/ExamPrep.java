public class ExamPrep {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j ++) {
                System.out.print(j);
                for (int k = 0; k < j; k ++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
