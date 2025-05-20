package Interface;

public class AllinOne implements Printer,Scanner {
    public void print()
    {
        System.out.println("printer");
    }
    public void scan()
    {
        System.out.println("scanner");
    }
    public static void main(String[] args) {
        AllinOne a1=new AllinOne();
        a1.scan();
        a1.print();
    }
    
}
