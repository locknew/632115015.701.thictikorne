package week7;

public class Fish extends Pet {
String size,water;
int speed;
    public Fish(String Name,String Species,String Color,String Age){
        this.name = Name;
        this.species = Species;
        this.color = Color;
        this.age = Age;
    }

    public void swimtosea(){
        if(this.water.equals("salt"))
        System.out.println(this.name + "is swim to sea");
        else
        System.out.println(this.name + " is swim in fresh water ");
    }
    public void fast(){

        System.out.println(this.name + " is swimming at " + this.speed + " !!! " );
    }

    
}
