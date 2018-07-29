public class FirstSecond {
    public static void main(String[] args) {
        int first = 8, second = 19;
        first += second;
        second = first - second;
        first -= second;

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
