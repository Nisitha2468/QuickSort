package er;

public class QuickSort {
	
	 // Method to partition the array on the basis of pivot
    private int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Main function that implements QuickSort
    public void sort(int arr[], int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Method to print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {10, 7, 8, 9, 1, 5};

	        System.out.println("Given Array");
	        printArray(arr);

	        QuickSort ob = new QuickSort();
	        ob.sort(arr, 0, arr.length - 1);

	        System.out.println("\nSorted array");
	        printArray(arr);

	}

}
