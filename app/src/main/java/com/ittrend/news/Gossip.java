package com.ittrend.news;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class Gossip extends Fragment {

    static final String[] news =
            new String[] { "gossip_news1", "gossip_news2", "gossip_news3", "gossip_news4"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gossip, container, false);

        final ListView list = view.findViewById(R.id.listview);
        NewsAdpter adapter = new NewsAdpter(getActivity(),news);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(list.getItemAtPosition(position)+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        });
        return view;
    }

}
