public double slope(Point other) {
    if (other.x == this.x) {
        throw new IllegalArgumentException();
    }
    return Math.abs((double) (other.y - this.y) / (double) (this.x - other.x));
}
