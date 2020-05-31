import java.util.*;
public class week2_4
{
	public static long gcd(long n1, long n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
	public static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    System.out.println(lcm(a, b));
  }
}