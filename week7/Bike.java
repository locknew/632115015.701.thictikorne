package week7;

public class Bike {
    public static void main(String[] args) {

        Fixedgear bicycle1 = new Fixedgear(5);

        bicycle1.increased();
        bicycle1.increased();
        bicycle1.increased();
        bicycle1.current();

        Gear bicycle2 = new Gear(10);

        bicycle2.changegear(3);
        bicycle2.increased(10);
        bicycle2.current();

    }

}
