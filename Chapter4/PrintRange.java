class PrintRange {
    public static void main(String[] args) {
        printRange(2, 7);
        printRange(19, 11);
        printRange(5, 5);
        printRange(1, 0);
        printRange(-6, -9);
    }

    public static void printRange(int first, int last) {
        if (first == last) {
            System.out.print(first);
        }
        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i);
                if (i != last) {
                    System.out.print(" ");
                }
            }
        } else if (first > last) {
            for (int i = first; i >= last; i--) {
                System.out.print(i);
                if (i != last) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
