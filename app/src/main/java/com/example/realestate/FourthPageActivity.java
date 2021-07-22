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
        GridLayoutManager gridLayoutManager = new GridLayoutManager(FourthPageActivity.this, 1);
        gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);

        recyclerNotes.setLayoutManager(gridLayoutManager);

        RecyclerView recyclerView = findViewById(R.id.list_images);
        // set a GridLayoutManager with 3 number of columns
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(FourthPageActivity.this,1);
        gridLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        recyclerView.setLayoutManager(gridLayoutManager2); // set LayoutManager to RecyclerView
    }
}