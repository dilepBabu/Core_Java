package ExerciseTest;

import exercise.Factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    Factorial f=null;
    @BeforeEach
    public void setbf()
    {
        f=new Factorial();
    }
    @AfterEach
    public void setaf()
    {
        System.out.println("test case is done");
    }


    @Test
    public void negative()
    {
        Exception e=assertThrows(IllegalArgumentException.class,()-> {
            f.factorial(-3);
        });
        Assertions.assertEquals("negative number",e.getMessage());
    }

    @Test
    public void zero()
    {
        Assertions.assertEquals(1,f.factorial(0));
    }
    @Test
    public void one()
    {
        Assertions.assertEquals(1,f.factorial(1));
    }

    public void check()
    {
        Assertions.assertEquals(120,f.factorial(5));
    }
}
