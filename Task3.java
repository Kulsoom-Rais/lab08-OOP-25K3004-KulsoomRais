interface Shape{
    double calcArea();
}
class Circle implements Shape{
    double r;
    public Circle(double r){
        this.r = r;
    }
    public double calcArea(){
        return Math.PI*r*r;
    }
}
 class Rectangle implements Shape{
    double l;
    double b;
    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    public double calcArea(){
         return l*b;
    }
}

public class Task3 {
    public static void main(String[] args){
        Shape C= new Circle(4);
        Shape R = new Rectangle(5,3);
        System.out.println("Area of circle: "+ C.calcArea());
        System.out.println("Area of Rectangle: "+R.calcArea());

    }
}
