package com.ittrend.news;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class EntertainmentFragment extends Fragment {
    static final String[] news =
            new String[] { "news1", "news2", "news3", "news4"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view =inflater.inflate(R.layout.fragment_entertainment, container, false);
       ListView list = view.findViewById(R.id.listview);
       NewsAdpter adapter = new NewsAdpter(getActivity(),news);
       list.setAdapter(adapter);
        return view;
    }


}
