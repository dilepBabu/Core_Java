package ExerciseTest;

import exercise.Palindrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    Palindrome p=null;

    @BeforeEach
    public void setbf()
    {
        p=new Palindrome();
    }
    @AfterEach
    public void setaf()
    {
        System.out.println("test case is done");
    }
    @Test
    public void pal()
    {
        boolean ans=p.palindrome("madam");
        Assertions.assertEquals(true,ans,"Palindrome");
    }
    @Test
    public void nonpalindrome()
    {

        boolean ans=p.palindrome("dilep");
        Assertions.assertEquals(false,ans,"Palindrome");
    }


    @Test
    public void casesensitivity()
    {
        Assertions.assertEquals(false,p.palindrome("Madam"),"Non-Palindrome");
    }

}
