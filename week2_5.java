import java.util.*;
public class week2_5 {
    private static long getFibonacciLastDigit(long n,long m)
    {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (int i = 0; i < n - 1; ++i)
        {
            long tmp_previous = previous%m;
            previous = current%m;
            current = (tmp_previous + current);
        }

        return current%m;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long c = getFibonacciLastDigit(n,m);
        System.out.println(c);
    }
}
