// Java program for implementation of Insertion Sort 
class Algoritma_Insertion_Sort
{ 
    /*Function to sort array using insertion sort*/
	  
    /* A utility function to print array of size n*/
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    {         
        int arr[] = {12, 11, 13, 5, 6}; 
  
        Algoritma_Insertion_Sort ob = new Algoritma_Insertion_Sort();         
        ob.sort(arr); 
          
        printArray(arr); 
    }

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		
	} 
}
