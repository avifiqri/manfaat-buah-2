package com.example.manfaatbuah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {


    private RecyclerView rvFruits;
    private ArrayList<Fruits> list = new ArrayList<>();
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvFruits = findViewById(R.id.rv_fruits_helth);
        rvFruits.setHasFixedSize(true);

            list.addAll(FruitsData.getListData());
        rvFruits.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ListFruitsAdapter(list,getApplicationContext());
        rvFruits.setAdapter(adapter);


    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode ) {
        switch (selectedMode){
            case R.id.about:
                Intent intent = new Intent(this, DetailsActivity.class);
                startActivity(intent);
                break;
        }

    }




}
