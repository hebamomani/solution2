package com.example.cardviewrecyclerviewtutorial;

import java.util.ArrayList;
import java.util.List;

// Assuming bookList is a static member of some class
public class BookList {
    static java.util.List<Book> bookList = new ArrayList<>();

    public static List<Book> getBookList() {
        return bookList;
    }

    public static int getSize() {
        return bookList.size();
    }
}
