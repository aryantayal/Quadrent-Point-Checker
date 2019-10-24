public class Lab7 {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        int quad = point1.quadrant();
        //System.out.print(point1 );
        System.out.println(quad);

        //You do this: create another point that represents (-2, 7)
        Point point2 = new Point(-2, 7);
        int quad2 = point2.quadrant();
        //System.out.print(point2);
        System.out.println(quad2);
        //prints the information for the first point
        //point1.print();

        //You do this: print the information for your second point
        //You do this: call the quadrant method for each point, and print each result
    }
}