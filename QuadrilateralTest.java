// QuadrilateralTest.java
public class QuadrilateralTest {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(1, 3);
        Point p4 = new Point(5, 3);

        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        System.out.printf("Trapezoid Area: %.2f\n", trapezoid.getArea());

        Point p5 = new Point(0, 0);
        Point p6 = new Point(4, 0);
        Point p7 = new Point(0, 3);
        Point p8 = new Point(4, 3);

        Parallelogram parallelogram = new Parallelogram(p5, p6, p7, p8);
        System.out.printf("Parallelogram Area: %.2f\n", parallelogram.getArea());

        RectangleNew rectangleNew = new Rectangle(p5, p6, p7, p8);
        System.out.printf("RectangleNew Area: %.2f\n", rectangleNew.getArea());

        Point p9 = new Point(0, 0);
        Point p10 = new Point(2, 0);
        Point p11 = new Point(0, 2);
        Point p12 = new Point(2, 2);

        Square square = new Square(p9, p10, p11, p12);
        System.out.printf("Square Area: %.2f\n", square.getArea());
    }
}
