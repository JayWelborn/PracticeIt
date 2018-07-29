public static String toBinary(int x) {
    String binary = "";
    while (x > 0) {
        binary = x % 2 + binary;
        x /= 2;
    }
    if (binary.length() == 0) { // if binary string is still empty, x was 0
        return "0";
    }
    return binary;
}
