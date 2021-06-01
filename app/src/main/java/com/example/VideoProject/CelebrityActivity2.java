package com.example.VideoProject;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CelebrityActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        HorizontalScrollView horizontalScrollView = findViewById(R.id.horizontalScrollView);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        ConstraintLayout.LayoutParams scrollViewParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        params.setMargins(23,675,0,0);
        scrollViewParams.setMargins(268, 675,0,0);

        Celebrity celebrity = getIntent().getParcelableExtra(CelebrityDetailActivityPopular.dataKey);
        imageView.setImageResource(celebrity.getImage());
        imageView1.setImageResource(celebrity.getRatingPhoto());
        textView.setText(celebrity.getName());
        textView28.setText(celebrity.getRating());
        textView1.setText(celebrity.getOccupation());
        textView2.setText(celebrity.getMasterwork());
        textView3.setText(celebrity.getChatPrice());
        textView4.setText(celebrity.getVideoPrice());
        textView24.setText(celebrity.getAwards());

        if (textView24.getText().equals("")){
            textView24.setVisibility(View.INVISIBLE);
            textView20.setVisibility(View.INVISIBLE);
        }
    }
}