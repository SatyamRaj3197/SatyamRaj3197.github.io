import java.util.*;
public class week2_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n,fn=0,a=0,b=1;
		n=sc.nextLong();
		if(n==0)
			fn=0;
		else if(n==1)
			fn=1;
		else
			for(int i=2;i<=n;i++)
			{
				fn=a+b;
				a=b;
				b=fn;
			}
		System.out.println(fn);
	}
}
