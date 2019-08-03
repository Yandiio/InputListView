package com.example.inputlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HeroActivity extends AppCompatActivity {

    //    private Object ListView;
    List<Hero> heroList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list);
        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", " Avengers"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain America", " Avengers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));
        HeroListAdapter adapter = new HeroListAdapter(this, R.layout.activity_list, heroList);

        listView.setAdapter(adapter);
    }
}

