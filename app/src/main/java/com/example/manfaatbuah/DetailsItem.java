package com.example.manfaatbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsItem extends AppCompatActivity {
    ImageView photo;
    TextView nama,function;
    String tvItemName, tvItemFunction;


    public static final String EXTRA_AGE = "photo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_item);
        getSupportActionBar().setTitle("Detail Buah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            photo = findViewById(R.id.img_item_photos);
            nama = findViewById(R.id.tv_item_name);
            function = findViewById(R.id.tv_item_function);

           int tvImage = getIntent().getIntExtra(EXTRA_AGE,0);
            tvItemName = getIntent().getStringExtra("nama");
            tvItemFunction = getIntent().getStringExtra("function");

            photo.setImageResource(tvImage);
            nama.setText(tvItemName);
            function.setText(tvItemFunction);


        }
}
