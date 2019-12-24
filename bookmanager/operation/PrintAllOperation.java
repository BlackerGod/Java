package bookmanager.operation;
import bookmanager.book.BookList;
import bookmanager.user.Admin;

public class PrintAllOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有书籍");
        for (int i=0;i<bookList.getSize();i++){
            System.out.println(bookList.getBook(i));
        }
        System.out.println("当前有"+bookList.getSize()+"本书");

    }
}
