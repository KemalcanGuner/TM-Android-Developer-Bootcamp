package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.hw6.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Posts> postsArrayList = new ArrayList<>();
        Posts p1 = new Posts(1,"Found this guy today at work","littleguy","38.8k","r/aww");
        Posts p2 = new Posts(2,"Took me some time to get","meme","49.5k","r/memes");
        Posts p3 = new Posts(3,"Happy new Year","newyear","13.3k","r/CrappyDesign");
        Posts p4 = new Posts(4,"this open air spiral staircase","brasil","20.1k","r/damnthatsinteresting");

        postsArrayList.add(p1);postsArrayList.add(p3);postsArrayList.add(p2);
        postsArrayList.add(p4);


        PostsAdapter adapter = new PostsAdapter(this, postsArrayList);
        binding.rv.setAdapter(adapter);

    }
}