package eu.chrost.patterns.behavioral.strategy;

record Point(int x, int y) {

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2.0) + Math.pow(p.y - y, 2.0));
    }
}
