package com.ittrend.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int numberOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numberOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:

                EntertainmentFragment tab1 = new EntertainmentFragment();

                return tab1;

            case 1:

                Gossip tab2 = new Gossip();

                return tab2;

            case 2:

                TechFragment tab3 = new TechFragment();

                return tab3;

            default:

                return null;

        }    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
