public class Student {

    int id;
    String name;
    String dob;
    String courseName;
    int age;

    public void userId(int uid){
        System.out.println("User ID is: " +uid);
    }

    public void studentName(String name){
        System.out.println("Student Name is: " +name);
    }

    public void studentData(int id, String name, String dob, String course, int age){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.courseName = course;
        this.age = age;
    }


    public static void main(String args[]){

        //Creating an instance of the class
        Student student1 = new Student();
        Student student2 = new Student();

        //Constructor
        Student student3 = new Student();

        //Calling the methods
        student1.userId(102480);
        student1.studentName("Stephen M Muroki");

        System.out.println("***********");

        student2.userId(132898);
        student2.studentName("Nardosteve");

        System.out.println("***********");

        student3.studentData(102480, "Stephen M Muroki", "13th April 2000", "BBIT", 23);

    }




}
