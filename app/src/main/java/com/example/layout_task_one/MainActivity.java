package com.example.layout_task_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMain2(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }

    public void goToMain4(View view) {
        startActivity(new Intent(MainActivity.this, Main3Activity.class));
    }

    public void goToMain3(View view) {
        startActivity(new Intent(MainActivity.this, Main4Activity.class));
    }
}
