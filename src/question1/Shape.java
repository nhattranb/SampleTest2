package question1;

abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double Radius;

    public Circle(double Radius) {
        this.Radius = Radius;
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
}

class Rectangle extends Shape {
    private double Width;
    private double Height;

    public Rectangle(double Width, double Height) {
        this.Width = Width;
        this.Height = Height;
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
