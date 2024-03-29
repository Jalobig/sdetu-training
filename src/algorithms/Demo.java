package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10,25,433,26,73,132,5,35};
		int[] sortedNumbers = {5,9,12,18,21,26,29,35,339,45,49,51,58,59,61,72,88,91,94};
		
		int pos = algorithms.Search.linearSearch(numbers, 73);
		System.out.println("(Linear) Found at position: " + pos);
		
		int index = algorithms.Search.binarySearch(sortedNumbers, 59, 0, sortedNumbers.length-1);
		System.out.println("(Binary) Found at position: " + index);
		
		System.out.print("(Bubble) Dataset Sorted: ");
		algorithms.Sort.bubbleSort(numbers);
	}

}
