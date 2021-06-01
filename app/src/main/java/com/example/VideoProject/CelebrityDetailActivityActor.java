package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CelebrityDetailActivityActor extends AppCompatActivity {

    public static final String dataKey = "DATAKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //  Create an ArrayList
        ArrayList<Celebrity> celebrity = new ArrayList<Celebrity>();

        celebrity.add(new Celebrity(R.drawable.zhangtianai, getString(R.string.zhangTianAi), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.actor),getString(R.string.zhangTianAiAwards), getString(R.string.zhangTianAiMasterwork), getString(R.string.zhangTianAiChatPrice), getString(R.string.zhangTianAiVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.chenhe, getString(R.string.chenHe), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.chenHeOccupation),getString(R.string.chenHeAwards), getString(R.string.chenHeMasterwork), getString(R.string.chenHeChatPrice), getString(R.string.chenHeVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.jialing, getString(R.string.jiaLing), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.jiaLingOccupation), getString(R.string.jiaLingAwards), getString(R.string.jiaLingMasterwork), getString(R.string.jiaLingChatPrice), getString(R.string.jiaLingVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.zhangjingchu, getString(R.string.zhangJingChu), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.actor),getString(R.string.zhangJingChuAwards), getString(R.string.zhangJingChuMasterwork), getString(R.string.zhangJingChuChatPrice), getString(R.string.zhangJingChuVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.bao, getString(R.string.baoBeiEr), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.baoBeiErOccupation), getString(R.string.baoBeiAwards), getString(R.string.baoBeiMasterwork), getString(R.string.baoBeiErChatPrice), getString(R.string.baoBeiErVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.huangshenyi, getString(R.string.huangShenYi), R.drawable.fourstarrating, getString(R.string.fourStarRating),getString(R.string.huangShenYiOccupation), getString(R.string.huangShenYiAwards), getString(R.string.huangShenYiMasterwork), getString(R.string.huangShenYiChatPrice), getString(R.string.huangShenYiVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.duchun, getString(R.string.duChun), R.drawable.fourstarrating, getString(R.string.fourStarRating), getString(R.string.actor), getString(R.string.duChunAwards), getString(R.string.duChunMasterwork), getString(R.string.duChunChatPrice), getString(R.string.duChunVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.mak, getString(R.string.makCheungChing), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.actor), getString(R.string.makCheungChingAwards), getString(R.string.makCheungChingMasterwork), getString(R.string.makCheungChingChatPrice), getString(R.string.makCheungChingVideoPrice)));

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
                Intent intent = new Intent(CelebrityDetailActivityActor.this, CelebrityActivity2.class);
                intent.putExtra(dataKey, celebrity);
                startActivity(intent);
            }
        });
    }
}
