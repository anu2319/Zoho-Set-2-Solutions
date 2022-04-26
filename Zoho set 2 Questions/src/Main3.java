import java.util.Scanner;

public class Main3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        a[0] = 3;
        a[1] = 4;
        int c = 2;
        for(int i=0; i<n; i++)
        {
            a[i+c] = a[i]*10+3;
            System.out.println("a"+a[i+c]);
            c++;
            a[i+c] = a[i]*10+4;
            System.out.println("b"+a[i+c]);
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
