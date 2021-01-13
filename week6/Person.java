package week6;

public class Person {
    String name;
    int age;
    public Person(){


    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;

    }
    public void introduce(){
        System.out.println("My name is  " + name);

    }
    public class Artist extends Person{
        String genre;
        public Artist(String name,int age){
            this.age = age;
            this.name = name;
        }
        public void playMusic(){
            System.out.println(name + " is playing ")
        }

    }
}
