class Factorial
{
	public static int findfact(int n)
	{
		int fn=findfact(n-1);
		int mn=n*fn;
		return mn;
	}
	public static void main(String args[])
	{
		System.out.println(findfact(5));
	}
}
