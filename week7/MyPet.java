package week7;

public class MyPet {
    public static void main(String[]args){
       
        Dog dog = new Dog("Alexander", "hotdog", "brown", "5");
        System.out.println("My " + dog.getClass().getSimpleName());
        dog.petdata();
        dog.run("garden");
        dog.size= "big";
        dog.hair = "short";
        dog.bark();
        dog.shorthair();


    }
    
}
