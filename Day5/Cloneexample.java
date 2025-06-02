package Day5;

import Inheritance.Animal;
import Interface.Dog;




public class Cloneexample implements Cloneable {
   Animal animal;
   Dog dog;
    Cloneexample()
    {
        animal=new Animal();
        dog=new Dog();

    }
    public static void main(String[] args) {
        
        try {
        Cloneexample one=new Cloneexample();
        Cloneexample two=(Cloneexample)one.clone();
        System.out.println(one.hashCode()+"==="+two.hashCode());


//shallow copy
            System.out.println(one.animal.hashCode()+" == "+ two.animal.hashCode());


        } catch (Exception e) {
            
            System.out.println(e);
        }


    }
    
}
