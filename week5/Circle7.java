package week5;

import java.util.Scanner;
// thictikorne vin 632115015//

public class Circle7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Circle");
        Circle7 all[] = new Circle7[input.nextInt()];

        for (int i = 0; i < all.length; i++) {
            System.out.println("please input  1. origin X 2. Y  3. Radius  if you not input radius will be 1");
            all[i] = new Circle7(input.nextDouble(), input.nextDouble(), input.nextLine());

        }
        for (int i = 0; i < all.length; i++) {

            System.out.println("Area of Circle " + (i + 1) + " = " + all[i].Area());
            System.out.println("Circumferrence of Circle " + (i + 1) + " = " + all[i].Circumference());

        }
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all.length; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println("Is Circle " + (i + 1) + " intersec Circle" + (j + 1) + " : "
                        + Circle(all[i].x, all[j].x, all[i].y, all[j].y, all[i].Radius, all[j].Radius));

            }
        }
        input.close();
    }

    double x, y, Radius;

    public Circle7(double Ori1, double Ori2, String Ra) {
      
        if (Ra.trim().isEmpty()) {
            Radius = 1;
            this.x = Ori1;
            this.y = Ori2;
        } else {
            this.x = Ori1;
            this.y = Ori2;
            this.Radius = Double.parseDouble(Ra);
        }
        if (this.Radius < 0) {
            this.Radius = 0;
        }

    }

    public double Area() {
        return Math.PI * Math.pow(this.Radius, 2);
    }

    public double Circumference() {
        return 2 * Math.PI * this.Radius;

    }

    public static boolean Circle(double x1, double x2, double y1, double y2, double r1, double r2) {
        double distance = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
        double radsum = Math.pow(r1 + r2, 2);

       
     if (distance < radsum)
            return true;
    else
            return false ;

    }
}