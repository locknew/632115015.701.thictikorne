public class StudentData {


    public static void main(String[]args){

        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);


        System.out.println("check name student 1 and 2 = "  + std01.equal(std02.Name));
        System.out.println("check name student 3 and 4 = "  + std03.equal(std04.Name));
        System.out.println("check age student 1 and 2 = "  + std01.equal(std02.Age));
        System.out.println("check gpa student 1 and 2 = "  + std01.equal(std02.gpa));

    }
    
}
