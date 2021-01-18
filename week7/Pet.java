package week7;

public class Pet {
    String name,species,color,age;
public Pet(){

}
    public Pet(String Name,String Species,String Color,String Age){

        this.name = Name;
        this.species = Species;
        this.color = Color;
        this.age = Age;

    }
    public void petdata(){
        System.out.println("Name: " + this.name +" Species: " + this.species + " Color: " + this.color
        + " Age: " + this.age);

    }
     
}
