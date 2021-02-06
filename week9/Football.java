package week9;

public class Football extends Person{
    String workState;
    public Football(String name,int bornyear, String workState){
        super(name,bornyear);
        this.workState=workState;



    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a Football player and work in "+ workState + ".");
    }

       
    
}
