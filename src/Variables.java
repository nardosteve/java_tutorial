public class Variables {

    int age = 23;
    String firstName = "Stephen";
    String bankName = "Absa Bank PLC";
    String currency = "Ksh";
    float balance = 560000;
    boolean isSubscribed;
    char gender = 'M';

    public static void main(String args[]){

        //Creating an instance of the class Variables
        Variables user = new Variables();

        //Printing out
        System.out.println("** User Details **");
        System.out.print("My firstname is " + user.firstName + " (" + user.gender + ")" + ", my age is " + user.age + ". I have a Balance of " + user.currency+ " " + user.balance + " at " + user.bankName);
    }
}
