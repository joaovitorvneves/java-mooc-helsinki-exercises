
public class MainProgram {
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        sort(array);
        
        System.out.println(array);
    }

    public static int smallest(int[] arr) {
        int min = arr[0];
        
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
    
    public static int indexOfSmallest(int[] arr) {
        int min = smallest(arr);
        int index = 0;
        
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == min) {
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex];
        int index = startIndex;
        
        for (int i = startIndex; i < table.length; ++i) {
            if (table[i] < min) {
                min = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int indexSmallest = indexOfSmallestFrom(array, i);

            swap(array, i, indexSmallest);
        }
    }
}
