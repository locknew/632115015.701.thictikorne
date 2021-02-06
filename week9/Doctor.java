package week9;

public class Doctor extends Person{
    String workState;
    public Doctor(String name,int bornyear, String workState){
        super(name,bornyear);
        this.workState=workState;



    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a Doctor and work in "+ workState + ".");
    }

       
    
}
