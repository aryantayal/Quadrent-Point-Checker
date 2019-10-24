public class Point {
    private int x;
    private int y;

    public Point(int newX, int newY) {
        x = newX;
        y = newY;
        System.out.print("(" + x + "," + y + ")");

        int quad = quadrant();

    }

    public int quadrant() {
        int quad = 0;
        int x = getX();
        int y = getY();
        if (x > 0 && y > 0) {
            quad = 1;
        } // Q1
        else if (x < 0 && y > 0) {
            quad = 2;
        } //Q2
        else if (x < 0 && y < 0) {
            quad = 3;
        }// Q3
        else if (x > 0 && y < 0) {
            quad = 4;
        }
        return quad;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}