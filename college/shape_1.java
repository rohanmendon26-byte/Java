public abstract class shape_1 {
  abstract double calculateArea();
  abstract double calculatePerimeter();
}

class circle_1 extends shape_1{
    private double radius;

    circle_1(double radius)
    {
        this.radius=radius;
    }

    double calculateArea()
    {
        return Math.PI*radius*radius;
    }

    double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}

class triangle_1 extends shape_1{
    private double side1,side2,side3;

    triangle_1(double side1,double side2,double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    double calculateArea()
    {
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    double calculatePerimeter()
    {
        return side1+side2+side3;
    }
}

