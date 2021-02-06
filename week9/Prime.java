package week9;

public class Prime extends Person{
    String workState;
    public Prime(String name,int bornyear, String workState){
        super(name,bornyear);
        this.workState=workState;



    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a prime minister and work in "+ workState + ".");
    }

       
    
}
