package com.example.m14x.volleylistview_itunes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.m14x.volleylistview_itunes.Model.Pojo;
import com.example.m14x.volleylistview_itunes.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m14x on 04/14/2016.
 */
public class CustomAdapter extends ArrayAdapter<Pojo> {

    public CustomAdapter(Context context, int resource) {
        super(context, resource);
    }

    public CustomAdapter(Context context, int resource, List<Pojo> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(v == null){
            LayoutInflater layoutInflater;
            layoutInflater = LayoutInflater.from(getContext());
            v = layoutInflater.inflate(R.layout.item,null);
        }
         Pojo item = getItem(position);
        if (item != null) {
            TextView artist = (TextView) v.findViewById(R.id.artistTextView);
            TextView collection = (TextView) v.findViewById(R.id.collectionTextView);
            TextView track = (TextView) v.findViewById(R.id.trackTextView);

            if (artist != null) {
                artist.setText(item.getArtistName());
            }

            if (collection != null) {
                collection.setText(item.getCollectionName());
            }

            if (track != null) {
                track.setText(item.getTrackName());
            }
        }


        return v;
    }
}
