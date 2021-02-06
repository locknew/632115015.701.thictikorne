package week9;

public class Testoveride1 {
    public static void main(String[]args){

        Person person1;
        person1 = new Person("Mark",2001);

        person1.introduce();
        Sheriff person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();

        Teacher person3 = new Teacher("Ball",1977,"CMU");
        person3.introduce();
        Prime person4 = new Prime("Tu",1954,"Thailand");
        person4.introduce();
        Football person5 =new Football("Messi",1987,"Barcelona footbal club");
        person5.introduce();
        Doctor person6 = new Doctor("Max",1980,"Bangkok");
        person6.introduce();
    }
    
}
