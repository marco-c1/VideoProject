package com.example.VideoProject;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[]{HomeFragment.HOME, SearchFragment.SEARCH, ChatFragment.CHAT, MeFragment.ME};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new SearchFragment();
        } else if (position == 2) {
            return new ChatFragment();
        } else
            return new MeFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //  Generate title based on item position
        return tabTitles[position];
    }
}