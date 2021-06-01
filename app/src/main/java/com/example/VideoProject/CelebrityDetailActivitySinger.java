package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CelebrityDetailActivitySinger extends AppCompatActivity {

    public static final String dataKey = "DATAKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //  Create an ArrayList
        ArrayList<Celebrity> celebrity = new ArrayList<Celebrity>();

        //  Add elements in an ArrayList
        celebrity.add(new Celebrity(R.drawable.zhangbichen, getString(R.string.zhangBiChen),R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.zhangBiChenOccupation), getString(R.string.zhangBiChenAwards), getString(R.string.zhangBiChenMasterwork), getString(R.string.zhangJingChuChatPrice), getString(R.string.zhangBiChenVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.lijian, getString(R.string.liJian), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.actor), getString(R.string.liJianAwards), getString(R.string.liJianMasterwork), getString(R.string.liJianChatPrice), getString(R.string.liJianVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.leoli, getString(R.string.leoLi), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.leoLiOccupation),"", getString(R.string.leoLiMasterwork), getString(R.string.leoLiChatPrice), getString(R.string.leoLiVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.ip, getString(R.string.ip), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.singer),"", getString(R.string.ipMasterwork), getString(R.string.ipChatPrice), getString(R.string.ipVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.laujyuning, getString(R.string.laujyuning),R.drawable.threestarrating, getString(R.string.threeStarRating), getString(R.string.laujyuningOccupation),getString(R.string.laujyuningAwards), getString(R.string.laujyuningMasterwork), getString(R.string.laujyuningChatPrice), getString(R.string.laujyuningVideoPrice)));

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
                Intent intent = new Intent(CelebrityDetailActivitySinger.this, CelebrityActivity2.class);
                intent.putExtra(dataKey, celebrity);
                startActivity(intent);
            }
        });
    }
}
