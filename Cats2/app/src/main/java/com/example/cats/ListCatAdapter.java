package com.example.cats;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCatAdapter extends RecyclerView.Adapter<ListCatAdapter.ListViewHolder> {
    private ArrayList<Cat> listCat;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListCatAdapter(ArrayList<Cat> list){
        this.listCat = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_cat, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Cat cat = listCat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cat.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(cat.getName());
        holder.tvDetail.setText(cat.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //langsung saja taruh Intent disini
                Intent moveIntent = new Intent(holder.itemView.getContext(), DetailCats.class);
                moveIntent.putExtra("name", cat.getName());
                moveIntent.putExtra("photo", cat.getPhoto());
                moveIntent.putExtra("detail", cat.getDetail());
                startActivity(moveIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listCat.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public static class OnItemClickCallback {
        void onItemClicked(Cat cat) {
            return;
        }
    }
}
