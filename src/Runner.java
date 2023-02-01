//import java.util.ArrayList;
//
//public class Runner {
//    public static void main (String arg[]) {
//        ArrayList <Integer> ints = new ArrayList<>();
//
//        ints.add(10);
//        ints.add(5);
//        ints.add(24);
//
//        System.out.println(ints);
//
//
//    }
//}

//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Runner {
//    public static void main (String arg[]) {
//        // create an array with the known types
//        Integer[] intsArray = {1, 2, 3, 4, 5};
//
//// use the Arrays.asList utility method to convert the array to a list "inline"
//        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
//        System.out.println(intList);
//
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main (String arg[]) {

        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car("Camry", 8400);
        Car car3 = new Car("Ram", 17200);

        // create an array with the known types
        Car[] carsArray = {car1, car2, car3};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carList);

    }
}

