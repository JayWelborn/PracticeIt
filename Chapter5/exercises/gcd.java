public static int gcd(int A, int B) {
    if (B == 0 || A == B || B == 1) {
        return Math.abs(A);
    } else if (A == 1) {
        return Math.abs(B);
    }
    return gcd(B, A % B);
}
