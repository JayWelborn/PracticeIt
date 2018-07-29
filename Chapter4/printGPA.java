public static void printGPA() {
    System.out.print("Enter a student record: ");
    int sum = 0;
    Scanner console = new Scanner(System.in);
    Scanner line = new Scanner(console.nextLine());
    String name = line.next();
    int grades = line.nextInt();

    for (int i = 0; i < grades; i++) {
        sum += line.nextInt();
    }
    double average = (double) sum / (double) grades;

    System.out.printf("%s's grade is %s", name, Double.toString(average));
}
