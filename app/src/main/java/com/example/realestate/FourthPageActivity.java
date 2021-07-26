package com.example.realestate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Arrays;

public class FourthPageActivity extends AppCompatActivity {
    // ArrayList for estate items
    ArrayList cardList = new ArrayList<>(Arrays.asList("Allen Avenue", "Ikoyi Club", "Lekki Gardens", "Chevron View", "Ikeja GRA", "House Oyempemi", "House PorayMan"));
    ArrayList cityList = new ArrayList<>(Arrays.asList("PorayMan City", "Victoria Island", "Gbagada", "Lekki", "Landmark", "Ikeja", "Ikoyi"));
    ArrayList priceList = new ArrayList<>(Arrays.asList("5 million - 18 million", "2 million - 10 million", "15 million - 30 million", "4 million - 20 million",
            "6 million - 15 million", "10 million - 20 million", "50 million - 80 million"));

    ArrayList<Integer> imageList1 = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);
        // FullScreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_fourth_page);

        imageList1.add(R.drawable.display_image_1);
        imageList1.add(R.drawable.display_image_2);
        imageList1.add(R.drawable.display_image_3);
        imageList1.add(R.drawable.display_image_4);
        imageList1.add(R.drawable.display_image_5);
        imageList1.add(R.drawable.display_image_6);
        imageList1.add(R.drawable.display_image_7);


        RecyclerView recyclerNotes = findViewById(R.id.list_cards);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(FourthPageActivity.this,1,LinearLayoutManager.HORIZONTAL,false);
        recyclerNotes.setLayoutManager(gridLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(FourthPageActivity.this , cardList);
        recyclerNotes.setAdapter(customAdapter);

        RecyclerView recyclerView = findViewById(R.id.list_images);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(FourthPageActivity.this,1,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager2); // set LayoutManager to RecyclerView

        CustomTwoAdapter customTwoAdapter = new CustomTwoAdapter(FourthPageActivity.this, imageList1, cityList, priceList);
        recyclerView.setAdapter(customTwoAdapter);
    }
}