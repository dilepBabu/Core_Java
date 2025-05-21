package AccessModifiers;

public class PrivateOne {

    private int i=10;
    public static void main(String[] args) {
        PrivateOne p1=new PrivateOne();
        p1.i=100;
        System.out.println(p1.i);
        
    }


}
