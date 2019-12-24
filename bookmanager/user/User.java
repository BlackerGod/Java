package bookmanager.user;

import bookmanager.book.BookList;
import bookmanager.operation.IOperation;

abstract public class User {
    protected String name;

    // 持有当前用户支持的操作对象
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }
    abstract public int menu();
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
