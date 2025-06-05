package Practice;

public class SockMerchant {
	
	public static int pairs(int[] arr,int n)
	{
		int pair=0;
		int frequencyArr[]=new int[n];
		int temp=-1;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)   //10,20,20,10,10,30,50,10,20
			{
				if(arr[i]==arr[j])
				{
					count++;
					frequencyArr[j]=temp;
				}
			}
			if(frequencyArr[i]!=temp)
			{
				frequencyArr[i]=count;
			}
		}
		
		for(int i=0;i<frequencyArr.length;i++)
		{
			
			if(frequencyArr[i]!=temp)
			{
				int div=frequencyArr[i]/2;
				pair+=div;
			}
		}
		return pair;
	}
	
	public static void main(String[]  args)
	{
		int[] arr= {10,20,20,10,10,30,50,10,20};
		int n=arr.length;
		System.out.println(pairs(arr,n));
	}

}
