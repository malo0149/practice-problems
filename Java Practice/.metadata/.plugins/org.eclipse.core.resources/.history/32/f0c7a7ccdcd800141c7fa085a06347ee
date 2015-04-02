/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meghan
 */
public class ArraySortAndGroupTest {
    
    public ArraySortAndGroupTest() {
    }
    @Test
    public void sortAndGroupCheck() {
        System.out.println("Test 1 Unsorted Array: ");
        // Test array: 8 ones, 5 twos, 7 threes
        int[] unsorted = {1,3,2,3,1,1,1,2,2,3,3,2,1,3,1,2,1,3,3,1};
        for (int i=0; i<unsorted.length; i++) {
            System.out.print(unsorted[i]);
        }
        // Sort and group the numbers
        int[] sorted = ArraySortAndGroup.sortArray(unsorted);        
        // Verify the expected sorting and grouping took place
        assertArrayEquals(sorted, new int[]{1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,3});
        System.out.println("\nTest 1 Sorted Array: ");
        for (int i=0; i<sorted.length; i++) {
            System.out.print(sorted[i]);
        }
    }
    
    /*public void nullArrayCheck() {
        int[] unsorted = null;
        
    }*/
}
