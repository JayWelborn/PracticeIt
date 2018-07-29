int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
int sentinel = 0;
Scanner console = new Scanner(System.in);
do {
    System.out.print("Type a number (or -1 to stop): ");
    sentinel = console.nextInt();
    if (sentinel > max && sentinel != -1) {
        max = sentinel;
    }
    if (sentinel < min && sentinel != -1) {
        min = sentinel;
    }
} while (sentinel != -1);
if (max != Integer.MIN_VALUE && min != Integer.MAX_VALUE){
    System.out.println("Maximum was " + max);
    System.out.println("Minimum was " + min);
}
