public class Student {
    String Name;
    int Age;
    Double gpa;
    public Student(String name, int age,double gpa){

        this.Name = name;
        this.Age  =age;
        this.gpa = gpa;




    }
 
    
    public boolean equal(String n){
        return this.Name ==n;

    }
    public boolean equal(int a){
        return this.Age ==a;

    }
    public boolean equal(Double G){
        return this.gpa ==G;

    }
}
