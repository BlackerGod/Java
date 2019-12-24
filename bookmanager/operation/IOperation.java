package bookmanager.operation;

import bookmanager.book.Book;
import bookmanager.book.BookList;

public interface IOperation {
    void work(BookList bookList);
}
