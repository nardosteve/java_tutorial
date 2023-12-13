public class Methods {

    String myName = "Stephen Mungai Muroki";

    //Basic method
    //VOID - no return type
    static void myName(){
        //Instance of class Methods
        //Static function
        Methods user = new Methods();
        System.out.println("My name is: " + user.myName);
    }

    //Method with params
    //Dynamic function
    static void getUser(String fname, int age){
        System.out.println("Firstname: " + fname + ", Age: " + age);
    }

    public static void main(String args[]){
        //No arguments
        myName();

        //Passing arguments
        getUser("Nardosteve", 23);

    }
}
