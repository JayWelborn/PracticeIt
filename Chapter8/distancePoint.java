public double distance (Point other) {
    int xDiff = other.x - this.x;
    int yDiff = other.y - this.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
}
