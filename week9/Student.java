package week9;

public class Student {
    private String firstname ="Hello";
    private String lastname = "World";

    public Student(String name,String lastname){

        this.firstname = name;
        this.lastname = lastname;
    }

    public String toString(){
        return "My First name is " +firstname + " last name " +lastname;
    }

    public static void main(String[]args){
        Student p = new Student("THICTIKORNE " ,"VIN");
        System.out.println(p.toString());
    }
    
}
