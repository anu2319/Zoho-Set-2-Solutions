import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int len = c.length;
        int count = 0;
        boolean flag = false;
        for(int i=0; i<len; i++)
        {
            if(c[i] == '(')
            {
                count++;
            }
            else if(c[i]==')')
            {
                count--;
            }
            if(c[i] == '+' || c[i]== '-' || c[i] == '*' || c[i] == '/' || c[i] == '%' || c[i] == '=')
            {
                if((c[i-1]>='a' && c[i-1]<='z') && (c[i+1]>='a' && c[i+1]<='z'))
                {
                    flag = true;
                }
                else
                {
                    break;
                }
            }
        }
        if(count == 0 && flag == true)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}
