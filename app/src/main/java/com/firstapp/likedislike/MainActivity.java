package com.firstapp.likedislike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView txt;
    TextView textView2;
    Button b;
    ImageView dislike;


    static int dis=0;
    static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.button);
        txt= findViewById(R.id.textView5);
        textView2= findViewById(R.id.textView6);
        dislike= findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(getApplicationContext(),secondActivity.class);
                Intent ii = new Intent(getApplicationContext(),secondActivity.class);
                ii.putExtra("like",""+i);
                ii.putExtra("dislike",""+dis);
                startActivity(ii);
               // startActivity(i);
            }
        });
        img = findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Like Clicked", Toast.LENGTH_SHORT).show();
                i++;
                txt.setText(""+i);





            }
        });
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Disliked Clicked", Toast.LENGTH_SHORT).show();
                dis++;
                textView2.setText(""+dis);

            }
        });

    }
}