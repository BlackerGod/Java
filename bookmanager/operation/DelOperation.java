package bookmanager.operation;

import bookmanager.book.Book;
import bookmanager.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("这是删除操作");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的书号");
        String bookID=sc.nextLine();
        int i=0;
        for(;i<bookList.getSize();i++){
            Book book=new BookList().getBook(i);
            if(bookID.equals(book.getId())){
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("没有此书，请核对");
            return;
        }
        Book Lastbook=new BookList().getBook(bookList.getSize()-1);
        bookList.setBook(i,Lastbook);
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功");
    }
}
