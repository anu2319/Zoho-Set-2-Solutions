import java.util.Locale;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int open1 = 0, close1=0;
        char[] str = s.toCharArray();
        int len = str.length;
        for(int start = 0, end = len-1; start<len; start++, end-- )
        {
            if(str[start] == '(')
            {
                open1++;
            }
            else if(str[start] == ')')
            {
                open1--;
            }
            if(str[end] == ')')
            {
                close1++;
            }
            else if(str[end] == '(')
            {
                close1--;
            }
            if(open1 < 0)
            {
                str[start] = 'x';
            }
            if(close1 < 0)
            {
               str[end] = 'x';
            }
        }

        for(int i=0; i<len; i++)
        {
            if(str[i]!='x')
            {
                System.out.print(str[i]);
            }
        }
    }
}
