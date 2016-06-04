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

    private void showMessageText(String text)
    {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void onButton1(View view)
    {
        showMessageText("This button will launch popular movies app");
    }

    public void onButton2(View view)
    {
        showMessageText("This button will launch my stock hawk app");
    }

    public void onButton3(View view)
    {
        showMessageText("This button will launch build it bigger app");
    }

    public void onButton4(View view)
    {
        showMessageText("This button will launch your own app material app");
    }

    public void onButton5(View view)
    {
        showMessageText("This button will launch go ubiquitous app");
    }

    public void onButton6(View view)
    {
        showMessageText("This button will launch my capstone app");
    }
}
