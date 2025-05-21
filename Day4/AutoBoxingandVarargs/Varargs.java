package AutoBoxingandVarargs;

public class Varargs {
    public static void main(String[] args) {
        getitems(new AutoBoxing(),new AutoBoxing() );
        
    }
    public static void getitems(AutoBoxing... emp)
    {
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);   
        }
    }
    
}
