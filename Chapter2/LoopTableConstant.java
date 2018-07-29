public class LoopTableConstant {
    public static void main(String[] args) {
        loopTable(2, 2, 1, 0);
        loopTable(2, 2, 2, 0);

        loopTable(4, 3, 3, 0);
        loopTable(4, 3, 5, 0);

        loopTable(-1, 2, 4, 3);
        loopTable(-1, 2, 9, 3);
    }

    public static void loopTable(int coefA, int coefB,
                                 int size, int offset){
        for (int i = 1; i <= 6; i++){
            System.out.print(coefA * i + (coefB * size + offset) + ", ");
        }
        System.out.println("\n");
    }
}
