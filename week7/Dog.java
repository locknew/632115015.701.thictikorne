package week7;

public class Dog extends Pet {
String hair,size;
    public Dog(String Name,String Species,String Color,String Age){
        this.name = Name;
        this.species = Species;
        this.color = Color;
        this.age = Age;
    }
    

    public void run(String place){

        System.out.println("My dog is running to the" + place);
    }

    public void bark(){
      if(this.size.equals("small")){
          System.out.println("small bark bark!!");
      }
      else
      System.out.println(" Big Bark Bark!!!");
    
    }
    public boolean shorthair(){
        return this.hair.equals("short");
        
    }
}
