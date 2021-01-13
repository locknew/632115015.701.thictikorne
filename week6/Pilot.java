package week6;
//thictikorne vin 632115015
public class Pilot extends Person {
    String place;
    public Pilot(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void fly(){
        System.out.println(name + " is going to " + place );
    }
    
}
