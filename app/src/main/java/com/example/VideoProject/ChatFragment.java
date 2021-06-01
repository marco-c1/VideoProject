package com.example.VideoProject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ChatFragment extends Fragment {

    public static final String CHAT = "聊天";

    public ChatFragment(){
        //  Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.chat_fragment, container, false);
        return rootView;
    }
}
