Scanner console = new Scanner(System.in);
System.out.print("What color do you want? ");
String color = console.next();
if (color.toUpperCase().equals("R")) {
    System.out.println("You have chosen Red.");
} else if (color.toUpperCase().equals("B")) {
    System.out.println("You have chosen Blue.");
} else if (color.toUpperCase().equals("G")) {
    System.out.println("You have chosen Green.");
} else {
    System.out.println("Unknown color: " + color);
}
