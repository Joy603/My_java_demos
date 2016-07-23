package javaapplication2;

import java.util.ArrayList;
import java.util.Random;
import static javaapplication2.CollectionUtils.*;

/**
 *
 * This program will demonstrate Java Collections Framework
 * I utilize ArrayList to hold a list of integers, which are randomly 
 * generated {col1 & col2}.  ArrayList are resizeable and can contain duplicate elements.  
 * Since the values are randomly generated, it's possible to get duplicate 
 * numbers.
 * 
 */
public class MyCollectionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    
        //note a single Random object is reused here
        Random random = new Random();

        // Generating 10 random integers in range 1..10 
        // to populate Collection 1
        ArrayList<Integer> col1 = 
                MyCollections.generateIntegerCollection(1, 10, random);

        // Generating 10 random integers in range 6..15 
        // to populate Collection 2
        ArrayList<Integer> col2 = 
                MyCollections.generateIntegerCollection(6, 15, random);

        /* Displaying array list elements */
        log("Collection 1 contains:\n "+col1);

        /* Display the size of the array list*/
        log("Size of Collection 1 is "+col1.size());

        /* Displaying array list elements */
        log("Collection 2 contains:\n "+col2);

        /* Display the size of the array list*/
        log("Size of Collection 2 is "+col2.size());

        // Merge Collection 1 & 2 into a new collection
        MyCollections.mergeCollections(col1, col2);

        // Collection containing key/value pairs
        MyCollections.hashMapCollection();

    }

}
    

