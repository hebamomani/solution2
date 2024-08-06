package com.example.cardviewrecyclerviewtutorial;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewrecyclerviewtutorial.databinding.CardCellBinding;


public class CardViewHolder extends RecyclerView.ViewHolder {
    private final CardCellBinding cardCellBinding;
    private final BookClickListener clickListener;

    public CardViewHolder(@NonNull CardCellBinding cardCellBinding, BookClickListener clickListener) {
        super(cardCellBinding.getRoot());
        this.cardCellBinding = cardCellBinding;
        this.clickListener = clickListener;
    }

    public void bindBook(final Book book) {
        cardCellBinding.cover.setImageResource(book.getCover());
        cardCellBinding.title.setText(book.getTitle());
        cardCellBinding.author.setText(book.getAuthor());

        cardCellBinding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(book);
            }
        });
    }
}
