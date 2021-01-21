package week7;

public class Gear extends Bicycle{
    int gear;
    public Gear(int input){
        this.speed = input;

    }
    public void changegear(int newgear){
        this.gear=newgear;

    }

    public void increased(int input){
       if(this.speed <99)
        this.speed = this.speed + (input * this.gear);
        else
        System.out.println("Reach Max Speed");

    }
    public void decreased(int input){

        this.speed -=  input;
    }
    
}
