package Practice;
/*
 * Abstract methods are unimplemented method and the method ends with semicolon
 * once the method is decleare as abstract the class also decleare as abstract method
 * 
 * Abstract class - we cant create or instantiate the object for the abstract class
 * the abstract is uses to forcing the subclass developer to use all the abstract methods in the super class
 * example in car super class we implemented abstract brake method so every subclass developer must implement the brake method 
 * or otherwise it will automatically declleare as abstract class 
 */
/*
 * interview questions 
 * 1)can we create static method in the abstract class ?
 * yes when the abstract class loader load the class on that time the static method also excecute
 * 2)in abatract class can we create the constructor ?
 * yes ,by the way of chain constructor we cant call the constructoe from the super class example in the below code
 * 
 */
abstract class Cars
{
    public Cars()
    {

    }
    public Cars(int i){
        System.out.println("Abstract class const");
    }
    public abstract void brakes();
   
}
class Subcls extends Cars {
    public Subcls()
    {

    }
    public Subcls(int i)
    {
        super(i);
        
    }
    public void brakes()
    {
        System.out.println("super class");
    }

}
public class Abstracttopic {
    public static void main(String[] args) {
       
        Subcls sub=new Subcls(10);
        sub.brakes();
    }
    
}
