public class LinearSearch{
	public static void main(String[] args){
		int[] num={12, 13, 14, 15, 16};			//array in which we have to search
		int target=16;							// target element to search
		int ans=linearsearch(num, target);		//calling the function for search
		System.out.print(ans);
	}
	// search in array if found return index ,if not found return -1;
	static int linearsearch(int[] arr, int target){

		// if their is not any element
		if(arr.length==0){
			return -1;
		}

		//searching for each element in array
		for (int i=0; i<arr.length; i++){
			int element=arr[i];
			if(element==target){
				return i;
			}
		}
		
		//if not found in array return -1
		return -1;
	}
}