package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CelebrityDetailActivityModel extends AppCompatActivity {

    public static final String dataKey = "DATAKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //  Create an ArrayList
        ArrayList<Celebrity> celebrity = new ArrayList<Celebrity>();

        celebrity.add(new Celebrity(R.drawable.jindachuan, getString(R.string.jinDaChuan), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.model), "", getString(R.string.jinDaChuanAwards), getString(R.string.jinDaChuanChatPrice), getString(R.string.jinDaChuanVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.zhouweitong, getString(R.string.zhouWeiTong), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.zhouWeiTongOccupation), getString(R.string.zhouWeiTongAwards), getString(R.string.zhouWeiTongMasterwork), getString(R.string.zhouWeiTongChatPrice), getString(R.string.zhouWeiTongVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.zhaocandice, getString(R.string.candiceZhou), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.candiceZhouOccupation),"",getString(R.string.candiceZhouAwards), getString(R.string.candiceZhouChatPrice), getString(R.string.candiceZhouVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.jackwong, getString(R.string.jackWong), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.model), "",getString(R.string.jackWongAwards), getString(R.string.jackWongChatPrice), getString(R.string.jackWongVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.louwaiman, getString(R.string.louWaiMan), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.model), "", getString(R.string.louWaiManMasterwork), getString(R.string.louWaiManChatPrice), getString(R.string.louWaiManVideoPrice)));

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
                Intent intent = new Intent(CelebrityDetailActivityModel.this, CelebrityActivity2.class);
                intent.putExtra(dataKey, celebrity);
                startActivity(intent);
            }
        });
    }
}