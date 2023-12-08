package algorithms;

public class Sort {
	public static void bubbleSort(int[] dataset) {
		boolean noMoreSorting;
		do {	
		
			noMoreSorting = false;
			for (int i=0; i<dataset.length-1; i++) {
				if (dataset[i]> dataset[i+1]) {
					noMoreSorting = true;
					int temp = dataset[i];
					dataset[i] = dataset[i+1];
					dataset[i+1] = temp;
				}
		}
		} while (noMoreSorting);
		
		printArr(dataset);
	}
	private static void printArr(int[] arr) {
		System.out.print("[ ");
		for (int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println(" ]");
	}
}
