import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

//        String pattern="^[\\w.-]+@[\\w.-]+\\.com$";
//        String patterns="^[\\w.-]+@[\\w.-]+\\.org$";
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of email to verify");
//        int no =sc.nextInt();
//        sc.nextLine();
//        String [] email=new String[no];
//
//        for (int i = 0; i < no; i++) {
//
//            email[i]=sc.nextLine();
//        }
//        for (int i = 0; i < no; i++) {
//            Pattern p=Pattern.compile(pattern);
//            Pattern p1=Pattern.compile(patterns);
//            if(p.matches(pattern,email[i])||p1.matches(patterns,email[i]))
//            {
//                System.out.println(email[i]+": Valid");
//
//            }
//            else {
//                System.out.println(email[i]+": Invalid");
//            }
//
//        }


        String panpattern="^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
        String pan="HHYPD6380N";
        Pattern pa=Pattern.compile(panpattern);
        System.out.println(pa.matches(panpattern,pan));


    }
}
