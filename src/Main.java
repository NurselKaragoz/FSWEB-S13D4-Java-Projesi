import com.homework.Point;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Point point1 = new Point(3, 4);
        Point point2 = new Point(0, 0);
        System.out.println(point2.Distance());
        System.out.println(point1.Distance(3,8));
    }
}