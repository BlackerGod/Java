package bookmanager.operation;

import bookmanager.book.Book;
import bookmanager.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("这是借书操作");
        Scanner scanner=new Scanner(System.in);
        String bookID=scanner.nextLine();
        for(int i=0;i<bookList.getSize();i++){
            Book book=new BookList().getBook(i);
            if(!bookID.equals(book.getId())){
                continue;
            }
            if (book.isBorrowed()) {
                System.out.println("这本书已经被借走了!");
                break;
            }
            book.setBorrowed(true);
        }
    }
}
