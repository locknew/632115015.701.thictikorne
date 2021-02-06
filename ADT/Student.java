package ADT;

public class Student{
    String id,name,last;
    
    
    public Student(String Name,String Last,String ID){
        this.id = ID;
        this.name = Name;
        this.last = Last;
        
    }

    public void profile(){

        System.out.println(this.name + "  " + this.last+ "  " + this.id);
    }

 

    
}

    
