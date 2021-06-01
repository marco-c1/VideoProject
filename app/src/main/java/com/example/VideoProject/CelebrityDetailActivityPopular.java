package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CelebrityDetailActivityPopular extends AppCompatActivity {

    public static final String dataKey = "DATAKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //  Create an ArrayList
        final ArrayList<Celebrity> celebrity = new ArrayList<Celebrity>();

        //  Add elements in an ArrayList
        celebrity.add(new Celebrity(R.drawable.zhangtianai, getString(R.string.zhangTianAi), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.actor), getString(R.string.zhangTianAiAwards), getString(R.string.zhangTianAiMasterwork), getString(R.string.zhangTianAiChatPrice), getString(R.string.zhangTianAiVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.chenhe, getString(R.string.chenHe), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.chenHeOccupation), getString(R.string.chenHeAwards), getString(R.string.chenHeMasterwork), getString(R.string.chenHeChatPrice), getString(R.string.chenHeVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.chenlong, getString(R.string.chenLong), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.chenLongOccupation),"",getString(R.string.chenLongAwards), getString(R.string.chenLongChatPrice), getString(R.string.chenLongVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.jialing, getString(R.string.jiaLing), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.jiaLingOccupation), getString(R.string.jiaLingAwards), getString(R.string.jiaLingMasterwork), getString(R.string.jiaLingChatPrice), getString(R.string.jiaLingVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.zhangjingchu, getString(R.string.zhangJingChu), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.actor), getString(R.string.zhangJingChuAwards), getString(R.string.zhangJingChuMasterwork), getString(R.string.zhangJingChuChatPrice), getString(R.string.zhangJingChuVideoPrice)));

        //  Create a CelebrityDetailAdapter, whose data source is a list of celebrities. The adapter knows how to create list items for each item in the list.
        final CelebrityDetailAdapter celebrityDetailAdapter = new CelebrityDetailAdapter(this, 0, celebrity);

        //  Find the object in the view hierarchy of the Activity.
        //  There should be a ListView with the view ID called list, which is declared in the list.xml layout file.
        final ListView listView = findViewById(R.id.list);

        //  Make the ListView use the Adapter we created above, so that the ListView will display
        //  list items for each authors and their names.
        listView.setAdapter(celebrityDetailAdapter);

        //  Set a OnItemClickListener on ListView.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Celebrity celebrity = celebrityDetailAdapter.getItem(position);
                Intent intent = new Intent(CelebrityDetailActivityPopular.this, CelebrityActivity2.class);
                intent.putExtra(dataKey, celebrity);
                startActivity(intent);
            }
        });
    }
}