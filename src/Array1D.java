
public class Array1D {

	
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		
		
		
		
		
		
		
		int[] arr2 = new int [arr1.length];
		
		
		for (int i=0;i<arr1.length;i++)
			
		{
			
			
			
			
			arr2[i] =arr1[i];
		}
			
	
		for (int i=0;i<arr2.length;i++)
			
		{
			
			
			System.out.println(arr2[i]);
			
		}
		
		int []arr3 =arr2.clone();
		
		
		
		
		arr2[3]= 400;
		int count  =0;
		for (int i=0;i<arr1.length;i++)
			
		{
			
			
			
			
			if (arr2[i] ==arr1[i])
				
			{
				count ++;
				
			}
			else {
				
				System.out.println("not same at "+ i +" position two differetnt values " + arr2[i] +" and "+ arr1[2]);
			}
			
		}


		if (count ==arr2.length)
		{
			
			System.out.println("all ements are same array match ");
		}
		
		else {
			
		System.out.println("all elements are not same , array not same");
		}
		
	}

}
