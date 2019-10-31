package shape;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        Shape shape1 = new Shape("red", true);
//        System.out.println(shape1.toString());
//        System.out.println(shape.toString());
//
//        System.out.println("----------------------------------------");
//
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle(2.0);
//        Circle circle3 = new Circle("red", true, 3.0);
//        System.out.println("Area: " + circle1.getArea());
//        System.out.println("Perimeter: " + circle1.getPerimeter());
//        System.out.println(circle1.toString());
//        System.out.println("Area: "+ circle2.getArea());
//        System.out.println("Perimeter: "+circle2.getPerimeter());
//        System.out.println(circle2.toString());
//        System.out.println("Area: "+ circle3.getArea());
//        System.out.println("Perimeter: "+circle3.getPerimeter());
//        System.out.println(circle3.toString());

//        System.out.println("----------------------------------------");
//
//        Rectangle rectangle = new Rectangle("red", true, 2.0, 3.0);
//        System.out.println("Area: " + rectangle.getArea());
//        System.out.println("Perimeter: " + rectangle.getPerimeter());
//        System.out.println(rectangle.toString());
//
//        System.out.println("----------------------------------------");
//
//        Square square = new Square("red", true, 3.0);
//        System.out.println("Area: " + square.getArea());
//        System.out.println("Perimeter: " + square.getPerimeter());
//        System.out.println(square.toString());
//
//        System.out.println("----------------------------------------");
//
//        Cylinder cylinder = new Cylinder("red", false, 3.0, 3.0);
//        System.out.println("Volume: " + cylinder.getVolume());
//        System.out.println(cylinder.toString());

        System.out.println("----------------------------------------");

        Triangle triangle = new Triangle(1.0, 1.0, 1.0);
        System.out.println("Area " + triangle.getArea());
        System.out.println(triangle.toString());
        triangle.setSide1(2.0);
        triangle.setSide2(2.0);
        triangle.setSide3(2.0);
        System.out.println("Area " + triangle.getArea());
        System.out.println(triangle.toString());
    }
}
