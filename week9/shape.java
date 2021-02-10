package week9;

public class shape {
    int height,width,length;
    
    public shape(int width2, int height2) {

        this.height = height2;
        this.width =width2;
      

	}
    public shape(int length){
        this.length = length;
    }
    public shape(){
       
    }

	public String toString(){

        return "This is a shape";
    }
}
