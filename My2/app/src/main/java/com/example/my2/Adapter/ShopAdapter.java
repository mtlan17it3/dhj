package com.example.my2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my2.Main2Activity;
import com.example.my2.Main3Activity;
import com.example.my2.MainActivity;
import com.example.my2.SomeActivity;
import com.example.my2.doituong.DataShop;
import com.example.my2.R;

import java.util.ArrayList;



public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {

    ArrayList<DataShop> dataShops;
    Context context;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnClickItemListener(OnItemClickListener listener){
        mListener = listener;
    }


    public ShopAdapter(ArrayList<DataShop> dataShops, Context context) {
        this.dataShops = dataShops;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new ViewHolder(itemView,mListener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.txtName1.setText(dataShops.get(position).getTen());
        holder.txtName2.setText(dataShops.get(position).getTieude());
        holder.image.setImageResource((dataShops.get(position).getHinhAnh()));

    }

    @Override
    public int getItemCount() {
        return dataShops.size();
    }
//    public void RemoveItem(int position) {
//        dataShops.remove(position);
//        notifyItemRemoved(position);
//    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {

        TextView txtName1,txtName2;
        ImageView image;
        CardView cardView;
        public ViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            txtName1 = (TextView)itemView.findViewById(R.id.txtName1);

            txtName2 = (TextView)itemView.findViewById(R.id.txtName2);
            image = (ImageView)itemView.findViewById(R.id.imageView);
            cardView = (CardView)itemView.findViewById(R.id.cardview);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if(listener !=null) {
//                        int position = getAdapterPosition();
//                        if (position == 0) {
//                            Intent intent = new Intent(v.getContext(),SomeActivity.class);
//
//                        }
//                    }
//                }
//            });
            //cardView =(CardView)itemView.findViewById(R.id.cardview);





        }


    }


}
