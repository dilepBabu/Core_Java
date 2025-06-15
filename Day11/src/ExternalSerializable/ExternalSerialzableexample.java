package ExternalSerializable;

import java.nio.*;

import java.io.*;

public class ExternalSerialzableexample {

    public static void main(String[] args) {


        ExternalSerialzableexample sd=new ExternalSerialzableexample();
        sd.seral();
        sd.deseral();

    }

    private void deseral() {
        ObjectInputStream objectinputStream1=null;
        try
        {

            objectinputStream1=new ObjectInputStream(new FileInputStream("C:\\Users\\dilep\\Desktop\\javaaaa\\core\\Day11\\src\\ExternalSerializable\\Example.txt"));
           Example de=(Example)objectinputStream1.readObject();
            System.out.println(de.getName()+" "+de.getNumber());
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try
            {
                if(objectinputStream1!=null)
                {
                    objectinputStream1.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void seral() {
        ObjectOutputStream objectOutputStream=null;
        try
        {
           Example example=new Example(21,"dilep");
            objectOutputStream=new ObjectOutputStream(new FileOutputStream("C:\\Users\\dilep\\Desktop\\javaaaa\\core\\Day11\\src\\ExternalSerializable\\Example.txt"));
            objectOutputStream.writeObject(example);
            System.out.println("created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
            if(objectOutputStream!=null)
            {
                objectOutputStream.close();
            }} catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
