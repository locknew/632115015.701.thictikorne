package week6;
//thictikorne vin 632115015
public class Fisherman extends Person{
    String place;
    public Fisherman(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void got(){
        System.out.println(name + " is fishing at " + place );
    }
    
}
