
class Fact
{
	public static void main(String[] args)
	{	
		int factRes = factN(4);
		System.out.println(factRes);
	}
	
	static int factN(int num)
	{
		if(num>=1)
		{
			int fact = num * factN(num-1);
			return fact;
		}
		else
			return 1;
	}
}