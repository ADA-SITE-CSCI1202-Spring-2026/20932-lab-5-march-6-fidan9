public class TestMovable {
    public static void main(String[] args) {

        Point p = new Point(0, 0);
        p.printPoint();
        p.moveUp();
        p.moveRight();
        p.printPoint(); 

        Circle c = new Circle(new Point(5, 5), 3);
        c.printCircle();
        c.moveLeft();
        c.moveDown();
        c.printCircle();
    }
}