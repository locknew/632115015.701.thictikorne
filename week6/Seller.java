package week6;

public class Seller extends Person{
    String Sell;
    public Seller(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void sell(){
        System.out.println(name + " is selling " + Sell );
    }
    
}
