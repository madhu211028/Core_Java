package equalsAndHashcode;

public class ArrayExample {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		int i=0;
		int a[]= new int[5000000];
		for(;i<a.length;i++)
			a[i]=i+1;
		
		for(i=0;i<a.length;i++){
			if(i==49999999){
				System.out.println("value at 499999 " +a[i]);
				break;
			} else {
				System.out.println("trying ");
			}
			
		}
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println(totalTime);
		
	}

}
