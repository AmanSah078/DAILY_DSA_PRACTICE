//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

public class Movies_Zero_At_End {
	static void moveszeratend(int[] arr)
	{
	
		int store=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[store]=arr[i];
				store++;
			}
		}
		while(store<n)
		{
			arr[store]=0;
			store++;
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
		}
	}
	public static void main(String[] args)
	{
		int[] arr={0,1,0,3,12};
		moveszeratend(arr);
	}
}

