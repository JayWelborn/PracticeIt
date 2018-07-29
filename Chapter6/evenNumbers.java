public static void evenNumbers(Scanner file) {
    int numbers = 0, evens = 0, sum = 0;

    while (file.hasNext()) {
        int x = file.nextInt();
        if (x % 2 == 0) {
            evens++;
        }
        sum += x;
        numbers++;
    }

    System.out.printf("%d numbers, sum = %d", numbers, sum);
    System.out.println();
    double average = (double) evens / (double) numbers * 100;
    System.out.printf("%d evens (%.2f%%)", evens, average);
    System.out.println();
}
