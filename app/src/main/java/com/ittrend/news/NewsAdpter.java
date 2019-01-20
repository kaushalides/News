package com.ittrend.news;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdpter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] resources;

    public NewsAdpter(Activity context, String[] resource) {
        super(context,R.layout.list_item, resource);
        this.context = context;
        this.resources= resource;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_item, parent, false);
        TextView topic = (TextView) rowView.findViewById(R.id.firstLine);
        TextView des = (TextView) rowView.findViewById(R.id.secondLine);
        topic.setText(resources[position]);

        // Change icon based on name
        String s = resources[position];

        System.out.println(s);



        return rowView;
    }
}
