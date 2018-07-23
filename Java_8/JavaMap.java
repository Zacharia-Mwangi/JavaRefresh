package Java_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaMap {

    public static void main (String [] args){
        // using map functionality
        List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
        System.out.println("Original list : " + cities); System.out.println("list transformed using Java 8 :" + transform(cities));

        // using map and lambda expressions
        List <Double> costBeforeTax = Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0);
        costBeforeTax.stream() //stream
                     .map((cost) -> cost + .16*cost)
                     .forEach(System.out::println); // Method Reference
    }

    // Transform method
    public static List<String> transform(List<String> listOfStrings){
        return listOfStrings.stream() // convert list into stream
                            .map(String::toUpperCase) // convert to uppercase
                            .collect(Collectors.toList()); // Collect results into a new list
    }
}
