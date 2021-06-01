package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CelebrityDetailActivitySport  extends AppCompatActivity {

    public static final String dataKey = "DATAKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //  Create an ArrayList
        ArrayList<Celebrity> celebrity = new ArrayList<Celebrity>();

        celebrity.add(new Celebrity(R.drawable.chenlong, getString(R.string.chenLong), R.drawable.fivestarrating, getString(R.string.fiveStarRating),  getString(R.string.chenLongOccupation), "", getString(R.string.chenLongAwards), getString(R.string.chenLongChatPrice), getString(R.string.chenLongVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.panxiaoting, getString(R.string.panXiaoTing), R.drawable.fivestarrating,getString(R.string.fiveStarRating) , getString(R.string.panXiaoTingOccupation), "", getString(R.string.panXiaoTingAwards), getString(R.string.panXiaoTingChatPrice), getString(R.string.panXiaoTingVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.ruiruoqi, getString(R.string.huiRuoQi), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.huiRuoQiOccupation), "", getString(R.string.huiRuoQiAwards), getString(R.string.huiRuoQiChatPrice), getString(R.string.huiRuoQiVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.wangnan, getString(R.string.wangNan), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.wangNanOccupation), "", getString(R.string.wangNanAwards), getString(R.string.wangNanChatPrice), getString(R.string.wangNanVideoPrice)));
        celebrity.add(new Celebrity(R.drawable.zhangguowei, getString(R.string.zhangGuoWei), R.drawable.fivestarrating, getString(R.string.fiveStarRating), getString(R.string.zhangGuoWeiOccupation),"", getString(R.string.zhangGuoWeiAwards),getString(R.string.zhangJingChuChatPrice), getString(R.string.zhangGuoWeiVideoPrice)));

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
                Intent intent = new Intent(CelebrityDetailActivitySport.this, CelebrityActivity2.class);
                intent.putExtra(dataKey, celebrity);
                startActivity(intent);
            }
        });
    }
}