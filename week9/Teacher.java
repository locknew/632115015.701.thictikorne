package week9;

public class Teacher extends Person{

    String workState;
    public Teacher(String name,int bornyear, String workState){
        super(name,bornyear);
        this.workState=workState;



    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach the student in "+ workState + ".");
    }

       
    
}
