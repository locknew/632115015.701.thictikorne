

public class Palindrome{
    String id;
    
    
    public Palindrome(String ID){
        this.id = ID;
        
    }
   

    
}

 class MyStack {
    private Palindrome[] stack;
    private int top,cap;



public MyStack(int size) {
    stack = new Palindrome[10];
    cap =stack.length;
    top = -1;
    
    }
    
    public void push(Palindrome s) {
        stack[++top] = s;
       

    }
    public void pop(){

        stack[top] = stack[top--];
      
      
       

    }
    public void peek(){
        if(!isEmpty())
        System.out.println(stack[top].id);
        else
        System.out.println("empty");
      

    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return (top == cap - 1);
    }
    public void search(String fname){

        for(int i =0;i<stack.length;i++)
        {
            if(fname.equals(stack[i].id))
            {
                System.out.println(fname + " is in "+ i  );
                break;
            }
           if(stack[i].id.equals(null))
            System.out.println("there is no "+fname + " in this stack");
            
        }

    }
    public static void main(String args[]){

		Palindrome A = new Palindrome("632115015");
		Palindrome B = new Palindrome("632115020");

        MyStack student = new MyStack(10);
        student.push(A);
        student.push(B);
        student.pop();
        student.peek();
        student.search("632115015");
         
       

    }
    }
