package Generics;

public class Pair <K,V>{

    public void display(K k,V v)
    {
        System.out.println("Key "+k+" value = "+v);
    }
    public static <T> void printArray(T[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
    }
    public static void main(String[] args) {
        Pair<String,Integer> p1=new Pair<>();
        Pair<Integer,String> p2=new Pair<>();

        p1.display("Dilep", 21);
        p2.display(21, "Dilep");
        String str[]={"watermelon","Banana"};
        Integer num[]={1,2,3,4};
        Double []dob={1.0,2.0,3.0};
        printArray(num);
        printArray(str);
        printArray(dob);
    }


    
}
