package com.example.inputlistview;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class HeroListAdapter extends     ArrayAdapter<ListView> {
    List<ListView> heroList;
    Context context;
    int resource;


    public HeroListAdapter(List<ListView> heroList, Context context1, int resource1) {
        super(context1, resource1, heroList);
        this.heroList = heroList;
        this.context = context1;
        this.resource = resource1;
    }
}
