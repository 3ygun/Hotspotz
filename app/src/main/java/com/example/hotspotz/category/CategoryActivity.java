package com.example.hotspotz.category;

import android.os.Bundle;
import android.app.Activity;

import com.example.hotspotz.R;

public class CategoryActivity extends Activity {

    public enum categories {
        

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

}
