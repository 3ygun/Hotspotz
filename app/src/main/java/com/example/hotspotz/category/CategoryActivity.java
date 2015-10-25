package com.example.hotspotz.category;

import android.os.Bundle;
import android.app.Activity;

import com.example.hotspotz.R;
import com.example.hotspotz.interfaces.CategoryData;

public class CategoryActivity extends Activity {

    public enum Category {
        all,
        closest,
        hottest,
        food,
        bars,
        galleries,
        history,
        graffiti,
        construction_osu,
        forests,
        green_spaces
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }


    protected CategoryData loadData(Category category) {
        CategoryData data;

        switch (category) {
            case graffiti:
                data = new GraffitiData();
                break;
            default:
                data = new GraffitiData();
                break;
        }

        return data;
    }
}
