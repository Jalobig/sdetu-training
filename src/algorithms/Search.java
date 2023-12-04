package algorithms;

public class Search {
	public static int linearSearch(int[] dataset, int target) {
		for (int i=0; i<dataset.length; i++) {
			if (dataset[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] dataset, int target, int start, int end) {
		System.out.println("Searching between " + dataset[start] + " and " + dataset[end]);
		int middle = (int) Math.floor((start+end)/2);
		int value = dataset[middle];
		
		
		if (value > target) {
			return binarySearch(dataset, target, start, middle-1);
			
			}
		else if (value < target) {
			return binarySearch(dataset, target, middle +1, end);
			
		}
		return middle;
		
	}
}
