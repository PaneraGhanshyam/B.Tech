package OOPJ_LABS.LAB_7;
import java.util.Scanner;

public class LAB7_2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        BookPublication bp=new BookPublication();
        PaperPublication pp=new PaperPublication();

        System.out.print("Enter book author : ");
        String BAuth=inp.nextLine();
        System.out.print("Enter book title : ");
        String title=inp.nextLine();

        bp.setAuthor(BAuth);
        bp.setTitle(title);

        System.out.print("Enter paper publisher : ");
        BAuth=inp.nextLine();
        System.out.print("Enter paper title : ");
        title=inp.nextLine();

        pp.setAuthor(BAuth);
        pp.setTitle(title);
        
        System.out.println("\n\n---------Book Details---------");
        System.out.println("book author is "+bp.getAuthor());
        System.out.println("book title is "+bp.getTitle());

        System.out.println("---------Paper Details---------");
        System.out.println("Paper author is "+pp.getAuthor());
        System.out.println("Paper title is "+pp.getTitle());
        
        inp.close();
        
    }
}
class Book{
    private String author;
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
class BookPublication extends Book{
    private String title;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
class PaperPublication extends Book{
    private String title;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
