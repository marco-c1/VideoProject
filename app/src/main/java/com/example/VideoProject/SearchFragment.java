package com.example.VideoProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;

public class SearchFragment extends Fragment {

    public static final String SEARCH = "探索";

    VideoView videoView;

    ImageView imageViewPlayButton;

    TextView textView37;

    public SearchFragment() {
        //  Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.search_fragment, container, false);

        textView37 = rootView.findViewById(R.id.textView37);
        textView37.setVisibility(View.INVISIBLE);

        TextView textView = rootView.findViewById(R.id.textView);
        //  Set a click listener on this layout
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityDetailActivityPopular.class);
                startActivity(intent);
            }
        });

        TextView textView1 = rootView.findViewById(R.id.textView1);
        //  Set a click listener on this layout
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityDetailActivityActor.class);
                startActivity(intent);
            }
        });

        TextView textView2 = rootView.findViewById(R.id.textView2);
        //  Set a click listener on this layout
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityDetailActivitySinger.class);
                startActivity(intent);
            }
        });

        TextView textView3 = rootView.findViewById(R.id.textView3);
        //  Set a click listener on this layout
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityDetailActivityModel.class);
                startActivity(intent);
            }
        });

        TextView textView4 = rootView.findViewById(R.id.textView4);
        //  Set a click listener on this layout
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityDetailActivityKol.class);
                startActivity(intent);
            }
        });

        TextView textView5 = rootView.findViewById(R.id.textView5);
        //  Set a click listener on this layout
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityDetailActivitySport.class);
                startActivity(intent);
            }
        });

        //  Set a click listener on this layout
        textView37.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CelebrityActivity.class);
                // Create Bundle
                Bundle bundle = new Bundle();
                // Populate Bundle
                bundle.putInt("photo", R.drawable.mak);
                bundle.putString("name", getString(R.string.makCheungChing));
                bundle.putInt("ratingPhoto", R.drawable.fivestarrating);
                bundle.putString("number", getString(R.string.fiveStarRating));
                bundle.putString("occupation", getString(R.string.actor));
                bundle.putString("masterwork", getString(R.string.makCheungChingMasterwork));
                bundle.putString("awards", getString(R.string.makCheungChingAwards));
                bundle.putString("chatPrice", getString(R.string.makCheungChingChatPrice));
                bundle.putString("videoPrice", getString(R.string.makCheungChingVideoPrice));
                // Attach bundle to intent
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        videoView = rootView.findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + "com.example.VideoProject" + "/" + R.raw.video);

        imageViewPlayButton = rootView.findViewById(R.id.imageViewPlayButton);
        imageViewPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.start();
                textView37.setVisibility(View.VISIBLE);
                imageViewPlayButton.setVisibility(View.INVISIBLE);
            }
        });
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (videoView.isPlaying()) {
        } else {
            videoView.setVisibility(View.VISIBLE);
            textView37.setVisibility(View.INVISIBLE);
            imageViewPlayButton.setVisibility(View.VISIBLE);
        }
    }
}