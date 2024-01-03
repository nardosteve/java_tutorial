public class Encapsulation {

    int id;
    String name;
    String dob;
    String courseName;
    int age;

    //Getters
    public int getId(){
        return id;
    }

    //Setters
    public int setId(int id){
        this.id = id;
    }

    public static void main(String args[]){

        Encapsulation student = new Encapsulation();

        student.setId(37228796);

        System.out.println("Student Name: " +student.getId());

    }
}
