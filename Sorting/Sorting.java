import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting{
    public static void main(String[] args) {
        int[] var = new int[20];
        for(int i = 0; i < var.length; i++){
            var[i] = (int)(Math.random() * 21);
        }
        System.out.println(Arrays.toString(var));

            }

// bubbleSort() methods
    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i  = 0; i < len - 1; i++){
            for(int j = 0; j < len- i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    
    public static void bubbleSort(int[] arr, Boolean ascending){
        int len = arr.length;
        for(int i  = 0; i < len - 1; i++){
            for(int j = 0; j < len- i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        if(!ascending){
        for(int i = 0; i < len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
        System.out.println(arr);

    }
    public static void bubbleSort(ArrayList<Integer> arr, Boolean ascending){
        int len = arr.size();
        for(int i  = 0; i < len - 1; i++){
            for(int j = 0; j < len- i - 1; j++){
                if(arr.get(j)> arr.get(j + 1)){
                    swap(arr, j, j+1);
                }
            }
        }
       
        if(!ascending){
            Collections.reverse(arr);
        }
        System.out.println(arr);

    }


    // selectionSort() methods
    public static void selectionSort(ArrayList<Integer> list){
        int n = list.size();
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(list.get(j) > list.get(minIndex)){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(list, minIndex, i);
            }
        }
    }
    public static void selectionSort(ArrayList<Integer> list, boolean ascending){
        int n = list.size();
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(list.get(j) > list.get(minIndex)){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(list, minIndex, i);
            }
        }

        if(!ascending){
            Collections.reverse(list);
        }
    }
    

    public static void selectionSort(int[] arr, boolean ascending){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arr, minIndex, i);
            }
        }
        int len = n;
        if(!ascending){
            for(int i = 0; i < len/2; i++){
                int temp = arr[i];
                arr[i] = arr[len - i - 1];
                arr[len - i - 1] = temp;
            }
        }
    }

    //bubbleSelectionSort() method

    public static void bubbleSelectionSort(int[] arr){
        int len = arr.length;
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i  = 0; i < len - 1; i++){
            for(int j = 0; j < len- i - 1; j++){
                if(arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
                swap(arr,0,minIndex);
            }
        }
    }
    // helper methods

    public static void swap(int[] arr, int index_one, int index_two){
        int temp = arr[index_one];
        arr[index_one] = arr[index_two];
        arr[index_two] = temp;
        }
    
        public static void swap(ArrayList<Integer> arr, int index_one, int index_two){
        int temp = arr.get(index_one);
        arr.set(index_one, arr.get(index_two));
        arr.set(index_two, temp);
    }
}