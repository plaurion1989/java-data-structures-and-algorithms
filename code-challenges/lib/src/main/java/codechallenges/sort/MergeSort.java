package lib.src.main.java.codechallenges.sort;

import java.util.Arrays;

public class MergeSort {
    int[] array = {1,2,3,4,5};

    public int[] MergeSortArray (int[] array){
        int n = array.length;
        if(n>1){
            int mid = n/2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, n);
            MergeSortArray(left);
            MergeSortArray(right);
            Merge(left, right, array);

        }
        return array;
    }
    public void Merge(int[] left, int[] right, int[] array){
        int i = 0, j = 0, k = 0;
        while(i<left.length && j<right.length){
          if(left[i] <= right[j]){
              array[k] = left[i];
              i = i+1;
          }else{
              array[k] = right[j];
              j = j+1;
          }
          k = k+1;
        }
        if (i == left.length){
            //set remaining entries in array to remaining values in right
            for(;;){

            }
        }else{
            //set remaining entries in array to remaining values in left
        }
    }
}
