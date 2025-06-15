public class Box<T> {
    private T item;
    public void setItem(T item)
    {
        this.item=item;
    }
    public T getItem()
    {
        return item;
    }
    public void display()
    {
        System.out.println(item);
    }
    public  boolean check(Class<?> cls)
    {
        return cls.isInstance(item);
    }
    public static void main(String[] args) {
        Box<String>stringBox=new Box<>();
        stringBox.setItem("Hi Everyone");
        stringBox.display();
        System.out.println(stringBox.check(String.class));
        Box<Integer> integerBox=new Box<>();
        integerBox.setItem(123456);
        integerBox.display();
        System.out.println(integerBox.check(Integer.class));
        Box<Double>doubleBox=new Box<>();
        doubleBox.setItem(102.08);
        doubleBox.display();
        System.out.println(doubleBox.check(Double.class));
        class Dummy
        {
            @Override
            public String toString() {
                return "this is dummy class";
            }
        }
        Box<Dummy>dummyBox=new Box<>();
        doubleBox.display();
        System.out.println(dummyBox.check(Dummy.class));

    }
}
