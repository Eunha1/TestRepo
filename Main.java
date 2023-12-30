
public class Main {
    public static void main(String[] args) {
    MergeSort countSort = new MergeSort(10);
        int[] sortedArray = countSort.getArray();
        System.out.println("unSorted array:");     
        printArray(sortedArray);
        countSort.Sort();
        System.out.println("Sorted array:");     
        printArray(sortedArray);
    }
    
    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
