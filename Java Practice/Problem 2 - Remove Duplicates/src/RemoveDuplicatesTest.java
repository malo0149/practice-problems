/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meghan
 */
public class RemoveDuplicatesTest {
    
    public RemoveDuplicatesTest() {
    }
    @Test
    public void removeDupsCheck() {
        int[] originalArray = {1,2,3,2,3,2,5,4,2,1,4,5,10,11,6};
        // Expected output: {1,2,3,5,4,10,11,6} in any order
        int[] modArray = null;
        modArray = RemoveDuplicates.removeDups(originalArray);
        // Check for expected number of unique ints
        assertEquals("Length of result array", 8, modArray.length);
        ArrayList<Integer> sortedResult = new ArrayList<>();
        for (int i : modArray) {
            sortedResult.add(i);
        }
        // Sort the result for easier verification
        Collections.sort(sortedResult);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);
        expectedResult.add(10);
        expectedResult.add(11);
        // Verify that the correct unique ints were returned
        assertEquals("Contents of result array", sortedResult, expectedResult);
    }    
}
