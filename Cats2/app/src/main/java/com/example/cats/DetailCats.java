package com.example.cats;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailCats extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cats);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String detail = intent.getStringExtra("detail");
        int photo = intent.getIntExtra("photo");
            
        Toast.makeText(this, name+" = "+detail, Toast.LENGTH_SHORT).show();
        
        
        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);

        Cat cat = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (cat != null) {
            Glide.with(this)
                    .load(photo)
                    .into(imgItemPhoto);
            tvName.setText(name);
            tvDetail.setText(detail);
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Info Cats");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}

