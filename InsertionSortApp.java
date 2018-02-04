package dateStructure.insertionsort;

public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		// do work
		int max =10000;
		InsertionSort arr; // reserence to an array
		arr = new InsertionSort(max); // create an array
		
		
		for (int j =0; j <max; j++){
			long n =(long) ( java.lang.Math.random()*(max-1));
			arr.insert(n);		
		}
		arr.display();
		
		arr.insertionMethod();
		
		arr.display();
		
		long time = System.nanoTime() - start;
		double timeInSeconds = time/1e9;
		System.out.println(timeInSeconds);
		
		
	}

}
