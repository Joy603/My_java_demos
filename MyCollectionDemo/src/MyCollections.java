package javaapplication2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import static javaapplication2.CollectionUtils.*;


public class MyCollections {
    
    public static ArrayList generateIntegerCollection(
            int aStart, 
            int aEnd, 
            Random aRandom) {

        // Create local collection to be returned
        ArrayList<Integer> collection = new ArrayList<>();
        
        int randomInt;
        
        for (int idx = 1; idx <= 10; ++idx){
          randomInt = showRandomInteger(aStart, aEnd, aRandom);
          collection.add(randomInt);
        }
        
        return collection;
    }

    /**
     * 
     * A set can not contain duplicate elements.  I chose to use TreeSet
     * because unlike a HashSet, it sorts the elements in ascending order.
     * The requirement for the merge is that there should not be any 
     * duplicates and the collection must be sorted.
     * 
     * To remove the middle entry, I converted the TreeSet collection
     * to a list because I wanted to remove the entry utilizing the method,
     * remove(int index), which is in the List interface of Collections
     * 
     * In addition to the Collections class, I was able to use the 
     * reverse(List<?> list) method to print the collection in reverse order
     *  
     */
    public static void mergeCollections(
            ArrayList col1, 
            ArrayList col2){

        //For Colection 3 contains integers from Collection 1 & 2, no dupes 
        // and sorted
        SortedSet<Integer> tset = new TreeSet<>();
        
        // Adding Collection 1 elements to the TreeSet
        tset.addAll(col1);

        // Adding Collection 2 elements to the TreeSet
        tset.addAll(col2);

        //Displaying TreeSet collection containing no dupes and sorted
        log("\nThis is the Combined collection:\n "+tset);

        // Returns the size of the TreeSet collection
        int treeSize = tset.size();

        //Displaying TreeSet size
        log("This is the size of the Combined collection : "+treeSize);

        //Convert TreeSet to List Collection to be able to remove element 
        // by index
        List<Integer> al = new ArrayList<>(tset);

        //Find index at middle entry 
        int half_idx = treeSize/2;
        
        //Remove element using index
        al.remove(half_idx);

        //Reverse the list
        java.util.Collections.reverse(al);

        //Display reverse order:
        log("This is the reverse order collection after removing "
                        + "middle entry\n "+al);

        //Display the size of the list
        log("Size of the List is after removing middle entry is "+al.size());
    }
    
    /**
     * Using the Map interface, I was able to map keys to values. A map can not
     * contain duplicates keys, but attempting to add a duplicate key/value, 
     * will result in replacement of the old value.
     * I chose HashMap because I don't care about the order of the map.
     */
    public static void hashMapCollection(){
                
        //For Collection that contains key/value pair
        HashMap<Integer, String> hmap = new HashMap<>();
        
        /*Adding 5 key/value pairs HashMap collection*/
        hmap.put(12, "Red");
        hmap.put(2, "Blue");
        hmap.put(7, "Green");
        hmap.put(49, "Yello");
        hmap.put(3, "Black");

        /*Check if key/value already exist in collection, if true
          do not add key/value to the collection, else go ahead and add
          key/value to the collection  */
        if (hmap.containsKey(7)) {
            // key found
            log("\nCollections already contains a value of "+hmap.get(7));
        }
        else {
            hmap.put(7, "Green");
        }

        //Displaying key/value pairs
        log("This is the key/value pair collection\n"+hmap);

        //Displaying the size
        log("The key/value pair HashMap has size: "+hmap.size());
    }

}
