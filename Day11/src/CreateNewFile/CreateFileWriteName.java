package CreateNewFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileWriteName {
    public static void main(String[] args) {
        String filename="name.txt";
        String name="Dilep";
        try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\Users\\dilep\\Desktop\\javaaaa\\core\\Day11\\src\\CreateNewFile\\"+filename)))
        {
            bufferedWriter.write(name);
            System.out.println("created and name wrote in the file ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
