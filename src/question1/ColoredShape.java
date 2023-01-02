package question1;

public abstract class ColoredShape extends Shape {
    private String color;

    public abstract String getColor();

    public void setColor(String color) {
        this.color = color;
    }
}

class ColoredCircle extends ColoredShape {
    private double Radius;
    private String color;

    public ColoredCircle(double Radius, String color) {
        this.Radius = Radius;
        this.color = color;
    }

    public double getRadius() {
        this.Radius = Radius;
        return Radius;
    }

    public double setRadius(double radius) {
        return Radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColoredCircle{" +
                "color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class ColoredRectangle extends ColoredShape {
    private String color;
    private double Width;
    private double Height;


    public ColoredRectangle(double Width, double Height, String color) {
        this.Width = Width;
        this.Height = Height;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColoredRectangle{" +
                "color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        this.Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        this.Height = height;
    }

    @Override
    public double area() {
        return getWidth()*getHeight();
    }
}


