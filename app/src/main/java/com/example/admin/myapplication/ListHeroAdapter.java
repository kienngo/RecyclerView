package com.example.admin.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.MyViewHolder> {
    private final int INIT_SIZE = 0;
    private List<Integer> mListHero;
    private Context mContext;

    public ListHeroAdapter(List<Integer> listHero, Context context) {
        this.mListHero = listHero;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mImageHero.setBackgroundResource(mListHero.get(position));
    }

    @Override
    public int getItemCount() {
        return mListHero != null ? mListHero.size() : INIT_SIZE;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;

        public MyViewHolder(View itemView) {
            super(itemView);

            mImageHero = (ImageView) itemView.findViewById(R.id.image_item_hero);
        }
    }
}
