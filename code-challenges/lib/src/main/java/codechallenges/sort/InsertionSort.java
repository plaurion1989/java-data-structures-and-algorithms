package lib.src.main.java.codechallenges.sort;

public class InsertionSort{
    int[] array = {1,2,3,4,5};

    public void InsertionSortArray (int[] array){
        int i = 0;
        for (i=1; i<= array.length; i++){
            int j = i-1;
            int temp = array[i];
            while(j>=0 && temp < array[j]){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
        }
    }
}
