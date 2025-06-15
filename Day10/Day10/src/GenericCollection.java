import java.util.ArrayList;
import java.util.List;

class fruit
{
    @Override
    public String toString() {
        return "im fruit";
    }
}
class Apple extends fruit
{
    @Override
    public String toString() {
        return "im apple";
    }
}
class Banana extends Apple
{
    @Override
    public String toString() {
        return "im banana";
    }
}






public class GenericCollection {
    public static void main(String[] args) {

        List<fruit> list=new ArrayList<>();
        list.add(new Apple());
        //? extends main class  name is covariance and this is use for only get
        List<? extends fruit> list1=list;
        for (fruit fruit:list1)
        {
            System.out.println(fruit);
        }
        List<Apple> list2=new ArrayList<>();
        //? super main class name is contravariance and tjis is use for only put
        List<? super Apple> list3=list2;
        list3.add(new Apple());
        list3.add(new Banana());
        //here we cant add  because the class fruit  is super class apple
        //list3.add(new fruit());
    }
}
