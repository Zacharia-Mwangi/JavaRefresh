package Data_Structures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arrays_Recap {

    public static void main (String [] args){
        // Reverse Array using ArrayLists
        String[] banks = {"Barclays", "HSBC", "Bank of China", "Lloyds"};
        List<String> listofbanks = Arrays.asList(banks);
        Collections.reverse(listofbanks);

        String [] reversed = listofbanks.toArray(banks);
        System.out.println("Initial List: " + Arrays.toString(banks));
        System.out.println("Reversed List: " + Arrays.toString(reversed));

        // Sort in Ascending order
        Arrays.sort(banks);
        System.out.println("Sort in Ascending Order: "  + Arrays.toString(banks) );
        // To sort in descending, reverse order of a sorted array (Sorted Ascending)





    }
}
