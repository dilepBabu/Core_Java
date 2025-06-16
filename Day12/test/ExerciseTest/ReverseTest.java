package ExerciseTest;

import exercise.Reverse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    Reverse reverse=null;
    @BeforeEach
    public void setbf()
    {
        reverse =new Reverse();
    }
    @AfterEach
    public void setaf()
    {
        System.out.println("test case is done");
    }
    @Test
    public void normalreversetest()
    {
        String result=reverse.reverse("dilep");
        Assertions.assertEquals("pelid",result);
    }

    @Test
    public void emptyreverse()
    {
        String result=reverse.reverse("");
        Assertions.assertEquals("",result);
    }
    @Test
    public void charreverse()
    {
        String result=reverse.reverse("a");
        Assertions.assertEquals("a",result);
    }

    @Test
    public void specialreverse()
    {
        String result=reverse.reverse("dilep123**");
        Assertions.assertEquals("**321pelid",result);
    }


}
