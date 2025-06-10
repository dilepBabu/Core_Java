package Day6.Exercise;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(ispal(word));

    }

    public static boolean ispal(String s) {
        int l=0,r=s.length()-1;

        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return makepal(s,l,r-1)||makepal(s,l+1,r);
            }
            l++;
            r--;
        }
        return true;
    }
    private static boolean makepal(String s,int l,int r)
    {
        while (l<r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
            return true;

    }

}
