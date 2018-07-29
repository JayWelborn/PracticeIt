public static String stutter(String input) {
    String stuttered = "";

    for (int i = 0; i < input.length(); i++) {
        stuttered += input.charAt(i);
        stuttered += input.charAt(i);
    }
    return stuttered;
}
