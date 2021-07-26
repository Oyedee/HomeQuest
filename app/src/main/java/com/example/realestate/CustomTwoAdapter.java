package com.example.realestate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomTwoAdapter extends RecyclerView.Adapter<CustomTwoAdapter.ViewHolder> {

    ArrayList imageList1;
    ArrayList cityList;
    ArrayList priceList;
    Context context;

    public CustomTwoAdapter(Context context, ArrayList imageList1, ArrayList cityList, ArrayList priceList ) {
        this.context = context;
        this.imageList1 = imageList1;
        this.cityList = cityList;
        this.priceList = priceList;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_images_list, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomTwoAdapter.ViewHolder holder, int position) {
        holder.displayImage.setImageResource((Integer) imageList1.get(position));
        holder.displayText.setText(cityList.get(position).toString());
        holder.displayText1.setText(priceList.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return imageList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView displayImage;
        TextView displayText;
        TextView displayText1;

        public ViewHolder(View itemView) {
            super(itemView);
            displayImage = itemView.findViewById(R.id.imageView5);
            displayText = itemView.findViewById(R.id.textView14);
            displayText1 = itemView.findViewById(R.id.textView15);
        }
    }
}
