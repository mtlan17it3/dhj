package com.example.my2.Adapter;

import android.content.Context;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my2.MainActivity;
import com.example.my2.R;
import com.example.my2.doituong.DataCollect;
import java.util.ArrayList;

public class CollectAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<DataCollect> dataCollects;
    int layout;

    public CollectAdapter(ArrayList<DataCollect> dataCollects,Context context,int layout) {
        this.dataCollects = dataCollects;
        this.context = context;
        this.layout= layout;

    }


    @Override
    public int getCount() {
        return dataCollects.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.item_row,null,true);
        TextView txt = (TextView)convertView.findViewById(R.id.txtName1);
        txt.setText(dataCollects.get(position).getText());
        TextView txt1 = (TextView)convertView.findViewById(R.id.txtName2);
        txt1.setText(dataCollects.get(position).getWatch());
        ImageView img = (ImageView)convertView.findViewById(R.id.imageView);
        img.setImageResource(dataCollects.get(position).getHinh());


        return convertView;
    }
}
