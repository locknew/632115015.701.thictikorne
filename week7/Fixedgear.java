package week7;

public class Fixedgear extends Bicycle {
    int constant = 5;
    public Fixedgear(int input){
        this.speed  =input;

    }
     public void increased(){
         if(this.speed<99)
         this.speed +=constant;
         else
         System.out.println("Speed reach the limit");
        
        
    }

    public void decreased(){

        this.speed -= constant;
    }
}
