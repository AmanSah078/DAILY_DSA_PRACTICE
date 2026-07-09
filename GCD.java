class GCD {
	static void greatescommondivisior(int n1, int n2)
	{
		int org1=n1;
		int org2= n2;
		int result=0;
		if(org1>org2)
		{
	result=org1%org2;
		}
		else {
	result=org2%org1;
		}
		System.out.println(result);
	}
	public static void main(String[] args)
	{
//		int n1=15;
//		int n2=20;
		int n1=12;
		int n2=18;
		greatescommondivisior(n1,n2);
	}
	
}