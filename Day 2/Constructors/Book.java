package Constructors;

public class Book {

    String title;
    String author;
     public Book()
     {
        title="Vaaranam aayiram";
        author="GVM";
     }
     public void display()
     {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
     }
     public static void main(String[] args) {
        Book b1=new Book();
        b1.display();
     }
    
    
}
