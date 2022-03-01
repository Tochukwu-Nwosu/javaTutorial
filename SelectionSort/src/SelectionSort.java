//Tochukwu Nwosu Chukwuma
//2017/1/6600CT
public class SelectionSort {
	public static void main (String[] args) {
		SelectionSort ss = new SelectionSort();
		int arr[] = {7, 5, 2, 1, 8, 10, 50, 100, 6, 20, 90, 110};

		System.out.println("Intial Array: ");
		ss.printArr(arr);
		
		arr = ss.sort(arr);
		
		System.out.println("\nSorted Array: ");
		ss.printArr(arr);
	}
	int[] sort(int[] arr) {
		int min, minIndex, temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			min = arr[i];
			minIndex = i;
			for(int j = i + 1; j < arr.length; j++) { 
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
			}
		}
		 temp = min;
		 arr[minIndex] = arr[i];
		 arr[i] = temp;
		}
		return arr;
	}
	void printArr(int[] arr) {
		for(int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
	}
}
