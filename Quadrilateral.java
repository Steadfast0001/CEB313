// Quadrilateral.java
public class Quadrilateral {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }
    public Point getP4() { return p4; }

    @Override
    public String toString() {
        return String.format("P1: %s, P2: %s, P3: %s, P4: %s", 
                p1, p2, p3, p4);
    }
}
