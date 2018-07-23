package Java_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Lambdas {
    public static void main (String [] args){

        // Iterate over List
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));

        // Use with Anonymous classes too
    }


}
