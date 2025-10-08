import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(0, 0), 4, 6));
        shapes.add(new Square(new Point(2, 2), 5));
        shapes.add(new Circle(new Point(-3, 1), 2.5));

        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getShapeCount());

        for (Shape s : shapes) {
            System.out.println(s.getInfo());
        }

        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}