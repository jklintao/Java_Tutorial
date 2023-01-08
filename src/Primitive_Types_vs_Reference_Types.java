import java.awt.*;

public class Primitive_Types_vs_Reference_Types {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = point1;
        // In this example, point1 and point2 are referencing the same address
        // point object in memory. They are not independent of each other. If
        // the point object is changed in one variable, the changes will be
        // visible to the other variable.
        point1.x = 2;
        System.out.println(point2);
        // Reference Types are copied by the reference, while primitive types are copied by
        // their value. The values in primitive types are completely independent of each other.
    }
}
