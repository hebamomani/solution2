package com.example.cardviewrecyclerviewtutorial;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BookClickListener {


    private List<Book> bookList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        populateBooks();


    }

    @Override
    public void onClick(Book book) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("BOOK_ID_EXTRA", book.getId());
        startActivity(intent);
    }

    private void populateBooks() {
        Book book1 = new Book(
                R.drawable.abtm,
                "Victoria Devine",
                "AGELESS BODY, TIMELESS MIND",
                "The definitive text on the healing powers of the mind/body connection. In Ageless Body, Timeless Mind, world-renowned pioneer of integrative medicine Deepak Chopra goes beyond ancient mind/body wisdom and current anti-ageing research to show that you do not have to grow old. With the passage of time, you can retain your physical vitality, creativity, memory and self-esteem. Based on the theories of Ayurveda and groundbreaking research, Chopra reveals how we can use our innate capacity for balance to direct the way our bodies metabolize time and achieve our unbounded potential."
        );
        bookList.add(book1);

        Book book2 = new Book(
                R.drawable.tmom,
                "Amanda Lohrey",
                "THE MIRACLE OF MINDFULNESS",
                "This is the definitive book on mindfulness from the beloved Zen master and Nobel Peace Prize nominee Thich Nhat Hanh. With his signature clarity and warmth, he shares practical exercises and anecdotes to help us arrive at greater self-understanding and peacefulness, whether we are beginners or advanced students.\n\nBeautifully written, The Miracle of Mindfulness is the essential guide to welcoming presence in your life and truly living in the moment from the father of mindfulness.\n"
        );
        bookList.add(book2);

        Book book3 = new Book(
                R.drawable.trlt,
                "M. Scott Peck",
                "THE ROAD LESS TRAVELLED",
                "A timeless classic in personal development, The Road Less Travelled is a landmark work that has inspired millions. Drawing on the experiences of his career as a psychiatrist, Scott Peck combines scientific and spiritual views to guide us through the difficult, painful times in life by showing us how to confront our problems through the key principles of discipline, love and grace. Teaching us how to distinguish dependency from love, how to become a more sensitive parent and how to connect with your true self, this incredible book is the key to accepting and overcoming life's challenges and achieving a higher level of self-understanding."
        );
        bookList.add(book3);

        Book book4 = new Book(
                R.drawable.iewu,
                "Colleen Hoover",
                "IT ENDS WITH US",
                "'A brave and heartbreaking novel that digs its claws into you and doesn't let go, long after you've finished it' Anna Todd, author of the After series\n\n'A glorious and touching read, a forever keeper' USA Today\n\n'Will break your heart while filling you with hope' Sarah Pekkanen, Perfect Neighbors\n"
        );
        bookList.add(book4);

        Book book5 = new Book(
                R.drawable.ips,
                "Ross Coulthart",
                "IN PLAIN SIGHT",
                "Investigative journalist Ross Coulthart has been intrigued by UFOs since mysterious glowing lights were reported near New Zealand's Kaikoura mountains when he was a teenager. The 1978 sighting is just one of thousands since the 1940s, and yet research into UFOs is still seen as the realm of crackpots and conspiracy theorists."
        );
        bookList.add(book5);

        Book book6 = new Book(
                R.drawable.ttmc,
                "Richard Osman",
                "THE THURSDAY MURDER CLUB",
                "In a peaceful retirement village, four unlikely friends meet up once a week to investigate unsolved murders.\n\nBut when a brutal killing takes place on their very doorstep, the Thursday Murder Club find themselves in the middle of their first live case.\n\nElizabeth, Joyce, Ibrahim and Ron might be pushing eighty but they still have a few tricks up their sleeves."
        );
        bookList.add(book6);

        Book book7 = new Book(
                R.drawable.wyam,
                "Michael Robotham",
                "WHEN YOU ARE MINE",
                "Philomena McCarthy has defied the odds and become a promising young officer with the Metropolitan Police despite being the daughter of a notorious London gangster. Called to the scene of a domestic assault one day, she rescues a bloodied young woman, Tempe Brown, the mistress of a decorated detective. The incident is hushed up, but Phil has unwittingly made a dangerous enemy with powerful friends."
        );
        bookList.add(book7);
    }
}
