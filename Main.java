
public class Main {
    public static void main(String[] args) {
        RadixSort radixSort = new RadixSort(10);
        int[] sortedArray = radixSort.getArray();
        System.out.println("unSorted array:");     
        printArray(sortedArray);
        radixSort.Sort();
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
