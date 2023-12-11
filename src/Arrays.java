public class Arrays {

    public static void main(String args[]){
        //An array
        String[] values = {"A", "B", "C", "D", "E"};

        //An array of cars
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        //Printing out values
        System.out.println(values[0]);

        //Printing the array length
        System.out.println(values.length);

        //Looping through the array
        for(int i = 0; i < cars.length; i++){
            System.out.println("Car Name: " + cars[i]);
        }
    }
}
