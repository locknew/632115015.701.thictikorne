package week9;

public class Person {
    String name;
    int bornyear;

    public Person(String name, int bornYear){
        this.name = name;
        this.bornyear = bornYear;


    }

    public void introduce(){
        System.out.println("My name is " + name + ",");
        System.out.println("I was born in " + bornyear +".");

    }
    
}
