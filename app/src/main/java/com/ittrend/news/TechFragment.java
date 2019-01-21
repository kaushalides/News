package com.ittrend.news;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class TechFragment extends Fragment {
    static final String[] news =
            new String[] { "tech_news1", "tech_news2", "tech_news3", "tech_news4"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tech, container, false);
        ListView list = view.findViewById(R.id.listview);
        NewsAdpter adapter = new NewsAdpter(getActivity(),news);
        list.setAdapter(adapter);
        return view;
    }

}
