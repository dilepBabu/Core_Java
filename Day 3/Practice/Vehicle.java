package Practice;
/*
 * interfaces are abstruct classes which are completely unimplemeted and it can have static and final variable  
 */


public abstract class Vehicle  implements Interfacetopic,Interfacetopictwo{
   
    
}


class bus extends Vehicle{
    public int getint()
    {
        return 0;
    }

    @Override
    public String getname() {
     return "";
    }
}
class Auto extends Vehicle
{

  @Override
  public int getint() {
    return 0;

  }
  @Override
  public String getname() {
   return "";
  }
  
}

