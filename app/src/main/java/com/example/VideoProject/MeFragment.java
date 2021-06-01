package com.example.VideoProject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class MeFragment extends Fragment {

    public static final String ME = "我";

    public MeFragment(){
        //  Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.me_fragment, container, false);
        super.onCreate(savedInstanceState);
        ImageView imageView = rootView.findViewById(R.id.imageView);
        int imageView1 = R.drawable.horse;
        Glide.with(this).load(imageView1).into(imageView);
        ImageView imageView2 = rootView.findViewById(R.id.imageView2);
        int imageView_2 = R.drawable.edit;
        Glide.with(this).load(imageView_2).into(imageView2);
        ImageView imageView5 = rootView.findViewById(R.id.imageView5);
        int imageView_5 = R.drawable.settings;
        Glide.with(this).load(imageView_5).into(imageView5);
        ImageView imageView7 = rootView.findViewById(R.id.imageView7);
        int imageView_7 = R.drawable.shopping;
        Glide.with(this).load(imageView_7).into(imageView7);
        return rootView;
    }
}