package com.example.sahil.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1(View view)
    {
        Toast.makeText(this,"This button will launch popular movies app",Toast.LENGTH_SHORT).show();
    }

    public void onButton2(View view)
    {
        Toast.makeText(this,"This button will launch my stock hawk app",Toast.LENGTH_SHORT).show();
    }

    public void onButton3(View view)
    {
        Toast.makeText(this,"This button will launch build it bigger app",Toast.LENGTH_SHORT).show();
    }

    public void onButton4(View view)
    {
        Toast.makeText(this,"This button will launch your own app material app",Toast.LENGTH_SHORT).show();
    }

    public void onButton5(View view)
    {
        Toast.makeText(this,"This button will launch go ubiquitous app",Toast.LENGTH_SHORT).show();
    }

    public void onButton6(View view)
    {
        Toast.makeText(this,"This button will launch my capstone app",Toast.LENGTH_SHORT).show();
    }
}
