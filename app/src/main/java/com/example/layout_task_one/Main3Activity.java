package com.example.layout_task_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void goToMain1(View view) {
        startActivity(new Intent(Main3Activity.this, MainActivity.class));
    }

    public void goToMain2(View view) {
        startActivity(new Intent(Main3Activity.this, Main2Activity.class));
    }

    public void goToMain4(View view) {
        startActivity(new Intent(Main3Activity.this, Main4Activity.class));
    }
}
