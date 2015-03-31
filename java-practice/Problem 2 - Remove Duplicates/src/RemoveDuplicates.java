/**
 *
 * @author Meghan
 */
import java.util.*;

public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] originalArray = {1,2,3,2,3,2,5,4,2,1,4,5,10,11,6};
        int[] modArray = null;
        if (originalArray != null) {
            System.out.println("Original Array:");
            for (int i=0; i<originalArray.length; i++) {
                System.out.print(originalArray[i] + " ");
            }
            System.out.println("\n");
            modArray = removeDups(originalArray);
        }
        if (modArray != null) {
            System.out.println("Array with Duplicates Removed:");
            for (int i=0; i<modArray.length; i++) {
                System.out.print(modArray[i] + " ");
            }
            System.out.println("\n");
        }
    }
    private static int[] removeDups(int[] a) {
        try {
            List<Integer> aList = new ArrayList<>();
            for (int i : a) {
                aList.add(i);
            }
            Collection<Integer> dupsRemoved = new HashSet<>(aList);
            int[] rtn = new int[dupsRemoved.size()];
            for (int i=0; i<rtn.length; i++) {
                rtn[i] = (Integer)dupsRemoved.toArray()[i];
            }
            return rtn;
        } catch (Exception e) {
            return a;
        }
    }
}
