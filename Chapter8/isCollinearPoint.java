public boolean isCollinear(Point p1, Point p2) {
    double slopeOne = (double) (p1.y - this.y) / (double) (p1.x - this.x);
    double slopeTwo = (double) (p2.y - this.y) / (double) (p2.x - this.x);

    return Math.round(slopeOne * 10000) == Math.round(slopeTwo * 10000);
}
