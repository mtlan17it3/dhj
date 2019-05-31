package com.example.my2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.my2.R;
import com.example.my2.doituong.Hinhanh;

import java.util.List;

public class HinhAnhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Hinhanh> HinhAnhList;

    public HinhAnhAdapter(Context context, int layout, List<Hinhanh> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        HinhAnhList = hinhAnhList;
    }

    @Override
    public int getCount() {
        return HinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgHinh = (ImageView)convertView.findViewById(R.id.imageviewHinhAnh);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        Hinhanh hinhanh = HinhAnhList.get(position);
        holder.imgHinh.setImageResource(hinhanh.getHinh());
        return convertView;


    }

}