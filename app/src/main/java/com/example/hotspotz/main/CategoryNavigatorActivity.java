package com.example.hotspotz.main;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.hotspotz.R;
import com.example.hotspotz.todo.ToDoActivity;

public class CategoryNavigatorActivity extends Activity implements View.OnClickListener{
    ImageButton[] btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_navigator);
        btn = new ImageButton[8];
        btn[0] = (ImageButton) findViewById(R.id.imageButton1);
        btn[0].setOnClickListener(this);
        btn[1] = (ImageButton) findViewById(R.id.imageButton2);
        btn[1].setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch(view.getId()){
            case(R.id.imageButton1):
                intent = new Intent(this, SplashActivity.class);
                intent.putExtra("category", )
                startActivity(intent);
                break;
            case(R.id.imageButton2):
                intent = new Intent(this, ToDoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
