package Day5;


public class ObjectExample {
    int num;

    ObjectExample(int a){
        this.num=a;
    }
    @Override
    public String toString() {
        
        return "this is "+num;
    }

    public static void main(String[] args) {
        ObjectExample oe=new ObjectExample(10);
        System.out.println(oe.getClass());
        oe.getClass();


        
    }
    
}
