package Day5;
import java.util.*;
public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String count[]=sentence.split(" ");
        System.out.println(count.length);

        StringBuilder sb=new StringBuilder(sentence);
        String reversesentence=String.valueOf(sb.reverse());
        System.out.println(reversesentence);

        String changedString="";
        for (int i = 0; i < sentence.length() ;i++) {
            char let[]=sentence.toCharArray();
            
            if(let[i]=='a'||let[i]=='e'||let[i]=='i'||let[i]=='o'||let[i]=='u')
            {
                changedString+="*";

            }
            else
            {
                changedString+=sentence.charAt(i);
                
            }
    }
        System.out.println(changedString);


        String one=sc.nextLine();
        String two=sc.nextLine();
        int res=one.compareTo(two);
        if(res<0)
        {
            System.out.println(one+" before "+two);
        }
        else if(res>0)
        {
            System.out.println(one+" after "+two);
        }
        else
        {
            System.out.println( one+" the both the order is same "+two);
        }
        boolean casemethod=one.equals(two);
        System.out.println("case sensitive "+casemethod);
        boolean noncasemethod=one.equalsIgnoreCase(two);
        System.out.println("case sensitive "+noncasemethod);
        System.out.println(one.concat(two));

}
}