package dateStructure.insertionsort;
//insertionSort.java
//demonstrate insertion sort
public class InsertionSort {
	private long[] a; // refer to array a
	private int nElems; // number of data items
	
	public  InsertionSort (int max) {
		a = new long[max];
		nElems = 0;
		}
	
	public void insert (long value){
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int i=0; i<nElems; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println(" ");
	}
	
	public void insertionMethod() {
		int in;
		int out;
		
		for ( out = 0; out < nElems; out ++){
			long temp = a[out];
			in = out;
			while (in > 0 && a[in-1] >= temp){
				a[in] = a[in-1];
				in--;
			}
			a[in] = temp;
		}
	}
	
}
