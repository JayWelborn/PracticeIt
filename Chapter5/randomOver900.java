Random rand = new Random();
int number = Integer.MIN_VALUE;
do {
    number = rand.nextInt(1000);
    System.out.println("Random number: " + number);
} while (number < 900);
