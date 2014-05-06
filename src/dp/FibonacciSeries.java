package dp;

public class FibonacciSeries {
	
	public static int Fib(int n){
		int arr[] = new int [n+1];
		for(int i=0;i<=n;i++){
			arr[i]=-1;
		}
		//base case
	     arr[0] = 0;arr[1]=1;
	      for(int i =2;i<=n;i++){
	    	  arr[i] = arr[i-1]+arr[i-2];
	      }

		return arr[n];
	}

	public static void main(String[] args) {
  System.out.print(Fib(5)); 
	}

}
