public class Main {
    public static void main(String[] args) {
        // initialize array
        // 25,3,5,10,38,62,20,8,173,65
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 9;
        numbers[6] = 20;
        numbers[7] = 9;
        numbers[8] = 173;
        numbers[9] = 65;

        // array before sorting
        System.out.print("Array Before Sorting: ");
        printArrayElements(numbers);
        System.out.print("\n\n");

        // array after sorting
        System.out.print("Array After Sorting: ");
        selectionSort(numbers);
        printArrayElements(numbers);
        System.out.print("\n");
    }

    // function to print the array elements
    private static void printArrayElements(int[] numbers) {
        for (int value : numbers ) {
            System.out.print(value + " ");
        }
    }

    // function to sort the array using selection sort algorithm
    private static void selectionSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (numbers[i] < numbers[largestIndex]) {
                    largestIndex = i;
                }
            }

            // swap element in largestIndex with element in lastSortedIndex
            int temp = numbers[largestIndex];
            numbers[largestIndex] = numbers[lastSortedIndex];
            numbers[lastSortedIndex] = temp;
        }
    }
}
