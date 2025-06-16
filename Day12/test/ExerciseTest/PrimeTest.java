package ExerciseTest;


import exercise.PrimeNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    PrimeNumber p=null;

    @BeforeEach
    public void setbf()
    {
        p=new PrimeNumber();
    }
    @AfterEach
    public void setaf()
    {
        System.out.println("test case is done");
    }

    @Test
    public void zero()
    {
        boolean ans=p.prime(0);
        Assertions.assertEquals(false,ans,"0");
    }
    @Test
    public void one()
    {
        boolean ans=p.prime(1);
        Assertions.assertEquals(false,ans,"1");
    }
    @Test
    public void negative()
    {
        boolean ans=p.prime(-1);
        Assertions.assertEquals(false,ans,"negative");
    }
    @Test
    public void boundary()
    {
        boolean ans=p.prime(3000000);
        Assertions.assertEquals(false,ans,"large prime");
    }
}
