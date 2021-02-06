package week9;

public class Testshape {

    public static void main(String[]args){

        cube c = new cube(50);
        regtangle reg = new regtangle(20,50);
        shape sh = new shape(20);

        System.out.println(c.toString());
        System.out.println(reg.toString());
        System.out.println(sh.toString());


    }
    
}
