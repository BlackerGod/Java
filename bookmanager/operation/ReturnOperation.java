package bookmanager.operation;

import bookmanager.book.Book;
import bookmanager.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("这是还书操作,请输入要还的书号");
        Scanner scanner=new Scanner(System.in);
        String bookID=scanner.next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=new BookList().getBook(i);
            if(!bookID.equals(book.getId())){
                continue;
            }
            if (!book.isBorrowed()) {
                System.out.println("这本书已经被归还了!");
                break;
            }
            book.setBorrowed(false);
        }
    }
}
