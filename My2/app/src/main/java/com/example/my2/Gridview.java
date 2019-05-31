package com.example.my2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.my2.Adapter.HinhAnhAdapter;
import com.example.my2.doituong.Hinhanh;

import java.util.ArrayList;

public class Gridview extends AppCompatActivity {
    GridView gridView;
    //String[] array = {"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"};
    ArrayList<Hinhanh> arrayImage;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter = new HinhAnhAdapter(this,R.layout.list_hinh,arrayImage);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Gridview.this, arrayImage.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
//        gridView = (GridView)findViewById(R.id.girdviewTen);
//
//        ArrayAdapter adapter = new ArrayAdapter(
//                MainActivity.this,android.R.layout.simple_list_item_1,
//                array
//        );
//
//        gridView.setAdapter(adapter);
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "" + array[position] , Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    private void AnhXa() {
        gridView = (GridView)findViewById(R.id.girdviewTen);
        arrayImage = new ArrayList<>();
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.rau_cau_dua));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.catrungtambot));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.catrungtambot));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.chacasotcay));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.misoibingoi));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.rau_cau_dua));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.misoibingoi));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.chacasotcay));
        arrayImage.add(new Hinhanh("hellokitty",R.drawable.catrungtambot));

    }

}