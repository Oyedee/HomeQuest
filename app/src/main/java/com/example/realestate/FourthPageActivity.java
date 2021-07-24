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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);
        // FullScreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_fourth_page);


        RecyclerView recyclerNotes = findViewById(R.id.list_cards);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(FourthPageActivity.this,1,LinearLayoutManager.HORIZONTAL,false);
        recyclerNotes.setLayoutManager(gridLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(FourthPageActivity.this , cardList);
        recyclerNotes.setAdapter(customAdapter);

        RecyclerView recyclerView = findViewById(R.id.list_images);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(FourthPageActivity.this,1,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager2); // set LayoutManager to RecyclerView
    }
}