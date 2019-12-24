package bookmanager.operation;

import bookmanager.book.Book;
import bookmanager.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("这是查询操作，请输入要查找的书名");
        Scanner scanner=new Scanner(System.in);
        String AimBook=scanner.next();
        int count=0;
        for(int i=0;i<bookList.getSize();i++){
            Book book=new BookList().getBook(i);
            if(AimBook.equals(book.getName())){
                System.out.println(book);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("没找到此书");
        } else {
            System.out.println("共计找到 " + count + " 本书!");
        }
    }
}
