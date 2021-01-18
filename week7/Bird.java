package week7;

public class Bird extends Pet {
    String country;
    boolean fly;
    public Bird(String Name,String Species,String Color,String Age){
        this.name = Name;
        this.species = Species;
        this.color = Color;
        this.age = Age;
    }

    public void speak(String input){

        System.out.println(this.name + " say " + input);

    }

    public void checkcountry(){
        System.out.println(this.name + " is come from " +this.country);

    }
    public boolean canfly(){
        return this.fly;
    }
}
