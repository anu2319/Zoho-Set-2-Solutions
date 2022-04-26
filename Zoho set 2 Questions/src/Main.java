import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int i=0, j=n-1,count=0;
        while(i<=j)
        {
            if(count%2==0)
            {
                System.out.print(a[j]+" ");
                j--;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
            }
            count++;
        }
    }
}
