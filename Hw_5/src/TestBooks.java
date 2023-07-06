import java.util.Scanner;
public class TestBooks {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int totalPages=0;
        Book maxBook=new Book(0,"title");
        System.out.println("Number of java books in your library:");
        int numBooks=scan.nextInt();
        for(int i=0;i<numBooks;i++) {
            System.out.println("Enter the tile of the book:");
            String title = scan.next();
            System.out.println("Enter number of pages:");
            int pages = scan.nextInt();
            Book book=new Book(pages,title);
            totalPages += pages;
            if(book.compareTo(maxBook)>0){
                maxBook=book;
            }
            }
        double average_pages=(double) totalPages/numBooks;
        System.out.println("Average number of pages:"+average_pages);
        System.out.println("Biggest book:"+maxBook.getTitle()+", Pages:"+maxBook.getPages());
        }
        }



