public class shapes_1 {
     public static void main(String[] args) {
       circle_1 circle=new circle_1(5);
       System.out.println("circle area:"+circle.calculateArea());
       System.out.println("circle perimeter:"+circle.calculatePerimeter());
       triangle_1 triangle=new triangle_1(3, 4, 5);
       System.out.println("triangle area:"+triangle.calculateArea());
       System.out.println("triangle perimeter:"+triangle.calculatePerimeter());
    }
}
