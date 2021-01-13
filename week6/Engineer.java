package week6;

public class Engineer extends Person{
    String genre;
    public Engineer(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void kind(){
        System.out.println(name + " is  " + genre + "Engineer");
    }
}
