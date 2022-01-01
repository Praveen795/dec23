package dec23;

public class dec23 {
	
	public static void main(String[] args) {

//_______________kth largest and smollest value_____________[problem]_____***
		
		int[] arr= {43,12,1,23,66,54,78};
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
		System.out.println("kth smollest value  :"+arr[0]);
		System.out.println("kth largest value is  :"+arr[n-1]);
		
		
		
		
		
		
		
	}

}
