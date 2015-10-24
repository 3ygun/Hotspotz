package com.example.hotspotz.main;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.hotspotz.R;
import com.example.hotspotz.todo.ToDoActivity;

public class SplashActivity extends Activity implements View.OnClickListener{

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case(R.id.button):
                Intent intent = new Intent(this, CategoryNavigatorActivity.class);
                startActivity(intent);
                break;
        }
    }
}
