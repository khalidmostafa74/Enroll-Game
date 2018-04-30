package com.example.ninja.enrolltask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int num1 , num2 ;
    ImageView imageView1,imageView2;
    int imgs[]={R.drawable.ic_d1,R.drawable.ic_d2,R.drawable.ic_d3,R.drawable.ic_d4,R.drawable.ic_d5,R.drawable.ic_d6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
    }
    public void enroll(View view){
        Random random = new Random();
        num1 = random.nextInt(6);
        imageView1.setImageResource(imgs[num1]);
        num2 = random.nextInt(6);
        imageView2.setImageResource(imgs[num2]);
        textView.setText(num1+num2+2+"");
    }
}
