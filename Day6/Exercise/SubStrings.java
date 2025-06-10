package Day6.Exercise;

public class SubStrings {

    public static void main(String args[])
    {
        String string []={"a","abc","bc","ab"};
        String word="abc";
        int count=0;
        for (int i = 0; i <string.length ; i++) {
            if (word.contains(string[i]))
            {
                count++;
            }

        }
        System.out.println(count);
    }

}
