package com.example.cardviewrecyclerviewtutorial;

import static com.example.cardviewrecyclerviewtutorial.BookList.bookList;
import static com.example.cardviewrecyclerviewtutorial.Constants.BOOK_ID_EXTRA;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cardviewrecyclerviewtutorial.databinding.ActivityDetailBinding;

import java.util.List;


public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int bookID = getIntent().getIntExtra(BOOK_ID_EXTRA, -1);
        Book book = bookFromID(bookID);
        if (book != null) {
            binding.cover.setImageResource(book.getCover());
            binding.title.setText(book.getTitle());
            binding.description.setText(book.getDescription());
            binding.author.setText(book.getAuthor());
        }
    }

    private Book bookFromID(int bookID) {
        for (Book book : bookList) {
            if (book.getId() == bookID) {
                return book;
            }
        }
        return null;
    }
}
