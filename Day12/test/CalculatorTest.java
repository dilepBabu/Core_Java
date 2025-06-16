
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator=null;

    @BeforeAll
    public static void setbfclass()
    {
        System.out.println("before class");
    }
    @AfterAll
    public static void setafclass()
    {
        System.out.println("After  class");
    }
    @BeforeEach
    public void setbefore()
    {
        calculator=new Calculator();
    }
    @AfterEach
    public void setAfter()
    {
        System.out.println("after");
    }
    @Test
    public void Validadd()
    {

        assertEquals(4,calculator.add(2,2));
        assertEquals(210,calculator.add(100,100));
    }
}
