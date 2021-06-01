package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    ArrayList<String>list;

    public final static String HOME = "首页";

    public HomeFragment() {
        //  Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);
        ImageView imageView = rootView.findViewById(R.id.imageView0);
        int imageView1 = R.drawable.zhangtianai;
        Glide.with(this).load(imageView1).into(imageView);
        ImageView imageView2 = rootView.findViewById(R.id.imageView8);
        int imageView3 = R.drawable.chenhe;
        Glide.with(this).load(imageView3).into(imageView2);
        ImageView imageView4 = rootView.findViewById(R.id.imageView02);
        int imageView5 = R.drawable.chat;
        Glide.with(this).load(imageView5).into(imageView4);
        ImageView imageView6 = rootView.findViewById(R.id.imageView03);
        int imageView7 = R.drawable.video;
        Glide.with(this).load(imageView7).into(imageView6);
        ImageView imageView8 = rootView.findViewById(R.id.imageView10);
        int imageView9 = R.drawable.chat;
        Glide.with(this).load(imageView9).into(imageView8);
        ImageView imageView10 = rootView.findViewById(R.id.imageView11);
        int imageView11 = R.drawable.video;
        Glide.with(this).load(imageView11).into(imageView10);
        ImageView imageView12 = rootView.findViewById(R.id.imageView100);
        int imageView13 = R.drawable.chenlong;
        Glide.with(this).load(imageView13).into(imageView12);
        ImageView imageView14 = rootView.findViewById(R.id.imageView103);
        int imageView15 = R.drawable.chat;
        Glide.with(this).load(imageView15).into(imageView14);
        ImageView imageView16 = rootView.findViewById(R.id.imageView104);
        int imageView17 = R.drawable.video;
        Glide.with(this).load(imageView17).into(imageView16);
        ImageView imageView18 = rootView.findViewById(R.id.imageView20);
        int imageView19 = R.drawable.jialing;
        Glide.with(this).load(imageView19).into(imageView18);
        ImageView imageView20 = rootView.findViewById(R.id.imageView24);
        int imageView21 = R.drawable.chat;
        Glide.with(this).load(imageView21).into(imageView20);
        ImageView imageView22 = rootView.findViewById(R.id.imageView25);
        int imageView23 = R.drawable.video;
        Glide.with(this).load(imageView23).into(imageView22);
        ImageView imageView24 = rootView.findViewById(R.id.imageView30);
        int imageView25 = R.drawable.zhangjingchu;
        Glide.with(this).load(imageView25).into(imageView24);
        ImageView imageView26 = rootView.findViewById(R.id.imageView34);
        int imageView27 = R.drawable.chat;
        Glide.with(this).load(imageView27).into(imageView26);
        ImageView imageView28 = rootView.findViewById(R.id.imageView35);
        int imageView29 = R.drawable.video;
        Glide.with(this).load(imageView29).into(imageView28);
        ImageView imageView30 = rootView.findViewById(R.id.imageView00);
        int imageView31 = R.drawable.chenlong;
        Glide.with(this).load(imageView31).into(imageView30);
        ImageView imageView32 = rootView.findViewById(R.id.imageView04);
        int imageView33 = R.drawable.chat;
        Glide.with(this).load(imageView33).into(imageView32);
        ImageView imageView34 = rootView.findViewById(R.id.imageView05);
        int imageView35 = R.drawable.video;
        Glide.with(this).load(imageView35).into(imageView34);
        ImageView imageView36 = rootView.findViewById(R.id.imageView40);
        int imageView37 = R.drawable.panxiaoting;
        Glide.with(this).load(imageView37).into(imageView36);
        ImageView imageView38 = rootView.findViewById(R.id.imageView44);
        int imageView39 = R.drawable.chat;
        Glide.with(this).load(imageView39).into(imageView38);
        ImageView imageView40 = rootView.findViewById(R.id.imageView45);
        int imageView41 = R.drawable.video;
        Glide.with(this).load(imageView41).into(imageView40);
        ImageView imageView42 = rootView.findViewById(R.id.imageView50);
        int imageView43 = R.drawable.ruiruoqi;
        Glide.with(this).load(imageView43).into(imageView42);
        ImageView imageView44 = rootView.findViewById(R.id.imageView54);
        int imageView45 = R.drawable.chat;
        Glide.with(this).load(imageView45).into(imageView44);
        ImageView imageView46 = rootView.findViewById(R.id.imageView55);
        int imageView47 = R.drawable.video;
        Glide.with(this).load(imageView47).into(imageView46);
        ImageView imageView48 = rootView.findViewById(R.id.imageView60);
        int imageView49 = R.drawable.wangnan;
        Glide.with(this).load(imageView49).into(imageView48);
        ImageView imageView50 = rootView.findViewById(R.id.imageView64);
        int imageView51 = R.drawable.chat;
        Glide.with(this).load(imageView51).into(imageView50);
        ImageView imageView52 = rootView.findViewById(R.id.imageView65);
        int imageView53 = R.drawable.video;
        Glide.with(this).load(imageView53).into(imageView52);
        ImageView imageView54 = rootView.findViewById(R.id.imageView70);
        int imageView55 = R.drawable.zhangguowei;
        Glide.with(this).load(imageView55).into(imageView54);
        ImageView imageView56 = rootView.findViewById(R.id.imageView74);
        int imageView57 = R.drawable.chat;
        Glide.with(this).load(imageView57).into(imageView56);
        ImageView imageView58 = rootView.findViewById(R.id.imageView75);
        int imageView59 = R.drawable.video;
        Glide.with(this).load(imageView59).into(imageView58);
        ImageView imageView60 = rootView.findViewById(R.id.imageView190);
        int imageView61 = R.drawable.chenhe;
        Glide.with(this).load(imageView61).into(imageView60);
        ImageView imageView62 = rootView.findViewById(R.id.imageView194);
        int imageView63 = R.drawable.chat;
        Glide.with(this).load(imageView63).into(imageView62);
        ImageView imageView64 = rootView.findViewById(R.id.imageView195);
        int imageView65 = R.drawable.video;
        Glide.with(this).load(imageView65).into(imageView64);
        ImageView imageView66 = rootView.findViewById(R.id.imageView200);
        int imageView67 = R.drawable.jialing;
        Glide.with(this).load(imageView67).into(imageView66);
        ImageView imageView68 = rootView.findViewById(R.id.imageView204);
        int imageView69 = R.drawable.chat;
        Glide.with(this).load(imageView69).into(imageView68);
        ImageView imageView70 = rootView.findViewById(R.id.imageView205);
        int imageView71 = R.drawable.video;
        Glide.with(this).load(imageView71).into(imageView70);
        ImageView imageView72 = rootView.findViewById(R.id.imageView210);
        int imageView73 = R.drawable.bao;
        Glide.with(this).load(imageView73).into(imageView72);
        ImageView imageView74 = rootView.findViewById(R.id.imageView214);
        int imageView75 = R.drawable.chat;
        Glide.with(this).load(imageView75).into(imageView74);
        ImageView imageView76 = rootView.findViewById(R.id.imageView216);
        int imageView77 = R.drawable.video;
        Glide.with(this).load(imageView77).into(imageView76);
        ImageView imageView78 = rootView.findViewById(R.id.imageView220);
        int imageView79 = R.drawable.huangshenyi;
        Glide.with(this).load(imageView79).into(imageView78);
        ImageView imageView80 = rootView.findViewById(R.id.imageView224);
        int imageView81 = R.drawable.chat;
        Glide.with(this).load(imageView81).into(imageView80);
        ImageView imageView82 = rootView.findViewById(R.id.imageView225);
        int imageView83 = R.drawable.video;
        Glide.with(this).load(imageView83).into(imageView82);
        ImageView imageView84 = rootView.findViewById(R.id.imageView230);
        int imageView85 = R.drawable.duchun;
        Glide.with(this).load(imageView85).into(imageView84);
        ImageView imageView86 = rootView.findViewById(R.id.imageView234);
        int imageView87 = R.drawable.chat;
        Glide.with(this).load(imageView87).into(imageView86);
        ImageView imageView88 = rootView.findViewById(R.id.imageView235);
        int imageView89 = R.drawable.video;
        Glide.with(this).load(imageView89).into(imageView88);
        ImageView imageView90 = rootView.findViewById(R.id.imageView140);
        int imageView91 = R.drawable.jindachuan;
        Glide.with(this).load(imageView91).into(imageView90);
        ImageView imageView92 = rootView.findViewById(R.id.imageView144);
        int imageView93 = R.drawable.chat;
        Glide.with(this).load(imageView93).into(imageView92);
        ImageView imageView94 = rootView.findViewById(R.id.imageView145);
        int imageView95 = R.drawable.video;
        Glide.with(this).load(imageView95).into(imageView94);
        ImageView imageView96 = rootView.findViewById(R.id.imageView150);
        int imageView97 = R.drawable.zhouweitong;
        Glide.with(this).load(imageView97).into(imageView96);
        ImageView imageView98 = rootView.findViewById(R.id.imageView154);
        int imageView99 = R.drawable.chat;
        Glide.with(this).load(imageView99).into(imageView98);
        ImageView imageView100 = rootView.findViewById(R.id.imageView155);
        int imageView101 = R.drawable.video;
        Glide.with(this).load(imageView101).into(imageView100);
        ImageView imageView102 = rootView.findViewById(R.id.imageView160);
        int imageView103 = R.drawable.zhaocandice;
        Glide.with(this).load(imageView103).into(imageView102);
        ImageView imageView104 = rootView.findViewById(R.id.imageView164);
        int imageView105 = R.drawable.chat;
        Glide.with(this).load(imageView105).into(imageView104);
        ImageView imageView106 = rootView.findViewById(R.id.imageView166);
        int imageView107 = R.drawable.video;
        Glide.with(this).load(imageView107).into(imageView106);
        ImageView imageView108 = rootView.findViewById(R.id.imageView170);
        int imageView109 = R.drawable.jackwong;
        Glide.with(this).load(imageView109).into(imageView108);
        ImageView imageView110 = rootView.findViewById(R.id.imageView174);
        int imageView111 = R.drawable.chat;
        Glide.with(this).load(imageView111).into(imageView110);
        ImageView imageView112 = rootView.findViewById(R.id.imageView175);
        int imageView113 = R.drawable.video;
        Glide.with(this).load(imageView113).into(imageView112);
        ImageView imageView114 = rootView.findViewById(R.id.imageView180);
        int imageView115 = R.drawable.louwaiman;
        Glide.with(this).load(imageView115).into(imageView114);
        ImageView imageView116 = rootView.findViewById(R.id.imageView184);
        int imageView117 = R.drawable.chat;
        Glide.with(this).load(imageView117).into(imageView116);
        ImageView imageView118 = rootView.findViewById(R.id.imageView185);
        int imageView119 = R.drawable.video;
        Glide.with(this).load(imageView119).into(imageView118);
        ImageView imageView120 = rootView.findViewById(R.id.imageView240);
        int imageView121 = R.drawable.zhangbichen;
        Glide.with(this).load(imageView121).into(imageView120);
        ImageView imageView122 = rootView.findViewById(R.id.imageView244);
        int imageView123 = R.drawable.chat;
        Glide.with(this).load(imageView123).into(imageView122);
        ImageView imageView124 = rootView.findViewById(R.id.imageView245);
        int imageView125 = R.drawable.video;
        Glide.with(this).load(imageView125).into(imageView124);
        ImageView imageView126 = rootView.findViewById(R.id.imageView250);
        int imageView127 = R.drawable.lijian;
        Glide.with(this).load(imageView127).into(imageView126);
        ImageView imageView128 = rootView.findViewById(R.id.imageView254);
        int imageView129 = R.drawable.chat;
        Glide.with(this).load(imageView129).into(imageView128);
        ImageView imageView130 = rootView.findViewById(R.id.imageView255);
        int imageView131 = R.drawable.video;
        Glide.with(this).load(imageView131).into(imageView130);
        ImageView imageView132 = rootView.findViewById(R.id.imageView260);
        int imageView133 = R.drawable.leoli;
        Glide.with(this).load(imageView133).into(imageView132);
        ImageView imageView134 = rootView.findViewById(R.id.imageView264);
        int imageView135 = R.drawable.chat;
        Glide.with(this).load(imageView135).into(imageView134);
        ImageView imageView136 = rootView.findViewById(R.id.imageView266);
        int imageView137 = R.drawable.video;
        Glide.with(this).load(imageView137).into(imageView136);
        ImageView imageView138 = rootView.findViewById(R.id.imageView270);
        int imageView139 = R.drawable.ip;
        Glide.with(this).load(imageView139).into(imageView138);
        ImageView imageView140 = rootView.findViewById(R.id.imageView274);
        int imageView141 = R.drawable.chat;
        Glide.with(this).load(imageView141).into(imageView140);
        ImageView imageView142 = rootView.findViewById(R.id.imageView275);
        int imageView143 = R.drawable.video;
        Glide.with(this).load(imageView143).into(imageView142);
        ImageView imageView144 = rootView.findViewById(R.id.imageView280);
        int imageView145 = R.drawable.laujyuning;
        Glide.with(this).load(imageView145).into(imageView144);
        ImageView imageView146 = rootView.findViewById(R.id.imageView284);
        int imageView147 = R.drawable.chat;
        Glide.with(this).load(imageView147).into(imageView146);
        ImageView imageView148 = rootView.findViewById(R.id.imageView285);
        int imageView149 = R.drawable.video;
        Glide.with(this).load(imageView149).into(imageView148);
        ImageView imageView150 = rootView.findViewById(R.id.imageView80);
        int imageView151 = R.drawable.emiwong;
        Glide.with(this).load(imageView151).into(imageView150);
        ImageView imageView152 = rootView.findViewById(R.id.imageView84);
        int imageView153 = R.drawable.chat;
        Glide.with(this).load(imageView153).into(imageView152);
        ImageView imageView154 = rootView.findViewById(R.id.imageView85);
        int imageView155 = R.drawable.video;
        Glide.with(this).load(imageView155).into(imageView154);
        ImageView imageView156 = rootView.findViewById(R.id.imageView90);
        int imageView157 = R.drawable.nanachan;
        Glide.with(this).load(imageView157).into(imageView156);
        ImageView imageView158 = rootView.findViewById(R.id.imageView94);
        int imageView159 = R.drawable.chat;
        Glide.with(this).load(imageView159).into(imageView158);
        ImageView imageView160 = rootView.findViewById(R.id.imageView95);
        int imageView161 = R.drawable.video;
        Glide.with(this).load(imageView161).into(imageView160);
        ImageView imageView162 = rootView.findViewById(R.id.imageView110);
        int imageView163 = R.drawable.kwok;
        Glide.with(this).load(imageView163).into(imageView162);
        ImageView imageView164 = rootView.findViewById(R.id.imageView114);
        int imageView165 = R.drawable.chat;
        Glide.with(this).load(imageView165).into(imageView164);
        ImageView imageView166 = rootView.findViewById(R.id.imageView116);
        int imageView167 = R.drawable.video;
        Glide.with(this).load(imageView167).into(imageView166);
        ImageView imageView168 = rootView.findViewById(R.id.imageView120);
        int imageView169 = R.drawable.chau;
        Glide.with(this).load(imageView169).into(imageView168);
        ImageView imageView170 = rootView.findViewById(R.id.imageView124);
        int imageView171 = R.drawable.chat;
        Glide.with(this).load(imageView171).into(imageView170);
        ImageView imageView172 = rootView.findViewById(R.id.imageView125);
        int imageView173 = R.drawable.video;
        Glide.with(this).load(imageView173).into(imageView172);
        ImageView imageView174 = rootView.findViewById(R.id.imageView130);
        int imageView175 = R.drawable.ng;
        Glide.with(this).load(imageView175).into(imageView174);
        ImageView imageView176 = rootView.findViewById(R.id.imageView134);
        int imageView177 = R.drawable.chat;
        Glide.with(this).load(imageView177).into(imageView176);
        ImageView imageView178 = rootView.findViewById(R.id.imageView135);
        int imageView179 = R.drawable.video;
        Glide.with(this).load(imageView179).into(imageView178);
        ImageView imageView184 = rootView.findViewById(R.id.imageView301);
        int imageView185 = R.drawable.mak;
        Glide.with(this).load(imageView185).into(imageView184);
        ImageView imageView180 = rootView.findViewById(R.id.imageView305);
        int imageView181 = R.drawable.chat;
        Glide.with(this).load(imageView181).into(imageView180);
        ImageView imageView182 = rootView.findViewById(R.id.imageView306);
        int imageView183 = R.drawable.video;
        Glide.with(this).load(imageView183).into(imageView182);
        ImageView imageView186 = rootView.findViewById(R.id.imageView390);
        int imageView187 = R.drawable.zhangjingchu;
        Glide.with(this).load(imageView187).into(imageView186);
        ImageView imageView188 = rootView.findViewById(R.id.imageView394);
        int imageView189 = R.drawable.chat;
        Glide.with(this).load(imageView189).into(imageView188);
        ImageView imageView190 = rootView.findViewById(R.id.imageView395);
        int imageView191 = R.drawable.video;
        Glide.with(this).load(imageView191).into(imageView190);
        ImageView imageView192 = rootView.findViewById(R.id.imageView197);
        int imageView193 = R.drawable.zhangtianai;
        Glide.with(this).load(imageView193).into(imageView192);
        ImageView imageView194 = rootView.findViewById(R.id.imageView201);
        int imageView195 = R.drawable.chat;
        Glide.with(this).load(imageView195).into(imageView194);
        ImageView imageView196 = rootView.findViewById(R.id.imageView202);
        int imageView197 = R.drawable.video;
        Glide.with(this).load(imageView197).into(imageView196);

        LinearLayout linearLayout = rootView.findViewById(R.id.linearLayout1);

        //  Set a click listener on this layout
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle = new Bundle();
                // Populate Bundle
                bundle.putInt("photo", R.drawable.zhangtianai);
                bundle.putString("name", getString(R.string.zhangTianAi));
                bundle.putString("occupation", getString(R.string.actor));
                bundle.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle.putString("number", getString(R.string.fourStarRating));
                bundle.putString("masterwork", getString(R.string.zhangTianAiMasterwork));
                bundle.putString("awards", getString(R.string.zhangTianAiAwards));
                bundle.putString("chatPrice", getString(R.string.zhangTianAiChatPrice));
                bundle.putString("videoPrice", getString(R.string.zhangTianAiVideoPrice));
                // Attach bundle to intent
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout2 = rootView.findViewById(R.id.linearLayout2);
        //  Set a click listener on this layout
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle2 = new Bundle();
                // Populate Bundle
                bundle2.putInt("photo", R.drawable.chenhe);
                bundle2.putString("name", getString(R.string.chenHe));
                bundle2.putString("occupation", getString(R.string.chenHeOccupation));
                bundle2.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle2.putString("number", getString(R.string.fiveStarRating));
                bundle2.putString("masterwork", getString(R.string.chenHeMasterwork));
                bundle2.putString("awards", getString(R.string.chenHeAwards));
                bundle2.putString("chatPrice", getString(R.string.chenHeChatPrice));
                bundle2.putString("videoPrice", getString(R.string.chenHeVideoPrice));
                // Attach bundle to intent
                intent2.putExtras(bundle2);
                startActivity(intent2);
            }
        });

        LinearLayout linearLayout3 = rootView.findViewById(R.id.linearLayout3);
        //  Set a click listener on this layout
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle3 = new Bundle();
                // Populate Bundle
                bundle3.putInt("photo", R.drawable.chenlong);
                bundle3.putString("name", getString(R.string.chenLong));
                bundle3.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle3.putString("number", getString(R.string.fiveStarRating));
                bundle3.putString("occupation", getString(R.string.chenLongOccupation));
                bundle3.putString("masterwork", getString(R.string.chenLongAwards));
                bundle3.putString("chatPrice", getString(R.string.chenLongChatPrice));
                bundle3.putString("videoPrice", getString(R.string.chenLongVideoPrice));
                // Attach bundle to intent
                intent3.putExtras(bundle3);
                startActivity(intent3);
            }
        });

        LinearLayout linearLayout4 = rootView.findViewById(R.id.linearLayout4);
        //  Set a click listener on this layout
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle4 = new Bundle();
                // Populate Bundle
                bundle4.putInt("photo", R.drawable.jialing);
                bundle4.putString("name", getString(R.string.jiaLing));
                bundle4.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle4.putString("number", getString(R.string.fiveStarRating));
                bundle4.putString("occupation", getString(R.string.jiaLingOccupation));
                bundle4.putString("masterwork", getString(R.string.jiaLingMasterwork));
                bundle4.putString("awards", getString(R.string.jiaLingAwards));
                bundle4.putString("chatPrice", getString(R.string.jiaLingChatPrice));
                bundle4.putString("videoPrice", getString(R.string.jiaLingVideoPrice));
                // Attach bundle to intent
                intent4.putExtras(bundle4);
                startActivity(intent4);
            }
        });

        LinearLayout linearLayout5 = rootView.findViewById(R.id.linearLayout5);
        //  Set a click listener on this layout
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle5 = new Bundle();
                // Populate Bundle
                bundle5.putInt("photo", R.drawable.zhangjingchu);
                bundle5.putString("name", getString(R.string.zhangJingChu));
                bundle5.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle5.putString("number", getString(R.string.fiveStarRating));
                bundle5.putString("occupation", getString(R.string.actor));
                bundle5.putString("masterwork", getString(R.string.zhangJingChuMasterwork));
                bundle5.putString("awards", getString(R.string.zhangJingChuAwards));
                bundle5.putString("chatPrice", getString(R.string.zhangJingChuChatPrice));
                bundle5.putString("videoPrice", getString(R.string.zhangJingChuVideoPrice));
                // Attach bundle to intent
                intent5.putExtras(bundle5);
                startActivity(intent5);
            }
        });

        LinearLayout linearLayout6 = rootView.findViewById(R.id.linearLayout6);
        //  Set a click listener on this layout
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle6 = new Bundle();
                // Populate Bundle
                bundle6.putInt("photo", R.drawable.chenlong);
                bundle6.putString("name", getString(R.string.chenLong));
                bundle6.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle6.putString("number", getString(R.string.fiveStarRating));
                bundle6.putString("occupation", getString(R.string.chenLongOccupation));
                bundle6.putString("masterwork", getString(R.string.chenLongAwards));
                bundle6.putString("chatPrice", getString(R.string.chenLongChatPrice));
                bundle6.putString("videoPrice", getString(R.string.chenLongVideoPrice));
                // Attach bundle to intent
                intent6.putExtras(bundle6);
                startActivity(intent6);
            }
        });

        LinearLayout linearLayout7 = rootView.findViewById(R.id.linearLayout7);
        //  Set a click listener on this layout
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle7 = new Bundle();
                // Populate Bundle
                bundle7.putInt("photo", R.drawable.panxiaoting);
                bundle7.putString("name", getString(R.string.panXiaoTing));
                bundle7.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle7.putString("number", getString(R.string.fiveStarRating));
                bundle7.putString("occupation", getString(R.string.panXiaoTingOccupation));
                bundle7.putString("masterwork", getString(R.string.panXiaoTingAwards));
                bundle7.putString("awards", "");
                bundle7.putString("chatPrice", getString(R.string.panXiaoTingChatPrice));
                bundle7.putString("videoPrice", getString(R.string.panXiaoTingVideoPrice));
                // Attach bundle to intent
                intent7.putExtras(bundle7);
                startActivity(intent7);
            }
        });

        LinearLayout linearLayout8 = rootView.findViewById(R.id.linearLayout8);
        //  Set a click listener on this layout
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle8 = new Bundle();
                // Populate Bundle
                bundle8.putInt("photo", R.drawable.ruiruoqi);
                bundle8.putString("name", getString(R.string.huiRuoQi));
                bundle8.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle8.putString("number", getString(R.string.fiveStarRating));
                bundle8.putString("occupation", getString(R.string.huiRuoQiOccupation));
                bundle8.putString("masterwork", getString(R.string.huiRuoQiAwards));
                bundle8.putString("awards", "");
                bundle8.putString("chatPrice", getString(R.string.huiRuoQiChatPrice));
                bundle8.putString("videoPrice", getString(R.string.huiRuoQiVideoPrice));
                // Attach bundle to intent
                intent8.putExtras(bundle8);
                startActivity(intent8);
            }
        });

        LinearLayout linearLayout9 = rootView.findViewById(R.id.linearLayout9);
        //  Set a click listener on this layout
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle9 = new Bundle();
                // Populate Bundle
                bundle9.putInt("photo", R.drawable.wangnan);
                bundle9.putString("name", getString(R.string.wangNan));
                bundle9.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle9.putString("number", getString(R.string.fiveStarRating));
                bundle9.putString("occupation", getString(R.string.wangNanOccupation));
                bundle9.putString("masterwork", getString(R.string.wangNanAwards));
                bundle9.putString("awards", "");
                bundle9.putString("chatPrice", getString(R.string.wangNanChatPrice));
                bundle9.putString("videoPrice", getString(R.string.wangNanVideoPrice));
                // Attach bundle to intent
                intent9.putExtras(bundle9);
                startActivity(intent9);
            }
        });

        LinearLayout linearLayout10 = rootView.findViewById(R.id.linearLayout10);
        //  Set a click listener on this layout
        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle10 = new Bundle();
                // Populate Bundle
                bundle10.putInt("photo", R.drawable.zhangguowei);
                bundle10.putString("name", getString(R.string.zhangGuoWei));
                bundle10.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle10.putString("number", getString(R.string.fiveStarRating));
                bundle10.putString("occupation", getString(R.string.zhangGuoWeiOccupation));
                bundle10.putString("masterwork", getString(R.string.zhangGuoWeiAwards));
                bundle10.putString("awards", "");
                bundle10.putString("chatPrice", getString(R.string.chenHeChatPrice));
                bundle10.putString("videoPrice", getString(R.string.chenHeVideoPrice));
                // Attach bundle to intent
                intent10.putExtras(bundle10);
                startActivity(intent10);
            }
        });

        LinearLayout linearLayout11 = rootView.findViewById(R.id.linearLayout11);
        //  Set a click listener on this layout
        linearLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle11 = new Bundle();
                // Populate Bundle
                bundle11.putInt("photo", R.drawable.emiwong);
                bundle11.putString("name", getString(R.string.emiWong));
                bundle11.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle11.putString("number", getString(R.string.fiveStarRating));
                bundle11.putString("occupation", getString(R.string.emiWongOccupation));
                bundle11.putString("masterwork", getString(R.string.emiWongMasterwork));
                bundle11.putString("awards", "");
                bundle11.putString("chatPrice", getString(R.string.emiWongChatPrice));
                bundle11.putString("videoPrice", getString(R.string.emiWongVideoPrice));
                // Attach bundle to intent
                intent11.putExtras(bundle11);
                startActivity(intent11);
            }
        });

        LinearLayout linearLayout12 = rootView.findViewById(R.id.linearLayout12);
        //  Set a click listener on this layout
        linearLayout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle12 = new Bundle();
                // Populate Bundle
                bundle12.putInt("photo", R.drawable.nanachan);
                bundle12.putString("name", getString(R.string.nanaChan));
                bundle12.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle12.putString("number", getString(R.string.fourStarRating));
                bundle12.putString("occupation", getString(R.string.kol));
                bundle12.putString("masterwork", getString(R.string.nanaChanMasterwork));
                bundle12.putString("chatPrice", getString(R.string.nanaChanChatPrice));
                bundle12.putString("videoPrice", getString(R.string.nanaChanVideoPrice));
                // Attach bundle to intent
                intent12.putExtras(bundle12);
                startActivity(intent12);
            }
        });

        LinearLayout linearLayout13 = rootView.findViewById(R.id.linearLayout13);
        //  Set a click listener on this layout
        linearLayout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle13 = new Bundle();
                // Populate Bundle
                bundle13.putInt("photo", R.drawable.kwok);
                bundle13.putString("name", getString(R.string.kwok));
                bundle13.putInt("ratingPhoto", R.drawable.threestarrating);
                bundle13.putString("number", getString(R.string.threeStarRating));
                bundle13.putString("occupation", getString(R.string.kol));
                bundle13.putString("masterwork", getString(R.string.kwokMasterwork));
                bundle13.putString("awards", getString(R.string.kwokAwards));
                bundle13.putString("chatPrice", getString(R.string.kwokChatPrice));
                bundle13.putString("videoPrice", getString(R.string.kwokVideoPrice));
                // Attach bundle to intent
                intent13.putExtras(bundle13);
                startActivity(intent13);
            }
        });

        LinearLayout linearLayout14 = rootView.findViewById(R.id.linearLayout14);
        //  Set a click listener on this layout
        linearLayout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle14 = new Bundle();
                // Populate Bundle
                bundle14.putInt("photo", R.drawable.chau);
                bundle14.putString("name", getString(R.string.chau));
                bundle14.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle14.putString("number", getString(R.string.fourStarRating));
                bundle14.putString("occupation", getString(R.string.chauOccupation));
                bundle14.putString("masterwork", getString(R.string.chauMasterwork));
                bundle14.putString("chatPrice", getString(R.string.chauChatPrice));
                bundle14.putString("videoPrice", getString(R.string.chauVideoPrice));
                // Attach bundle to intent
                intent14.putExtras(bundle14);
                startActivity(intent14);
            }
        });

        LinearLayout linearLayout15 = rootView.findViewById(R.id.linearLayout15);
        //  Set a click listener on this layout
        linearLayout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle15 = new Bundle();
                // Populate Bundle
                bundle15.putInt("photo", R.drawable.ng);
                bundle15.putString("name", getString(R.string.ng));
                bundle15.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle15.putString("number", getString(R.string.fourStarRating));
                bundle15.putString("occupation", getString(R.string.kol));
                bundle15.putString("masterwork", getString(R.string.ngMasterwork));
                bundle15.putString("awards", getString(R.string.ngAwards));
                bundle15.putString("chatPrice", getString(R.string.ngChatPrice));
                bundle15.putString("videoPrice", getString(R.string.ngVideoPrice));
                // Attach bundle to intent
                intent15.putExtras(bundle15);
                startActivity(intent15);
            }
        });

        LinearLayout linearLayout16 = rootView.findViewById(R.id.linearLayout16);
        //  Set a click listener on this layout
        linearLayout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle16 = new Bundle();
                // Populate Bundle
                bundle16.putInt("photo", R.drawable.jindachuan);
                bundle16.putString("name", getString(R.string.jinDaChuan));
                bundle16.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle16.putString("number", getString(R.string.fiveStarRating));
                bundle16.putString("occupation", getString(R.string.model));
                bundle16.putString("masterwork", getString(R.string.jinDaChuanAwards));
                bundle16.putString("awards", "");
                bundle16.putString("chatPrice", getString(R.string.jinDaChuanChatPrice));
                bundle16.putString("videoPrice", getString(R.string.jinDaChuanVideoPrice));
                // Attach bundle to intent
                intent16.putExtras(bundle16);
                startActivity(intent16);
            }
        });

        LinearLayout linearLayout17 = rootView.findViewById(R.id.linearLayout17);
        //  Set a click listener n this layout
        linearLayout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle17 = new Bundle();
                // Populate Bundle
                bundle17.putInt("photo", R.drawable.zhouweitong);
                bundle17.putString("name", getString(R.string.zhouWeiTong));
                bundle17.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle17.putString("number", getString(R.string.fourStarRating));
                bundle17.putString("occupation", getString(R.string.zhouWeiTongOccupation));
                bundle17.putString("masterwork", getString(R.string.zhouWeiTongMasterwork));
                bundle17.putString("awards", getString(R.string.zhouWeiTongAwards));
                bundle17.putString("chatPrice", getString(R.string.zhouWeiTongChatPrice));
                bundle17.putString("videoPrice", getString(R.string.zhouWeiTongVideoPrice));
                // Attach bundle to intent
                intent17.putExtras(bundle17);
                startActivity(intent17);
            }
        });

        LinearLayout linearLayout18 = rootView.findViewById(R.id.linearLayout18);
        //  Set a click listener on this layout
        linearLayout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle18 = new Bundle();
                // Populate Bundle
                bundle18.putInt("photo", R.drawable.zhaocandice);
                bundle18.putString("name", getString(R.string.candiceZhou));
                bundle18.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle18.putString("number", getString(R.string.fiveStarRating));
                bundle18.putString("occupation", getString(R.string.candiceZhouOccupation));
                bundle18.putString("masterwork", getString(R.string.candiceZhouAwards));
                bundle18.putString("chatPrice", getString(R.string.candiceZhouChatPrice));
                bundle18.putString("videoPrice", getString(R.string.candiceZhouVideoPrice));
                // Attach bundle to intent
                intent18.putExtras(bundle18);
                startActivity(intent18);
            }
        });

        LinearLayout linearLayout19 = rootView.findViewById(R.id.linearLayout19);
        //  Set a click listener on this layout
        linearLayout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle19 = new Bundle();
                // Populate Bundle
                bundle19.putInt("photo", R.drawable.jackwong);
                bundle19.putString("name", getString(R.string.jackWong));
                bundle19.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle19.putString("number", getString(R.string.fiveStarRating));
                bundle19.putString("occupation", getString(R.string.model));
                bundle19.putString("masterwork", getString(R.string.jackWongAwards));
                bundle19.putString("awards", "");
                bundle19.putString("chatPrice", getString(R.string.jackWongChatPrice));
                bundle19.putString("videoPrice", getString(R.string.jackWongVideoPrice));
                // Attach bundle to intent
                intent19.putExtras(bundle19);
                startActivity(intent19);
            }
        });

        LinearLayout linearLayout20 = rootView.findViewById(R.id.linearLayout20);
        //  Set a click listener on this layout
        linearLayout20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle20 = new Bundle();
                // Populate Bundle
                bundle20.putInt("photo", R.drawable.louwaiman);
                bundle20.putString("name", getString(R.string.louWaiMan));
                bundle20.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle20.putString("number", getString(R.string.fourStarRating));
                bundle20.putString("occupation", getString(R.string.model));
                bundle20.putString("masterwork", getString(R.string.louWaiManMasterwork));
                bundle20.putString("chatPrice", getString(R.string.louWaiManChatPrice));
                bundle20.putString("videoPrice", getString(R.string.louWaiManVideoPrice));
                // Attach bundle to intent
                intent20.putExtras(bundle20);
                startActivity(intent20);
            }
        });

        LinearLayout linearLayout21 = rootView.findViewById(R.id.linearLayout21);
        //  Set a click listener on this layout
        linearLayout21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle21 = new Bundle();
                // Populate Bundle
                bundle21.putInt("photo", R.drawable.zhangbichen);
                bundle21.putString("name", getString(R.string.zhangBiChen));
                bundle21.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle21.putString("number", getString(R.string.fiveStarRating));
                bundle21.putString("occupation", getString(R.string.zhangBiChenOccupation));
                bundle21.putString("masterwork", getString(R.string.zhangBiChenMasterwork));
                bundle21.putString("awards", getString(R.string.zhangBiChenAwards));
                bundle21.putString("chatPrice", getString(R.string.zhangBiChenChatPrice));
                bundle21.putString("videoPrice", getString(R.string.zhangBiChenVideoPrice));
                // Attach bundle to intent
                intent21.putExtras(bundle21);
                startActivity(intent21);
            }
        });

        LinearLayout linearLayout22 = rootView.findViewById(R.id.linearLayout22);
        //  Set a click listener on this layout
        linearLayout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle22 = new Bundle();
                // Populate Bundle
                bundle22.putInt("photo", R.drawable.lijian);
                bundle22.putString("name", getString(R.string.liJian));
                bundle22.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle22.putString("number", getString(R.string.fourStarRating));
                bundle22.putString("occupation", getString(R.string.singer));
                bundle22.putString("masterwork", getString(R.string.liJianMasterwork));
                bundle22.putString("awards", getString(R.string.liJianAwards));
                bundle22.putString("chatPrice", getString(R.string.liJianChatPrice));
                bundle22.putString("videoPrice", getString(R.string.liJianVideoPrice));
                // Attach bundle to intent
                intent22.putExtras(bundle22);
                startActivity(intent22);
            }
        });


        LinearLayout linearLayout23 = rootView.findViewById(R.id.linearLayout23);
        //  Set a click listener on this layout
        linearLayout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle23 = new Bundle();
                // Populate Bundle
                bundle23.putInt("photo", R.drawable.leoli);
                bundle23.putString("name", getString(R.string.leoLi));
                bundle23.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle23.putString("number", getString(R.string.fiveStarRating));
                bundle23.putString("occupation", getString(R.string.leoLiOccupation));
                bundle23.putString("masterwork", getString(R.string.leoLiMasterwork));
                bundle23.putString("chatPrice", getString(R.string.leoLiChatPrice));
                bundle23.putString("videoPrice", getString(R.string.leoLiVideoPrice));
                // Attach bundle to intent
                intent23.putExtras(bundle23);
                startActivity(intent23);
            }
        });
        LinearLayout linearLayout24 = rootView.findViewById(R.id.linearLayout24);
        //  Set a click listener on this layout
        linearLayout24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent24 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle24 = new Bundle();
                // Populate Bundle
                bundle24.putInt("photo", R.drawable.ip);
                bundle24.putString("name", getString(R.string.ip));
                bundle24.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle24.putString("number", getString(R.string.fourStarRating));
                bundle24.putString("occupation", getString(R.string.singer));
                bundle24.putString("masterwork", getString(R.string.ipMasterwork));
                bundle24.putString("chatPrice", getString(R.string.ipChatPrice));
                bundle24.putString("videoPrice", getString(R.string.ipVideoPrice));
                // Attach bundle to intent
                intent24.putExtras(bundle24);
                startActivity(intent24);
            }
        });
        LinearLayout linearLayout25 = rootView.findViewById(R.id.linearLayout25);
        //  Set a click listener on this layout
        linearLayout25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent25 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle25 = new Bundle();
                // Populate Bundle
                bundle25.putInt("photo", R.drawable.laujyuning);
                bundle25.putString("name", getString(R.string.laujyuning));
                bundle25.putInt("ratingPhoto", R.drawable.threestarrating);
                bundle25.putString("number", getString(R.string.threeStarRating));
                bundle25.putString("occupation", getString(R.string.laujyuningOccupation));
                bundle25.putString("masterwork", getString(R.string.laujyuningMasterwork));
                bundle25.putString("awards", getString(R.string.laujyuningAwards));
                bundle25.putString("chatPrice", getString(R.string.laujyuningChatPrice));
                bundle25.putString("videoPrice", getString(R.string.laujyuningVideoPrice));
                // Attach bundle to intent
                intent25.putExtras(bundle25);
                startActivity(intent25);
            }
        });
        LinearLayout linearLayout26 = rootView.findViewById(R.id.linearLayout26);
        //  Set a click listener on this layout
        linearLayout26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent26 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle26 = new Bundle();
                // Populate Bundle
                bundle26.putInt("photo", R.drawable.chenhe);
                bundle26.putString("name", getString(R.string.chenHe));
                bundle26.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle26.putString("number", getString(R.string.fiveStarRating));
                bundle26.putString("occupation", getString(R.string.chenHeOccupation));
                bundle26.putString("masterwork", getString(R.string.chenHeMasterwork));
                bundle26.putString("awards", getString(R.string.chenHeAwards));
                bundle26.putString("chatPrice", getString(R.string.chenHeChatPrice));
                bundle26.putString("videoPrice", getString(R.string.chenHeVideoPrice));
                // Attach bundle to intent
                intent26.putExtras(bundle26);
                startActivity(intent26);
            }
        });
        LinearLayout linearLayout27 = rootView.findViewById(R.id.linearLayout27);
        //  Set a click listener on this layout
        linearLayout27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent27 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle27 = new Bundle();
                // Populate Bundle
                bundle27.putInt("photo", R.drawable.jialing);
                bundle27.putString("name", getString(R.string.jiaLing));
                bundle27.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle27.putString("number", getString(R.string.fourStarRating));
                bundle27.putString("occupation", getString(R.string.jiaLingOccupation));
                bundle27.putString("masterwork", getString(R.string.jiaLingMasterwork));
                bundle27.putString("awards", getString(R.string.jiaLingAwards));
                bundle27.putString("chatPrice", getString(R.string.jiaLingChatPrice));
                bundle27.putString("videoPrice", getString(R.string.jiaLingVideoPrice));
                // Attach bundle to intent
                intent27.putExtras(bundle27);
                startActivity(intent27);
            }
        });
        LinearLayout linearLayout28 = rootView.findViewById(R.id.linearLayout28);
        //  Set a click listener on this layout
        linearLayout28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent28 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle28 = new Bundle();
                // Populate Bundle
                bundle28.putInt("photo", R.drawable.bao);
                bundle28.putString("name", getString(R.string.baoBeiEr));
                bundle28.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle28.putString("number", getString(R.string.fiveStarRating));
                bundle28.putString("occupation", getString(R.string.baoBeiErOccupation));
                bundle28.putString("masterwork", getString(R.string.baoBeiMasterwork));
                bundle28.putString("awards", getString(R.string.baoBeiAwards));
                bundle28.putString("chatPrice", getString(R.string.baoBeiErChatPrice));
                bundle28.putString("videoPrice", getString(R.string.baoBeiErVideoPrice));
                // Attach bundle to intent
                intent28.putExtras(bundle28);
                startActivity(intent28);
            }
        });
        LinearLayout linearLayout29 = rootView.findViewById(R.id.linearLayout29);
        //  Set a click listener on this layout
        linearLayout29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent29 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle29 = new Bundle();
                // Populate Bundle
                bundle29.putInt("photo", R.drawable.huangshenyi);
                bundle29.putString("name", getString(R.string.huangShenYi));
                bundle29.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle29.putString("number", getString(R.string.fourStarRating));
                bundle29.putString("occupation", getString(R.string.huangShenYiOccupation));
                bundle29.putString("masterwork", getString(R.string.huangShenYiMasterwork));
                bundle29.putString("awards", getString(R.string.huangShenYiAwards));
                bundle29.putString("chatPrice", getString(R.string.huangShenYiChatPrice));
                bundle29.putString("videoPrice", getString(R.string.huangShenYiVideoPrice));
                // Attach bundle to intent
                intent29.putExtras(bundle29);
                startActivity(intent29);
            }
        });
        LinearLayout linearLayout30 = rootView.findViewById(R.id.linearLayout30);
        //  Set a click listener on this layout
        linearLayout30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent30 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle30 = new Bundle();
                // Populate Bundle
                bundle30.putInt("photo", R.drawable.duchun);
                bundle30.putString("name", getString(R.string.duChun));
                bundle30.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle30.putString("number", getString(R.string.fourStarRating));
                bundle30.putString("occupation", getString(R.string.singer));
                bundle30.putString("masterwork", getString(R.string.duChunMasterwork));
                bundle30.putString("awards", getString(R.string.duChunAwards));
                bundle30.putString("chatPrice", getString(R.string.duChunChatPrice));
                bundle30.putString("videoPrice", getString(R.string.duChunVideoPrice));
                // Attach bundle to intent
                intent30.putExtras(bundle30);
                startActivity(intent30);
            }
        });

        LinearLayout linearLayout31 = rootView.findViewById(R.id.linearLayout31);
        //  Set a click listener on this layout
        linearLayout31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent31 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle31 = new Bundle();
                // Populate Bundle
                bundle31.putInt("photo", R.drawable.mak);
                bundle31.putString("name", getString(R.string.makCheungChing));
                bundle31.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle31.putString("number", getString(R.string.fiveStarRating));
                bundle31.putString("occupation", getString(R.string.actor));
                bundle31.putString("masterwork", getString(R.string.makCheungChingMasterwork));
                bundle31.putString("awards", getString(R.string.makCheungChingAwards));
                bundle31.putString("chatPrice", getString(R.string.makCheungChingChatPrice));
                bundle31.putString("videoPrice", getString(R.string.makCheungChingVideoPrice));
                // Attach bundle to intent
                intent31.putExtras(bundle31);
                startActivity(intent31);
            }
        });

        LinearLayout linearLayout32 = rootView.findViewById(R.id.linearLayout36);
        //  Set a click listener on this layout
        linearLayout32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent32 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle32 = new Bundle();
                // Populate Bundle
                bundle32.putInt("photo", R.drawable.zhangjingchu);
                bundle32.putString("name", getString(R.string.zhangJingChu));
                bundle32.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle32.putString("number", getString(R.string.fiveStarRating));
                bundle32.putString("occupation", getString(R.string.actor));
                bundle32.putString("masterwork", getString(R.string.zhangJingChuMasterwork));
                bundle32.putString("awards", getString(R.string.zhangJingChuAwards));
                bundle32.putString("chatPrice", getString(R.string.zhangJingChuChatPrice));
                bundle32.putString("videoPrice", getString(R.string.zhangJingChuVideoPrice));
                // Attach bundle to intent
                intent32.putExtras(bundle32);
                startActivity(intent32);
            }
        });

        LinearLayout linearLayout33 = rootView.findViewById(R.id.linearLayout33);
        //  Set a click listener on this layout
        linearLayout33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent33 = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle33 = new Bundle();
                // Populate Bundle
                bundle33.putInt("photo", R.drawable.zhangtianai);
                bundle33.putString("name", getString(R.string.zhangTianAi));
                bundle33.putString("occupation", getString(R.string.actor));
                bundle33.putInt("ratingPhoto", R.drawable.fourstarrating);
                bundle33.putString("number", getString(R.string.fourStarRating));
                bundle33.putString("masterwork", getString(R.string.zhangTianAiMasterwork));
                bundle33.putString("awards", getString(R.string.zhangTianAiAwards));
                bundle33.putString("chatPrice", getString(R.string.zhangTianAiChatPrice));
                bundle33.putString("videoPrice", getString(R.string.zhangTianAiVideoPrice));
                // Attach bundle to intent
                intent33.putExtras(bundle33);
                startActivity(intent33);
            }
        });
        return rootView;
    }
}