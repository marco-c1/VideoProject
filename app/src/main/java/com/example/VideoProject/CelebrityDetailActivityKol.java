package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CelebrityDetailActivityKol extends AppCompatActivity {

    public static final String dataKey = "DATAKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //  Create an ArrayList
        ArrayList<Celebrity> celebrity = new ArrayList<Celebrity>();

        celebrity.add(new Celebrity(R.drawable.emiwong, getString(R.string.emiWong), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.emiWongOccupation), "", getString(R.string.emiWongMasterwork), getString(R.string.emiWongChatPrice), getString(R.string.emiWongVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.nanachan, getString(R.string.nanaChan), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.kol), "", getString(R.string.nanaChanMasterwork), getString(R.string.nanaChanChatPrice), getString(R.string.nanaChanVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.kwok, getString(R.string.kwok), R.drawable.threestarrating, getString(R.string.threeStarRating), getString (R.string.kol), getString(R.string.kwokAwards), getString(R.string.kwokMasterwork), getString(R.string.kwokChatPrice), getString(R.string.kwokVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.chau, getString(R.string.chau), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.chauOccupation),"", getString(R.string.chauMasterwork), getString(R.string.chauChatPrice), getString(R.string.chauVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.ng, getString(R.string.ng), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.kol), "", getString(R.string.ngMasterwork), getString(R.string.ngChatPrice), getString(R.string.ngVideoPrice)));

        //  Create a CelebrityDetailAdapter, whose data source is a list of celebrities. The adapter knows how to create list items for each item in the list.
        final CelebrityDetailAdapter celebrityDetailAdapter = new CelebrityDetailAdapter(this, 0, celebrity);

        //  Find the object in the view hierarchy of the Activity.
        //  There should be a ListView with the view ID called list, which is declared in the list.xml layout file.
        ListView listView = findViewById(R.id.list);

        //  Make the ListView use the Adapter we created above, so that the ListView will display
        //  list items for each authors and their names.
        listView.setAdapter(celebrityDetailAdapter);

        //  Set a OnItemClickListener on ListView.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Celebrity celebrity = celebrityDetailAdapter.getItem(position);
                Intent intent = new Intent(CelebrityDetailActivityKol.this, CelebrityActivity2.class);
                intent.putExtra(dataKey, celebrity);
                startActivity(intent);
            }
        });
    }
}
