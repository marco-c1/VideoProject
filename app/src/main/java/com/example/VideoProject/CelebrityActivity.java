package com.example.VideoProject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CelebrityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView1 = findViewById(R.id.rating);
        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView24 = findViewById(R.id.textView24);
        TextView textView20 = findViewById(R.id.textView20);
        TextView textView28 = findViewById(R.id.textView28);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            int photo = extras.getInt("photo");
            int image = extras.getInt("ratingPhoto");
            String name = extras.getString("name");
            String ratingNumber = extras.getString("number");
            String occupation = extras.getString("occupation");
            String masterwork = extras.getString("masterwork");
            String awards = extras.getString("awards");
            String chatPrice = extras.getString("chatPrice");
            String videoPrice = extras.getString("videoPrice");

            imageView.setImageResource(photo);
            imageView1.setImageResource(image);
            textView.setText(name);
            textView28.setText(ratingNumber);
            textView1.setText(occupation);
            textView2.setText(masterwork);
            textView24.setText(awards);
            textView3.setText(chatPrice);
            textView4.setText(videoPrice);
        }

        if (textView24.getText().equals("")){
            textView24.setVisibility(View.INVISIBLE);
            textView20.setVisibility(View.INVISIBLE);
        }
    }
}