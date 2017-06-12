/**
 * Selection Sort: is called selection sort since it repeatedly selects the smallest element.
 * 
 * Algorithm:
 * =========
 * 1. Find the minimum value in the list 
 * 2. Swap it with the value in the current position
 * 3. Repeat this process for all the elements until the entire array is sorted
 * 
 * 
 * Advantages 
 * ----------
 * Easy to implement In-place sort (requires no additional
 * storage space)
 * 
 * Disadvantages
 * -------------- 
 * Doesn’t scale well: O(n2)
 * 
 * 
 * 
 * @author srikanth
 * 
 */
public class SelectionSort {

	public int[] inputAry = {10,20,5,15,2,9};
	
	public int[] doSelectionSort() {

		int temp; // to swap
		int min; // to hold minimum value
		int j; // for outer for-loop
		int i; // for inner for-loop
		
		
		/* To achieve the following thing, we are maintaining this loop (to move index of array)*/
		for (i = 0; i <= inputAry.length - 1; i++) {

			min = i;

			/* this loop for search entire array to get minimum value.If we get the minimum value then 
			 we put that value in the first location, then we should not touch that because as we know that
			 it is the value lower in the entire array so no need to compare any more. So, we have to start
			 from index 1 to do again find the minimum value, if we get minimum value we need to push that in to
			 second location of the array, and we should not touch that location same like previous--soo on until
			 our entire array sorted.*/
			
			for (j = i + 1; j <= inputAry.length - 1; j++) {

				if (inputAry[j] < inputAry[min]) {

					min = j;
				}

			}
			
			temp = inputAry[min];
			inputAry[min]= inputAry[i];//We are moving first location value to where we got the minimum value index
									//,because founded smallest value, we are gng to insert at first location
			
			inputAry[i] = temp;  // After getting an smallest value, we are inserting at first location
			
		}

		return inputAry;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SelectionSort obj = new SelectionSort();
		
							
		int[] outPut = obj.doSelectionSort();

		for (int i = 0; i <=outPut.length-1; i++) {

			System.out.println(outPut[i]);
		}
		

	}

}
