public static boolean isAllVowels(String test) {
    for (int i = 0; i < test.length(); i++) {
        char current = test.toLowerCase().charAt(i);
        if (current != 'a' && current != 'i' && current != 'u' &&
            current != 'e' && current != 'o') {
            return false;
        }
    }
    return true;
}
