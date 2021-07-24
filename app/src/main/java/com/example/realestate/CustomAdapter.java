package com.example.realestate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList cardList;
    Context context;

    public CustomAdapter (Context context, ArrayList cardList) {
        this.cardList = cardList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        // inflate the item Layout
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // set the data in items
        holder.mainText.setText(cardList.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mainText;

        public MyViewHolder(View itemView) {
            super(itemView);
            mainText = itemView.findViewById(R.id.main_text);
        }
    }
}
