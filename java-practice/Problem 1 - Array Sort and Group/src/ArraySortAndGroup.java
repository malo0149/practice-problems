/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Meghan
 */
public class ArraySortAndGroup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] test1unsorted = null;//{1,3,2,3,1,1,1,2,2,3,3,2,1,3,1,2,1,3,3,3,2,1,2,2};
        int[] test1sorted = sortArrayFirstTry(test1unsorted);
        if (test1unsorted != null) {
            System.out.println("Test 1 Unsorted Array: ");
            for (int i=0; i<test1unsorted.length; i++) {
                System.out.print(test1unsorted[i]);
            }
        }
        if (test1sorted != null) {
            System.out.println("\nTest 1 Sorted Array: ");
            for (int i=0; i<test1sorted.length; i++) {
                System.out.print(test1sorted[i]);
            }
        }
        System.out.println("\n\n");
    }
    
    private static int[] sortArrayFirstTry(int[] unsorted) {
        try {
            int arrayLength = unsorted.length;
            int[] sorted = new int[arrayLength];
            int oneCount = 0;
            int twoCount = 0;
            int threeCount = 0;

            for (int i = 0; i < arrayLength; i++) {
                switch (unsorted[i]) {
                    case 1:
                        oneCount++;
                        break;
                    case 2:
                        twoCount++;
                        break;
                    case 3:
                        threeCount++;
                    default:
                        break;
                }
            }
            while (threeCount > 0) {
                arrayLength--;
                sorted[arrayLength] = 3;
                threeCount--;
            }
            while (twoCount > 0) {
                arrayLength--;
                sorted[arrayLength] = 2;
                twoCount--;
            }
            while (oneCount > 0) {
                arrayLength--;
                sorted[arrayLength] = 1;
                oneCount--;
            }

            return sorted;
        } catch (Exception e) {
            return unsorted;
        }

    }
}
