package question1;

public class TestShapes {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle area: " + c.area());

        Rectangle r = new Rectangle(3, 4);
        System.out.println("Rectangle area: " + r.area());

        ColoredCircle cc = new ColoredCircle(10, "green");
        System.out.println("ColoredCircle color: " + cc.getColor());
        System.out.println("ColoredCircle area: " + cc.area());

        ColoredRectangle cr = new ColoredRectangle(5, 4, "blue");
        System.out.println("ColoredRectangle color: " + cr.getColor());
        System.out.println("ColoredRectangle area: " + cr.area());
    }
}
