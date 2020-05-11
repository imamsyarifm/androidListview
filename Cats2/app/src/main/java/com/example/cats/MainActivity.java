package com.example.cats;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView rvCats;
    private ArrayList<Cat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCats = findViewById(R.id.rv_cats);
        rvCats.setHasFixedSize(true);


        list.addAll(CatsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCats.setLayoutManager(new LinearLayoutManager(this));
        final ListCatAdapter listCatAdapter = new ListCatAdapter(list);
        rvCats.setAdapter(listCatAdapter);

        listCatAdapter.setOnItemClickCallback(new ListCatAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Cat Cat) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailCats.class);
                //moveIntent1.putExtra(DetailCats.ITEM_EXTRA, (CharSequence) Cat);
                startActivity(moveIntent1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected (@NonNull MenuItem item){
    if (item.getItemId() == R.id.profil) {
        Intent moveIntent = new Intent(MainActivity.this, profil.class);
        startActivity(moveIntent);
    }
        return super.onOptionsItemSelected(item);
    }

}
