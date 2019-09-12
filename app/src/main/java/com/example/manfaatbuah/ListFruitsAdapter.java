package com.example.manfaatbuah;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static com.example.manfaatbuah.DetailsItem.EXTRA_AGE;

public class ListFruitsAdapter extends RecyclerView.Adapter<ListFruitsAdapter.ListViewHolder>   {


    public ListFruitsAdapter(ArrayList<Fruits> list, Context context) {
        this.listFruits = list;
        this.context = context;
    }

    private Context context;

    private ArrayList<Fruits> listFruits;

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fruits_health,viewGroup,false);

        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder , final int position) {


        final Fruits fruits = listFruits.get(position);


        Glide.with(holder.itemView.getContext())
                .load(fruits.getPhoto())
                .apply(new RequestOptions().override(60,60))
                .into(holder.imgPhoto);
        holder.tvName.setText(fruits.getName());
        holder.tvFunction.setText(fruits.getFunction());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailsItem.class);
                intent.putExtra(EXTRA_AGE,fruits.getPhoto());
                intent.putExtra("nama",fruits.getName());
                intent.putExtra("function", "Manfaatnya : \n " + fruits.getFunction());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listFruits.size();
    }



    class ListViewHolder extends RecyclerView.ViewHolder {
          ImageView imgPhoto;
        TextView tvName,tvFunction;
        LinearLayout linearLayout;



        ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFunction = itemView.findViewById(R.id.tv_item_function);
            linearLayout = itemView.findViewById(R.id.linear_layout);


        }
    }
}
