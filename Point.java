public class Point implements Movable {
    int x, y; 

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y = y + 1;
    }

    public void moveDown() {
        y = y - 1;
    }

    public void moveLeft() {
        x = x - 1;
    }

    public void moveRight() {
        x = x + 1;
    }

    public void printPoint() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}