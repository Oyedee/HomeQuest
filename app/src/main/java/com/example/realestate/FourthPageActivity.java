package com.example.realestate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

public class FourthPageActivity extends AppCompatActivity {

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

        RecyclerView recyclerView = findViewById(R.id.list_images);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(FourthPageActivity.this,1,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager2); // set LayoutManager to RecyclerView
    }
}