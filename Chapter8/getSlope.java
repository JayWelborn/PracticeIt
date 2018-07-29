public double getSlope() {
    if (p1.x != p2.x) {
        return (double) (p2.y - p1.y) / (double) (p2.x - p1.x);
    } else {
        throw new IllegalStateException();
    }
}
