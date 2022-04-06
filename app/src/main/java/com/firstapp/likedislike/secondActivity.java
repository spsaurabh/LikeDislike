package com.firstapp.likedislike;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {


    TextView like, dislike;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        like= findViewById(R.id.like);
        dislike= findViewById(R.id.dislike);

        like.setText(getIntent().getStringExtra("like").toString());

        dislike.setText(getIntent().getStringExtra("dislike").toString());





    }
}
