package point;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4.0f, 5.0f);
        System.out.println(point2D.toString());
        point2D.setXY(1.0f, 1.0f);
        float[] position = point2D.getXY();
        System.out.println(position[0] + ", " + position[1]);

        System.out.println("------------------------------");

        Point3D point3D = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println(point3D.toString());
        point3D.setXYZ(1.0f, 1.0f, 1.0f);
        System.out.println(point3D.toString());
    }
}
