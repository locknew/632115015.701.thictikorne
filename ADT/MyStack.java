package ADT;

public class MyStack {
    private Student[] stack;
    private int top,cap;



public MyStack(int size) {
    stack = new Student[size];
    cap =stack.length;
    top = -1;
    
    }
    
    public void push(Student s) {
        stack[++top] = s;
       

    }
    public void pop(){
        stack[top] = null;
        top--;


    }
    public void peek(){
        if(!isEmpty())
        stack[top].profile();
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
        for(int i=0;i<cap;i++)
        {
           if(stack[i]==null)
                {
                System.out.println("There is no " + fname + " that you looking for");
                break;
            }
                if(fname.equals(stack[i].name))
                {
            
                System.out.println("Stack in " + i );
                 break;
                }
                
        }
        

        

    }
    public static void main(String args[]){


        MyStack student = new MyStack(10);
        student.push(new Student("a","b","632"));;
        student.push(new Student("f","d","6442"));;
        student.push(new Student("d","d","6442"));;
        student.push(new Student("q","d","6442"));;
        student.push(new Student("z","d","6442"));;
        student.push(new Student("m","d","6442"));;
        student.pop();
        student.peek();
        student.search("z");

     

    }
}
