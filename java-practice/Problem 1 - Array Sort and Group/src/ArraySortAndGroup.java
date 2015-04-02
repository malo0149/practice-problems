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
  
    public static int[] sortArray(int[] array) {
        try {
            int[] newArray = new int[array.length];
            int index = 0;
            for (int i=0; i<array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    newArray[i] = array[i+1];
                } else {
                    newArray[i] = array[i];
                }
            }
            return newArray;
        } catch (Exception e) {
            return array;
        }
    }
}
