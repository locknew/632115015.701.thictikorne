package week6;
//thictikorne vin 632115015
public class Teacher extends Person{
    String subject;
    public Teacher(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void teaching(){
        System.out.println(name + " is teaching " + subject );
    }
    
    
}
