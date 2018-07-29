public static void writeNums(int num) {
    if (num < 1) {
        throw new IllegalArgumentException();
    } else if (num == 1) {
        System.out.print("1");
    } else {
        writeNums(num - 1);
        System.out.print(", " + num);
    }
}
