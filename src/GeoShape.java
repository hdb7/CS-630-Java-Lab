//3.Write a java program to create an abstract class named Shape
// that contains two integers and an empty method named printArea().
// Provide three classes named Rectangle, Triangle and Circle
// such that each one of the classes extends the class Shape.
// Each one of the classes contain only the method printArea( ) that prints the area of the given shape.

abstract class Shape{
    abstract void printArea();
}
class Rectangle extends Shape{
    int x,y;
    Rectangle(int a, int b){
        this.x=a;
        this.y=b;
    }
    void printArea(){
        System.out.println("Area of Rectangle: "+(x*y));
    }
}
class Triangle extends Shape{
    int x,y;
    Triangle(int a, int b){
        this.x=a;
        this.y=b;
    }
    void printArea(){
        System.out.println("Area of Triangle: "+(x*y)/2);
    }
}
class Circle extends Shape{
    double r;
    final double PI=3.14;
    Circle(double radius){
        this.r=radius;
    }
    void printArea(){
        System.out.println("Area of Circle: "+(PI*r*r));
    }
}

public class GeoShape {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10,20);
        Shape triangle = new Triangle(30,6);
        Shape circle = new Circle(2.3);
        rect.printArea();
        triangle.printArea();
        circle.printArea();
    }

}
