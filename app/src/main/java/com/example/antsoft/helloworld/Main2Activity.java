package com.example.antsoft.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int so = getIntent().getExtras().getInt("string");
        Toast.makeText(this, so + "", Toast.LENGTH_SHORT).show();
    }
}
