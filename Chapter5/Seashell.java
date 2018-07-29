Scanner console = new Scanner(System.in);
String message = "She sells seashells by the seashore.";
String prompt = "Do you want to hear it again? ";
String response = "y";
do {
    System.out.println(message);
    System.out.print(prompt);
    response = console.next();
} while (!response.equals("n"));
