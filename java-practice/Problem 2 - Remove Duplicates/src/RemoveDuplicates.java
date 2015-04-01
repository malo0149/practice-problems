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

    }
    public static int[] removeDups(int[] a) {
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
