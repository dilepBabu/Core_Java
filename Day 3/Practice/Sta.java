package Practice;
public class Sta {

    static int count=10;
    static
    {
        count++;
        System.out.println("first static block "+count);
    }
    public static void get()
    {
        count++;
        System.out.println("static method "+count);
    }
    public void method()
    {
        count++;
        System.out.println("instance method  "+count);
    }
    public Sta()
    {
        count++;
        System.out.println("constructor "+count);
    }
    public void Arr(int col)
    {
        int arr[][]=new int[col][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("*");
            }
            System.out.println("&");
        }
    }
    public static void main(String[] args) {
        Sta.count++;
        System.out.println("Static count "+count);
        Sta.get();
        Sta instance=new Sta();
        instance.method();
        instance.get();
        instance.count++;
        System.out.println("final increment "+count);
        instance.Arr(1);

    }
}