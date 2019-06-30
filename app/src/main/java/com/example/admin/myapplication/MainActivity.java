package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> mListHero;
    private ListHeroAdapter mListHeroAdapter;
    private RecyclerView mRecyclerHero;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        inItData();
        inItView();
    }

    private void inItData() {
        mListHero = new ArrayList<>();
        mListHero.add(R.drawable.ic_one);
        mListHero.add(R.drawable.ic_two);
        mListHero.add(R.drawable.ic_three);
        mListHero.add(R.drawable.ic_four);
        mListHero.add(R.drawable.ic_five);
    }

    private void inItView() {
        mRecyclerHero = findViewById(R.id.recycler_hero);

        mListHeroAdapter = new ListHeroAdapter(mListHero, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerHero.setLayoutManager(layoutManager);
        mRecyclerHero.setAdapter(mListHeroAdapter);
    }
}
