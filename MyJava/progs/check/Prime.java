package progs.check;
public class Prime
{
	public boolean isPrime(int n)
	{
		int ct=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
			}
		}
		if(ct==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}