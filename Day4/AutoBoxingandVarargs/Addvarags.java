package AutoBoxingandVarargs;

public class Addvarags {
    static int sum=0;
    public static int add(int... a)
    {
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        
        return sum;

    }
    public static void main(String[] args) {
       
        System.out.println(add(4,3,2,1));
    }
    
}
