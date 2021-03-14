package Lab12;

public class Circle extends Shape{
    double PI = 3.14;
    public Circle(double R){

        area = PI*R*R;
    }
    

    public double getArea(){


        return area;
    }
}
