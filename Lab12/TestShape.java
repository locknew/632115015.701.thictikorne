package Lab12;

public class TestShape {
    public static void main(String[]args){
        Regtangle reg1 = new Regtangle(5,6);
        Triangle tri1 = new Triangle(10,12);
        Circle cir1 = new Circle(10);

        System.out.println("area of regtangle = "  + reg1.getArea());
        System.out.println("area of triangle = "  + tri1.getArea());
        System.out.println("area of circle = "  + cir1.getArea());



    }
    
}
