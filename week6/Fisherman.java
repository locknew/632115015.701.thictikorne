package week6;

public class Fisherman extends Person{
    String place;
    public Fisherman(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void sell(){
        System.out.println(name + " is fishing at " + place );
    }
    
}
