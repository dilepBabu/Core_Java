package Day6.Exercise;

public class SubStringtwo {
    public static void main(String args[]) {
        String string = "ababc";
        String word = "ab";
        String s = word;
        int count = 0;


        while (string.contains(s)) {
            count++;
            s += word;

        }
        System.out.println(count);
    }

}


