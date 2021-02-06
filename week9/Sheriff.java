package week9;

public class Sheriff  extends Person{
String workState;
    public Sheriff(String name,int bornyear, String workState){
        super(name,bornyear);
        this.workState=workState;



    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff and work in "+ workState + ".");
    }

       
}
