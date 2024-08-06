package com.example.cardviewrecyclerviewtutorial;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewrecyclerviewtutorial.databinding.CardCellBinding;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private final List<Book> books;
    private final BookClickListener clickListener;

    public CardAdapter(List<Book> books, BookClickListener clickListener) {
        this.books = books;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        CardCellBinding binding = CardCellBinding.inflate(from, parent, false);
        return new CardViewHolder(binding, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.bindBook(books.get(position));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
