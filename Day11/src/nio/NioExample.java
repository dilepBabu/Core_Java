package nio;
import java.nio.CharBuffer;
public class NioExample {
    public static void main(String[] args) {

        CharBuffer charBuffer=CharBuffer.allocate(8);
        String name="dilep";
        for (int i = 0; i < name.length(); i++) {
            char[] a = name.toCharArray();
            charBuffer.put(a[i]);
        }
        System.out.println(charBuffer.position());
        charBuffer.flip();
        while (charBuffer.hasRemaining())
        {
            System.out.println(charBuffer.get());
        }

    }
}
