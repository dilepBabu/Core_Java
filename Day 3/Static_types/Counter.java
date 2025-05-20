public class Counter {
    static int counter=0;

    public static void main(String[] args) {
        Counter ob1=new Counter();
        ob1.counter++;
        System.out.println(counter);
        Counter ob2=new Counter();
        ob2.counter++;
        System.out.println(counter);
        Counter ob3=new Counter();
        ob3.counter++;
        System.out.println(counter);
        
    }
    
}
