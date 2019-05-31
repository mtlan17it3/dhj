package com.example.my2;


import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my2.Adapter.ShopAdapter;
import com.example.my2.doituong.DataCollect;
import com.example.my2.doituong.DataShop;
import com.example.my2.Adapter.CollectAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG ="MainActivity" ;
    DatabaseReference mData;
    Context context;
    ListView lvfood;
    ImageView img2,img3,img4,icon;
    TextView txt;
    ArrayList<DataCollect> dataCollects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.textView4);
        mData = FirebaseDatabase.getInstance().getReference();
        mData.child("change").setValue("Bộ sưu tập nổi bật");
        mData.child("change").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                txt.setText(dataSnapshot.getValue().toString()); // ep data len app
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        //DataCollect dataCollect =new DataCollect("ba",R.drawable.misoibingoi,"Mỳ sợi bí ngòi sốt tôm","1000 xem");


        //mData.child("Cook").push().setValue(dataCollect);

//        mData.child("Cook").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               lvfood.setVisibility(View.VISIBLE);
//               for (DataSnapshot dsp : dataSnapshot.getChildren()) {
//                    dataCollects.add(dsp.getValue(DataCollect.class));
//               }
//               System.out.println(dataCollects.get(0).getId());
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });



        img2 = (ImageView)findViewById(R.id.BST);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Gridview.class);
                startActivity(intent);
            }
        });
        img3 = (ImageView)findViewById(R.id.bv);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "late updated", Toast.LENGTH_SHORT).show();
            }
        });
        img4 = (ImageView)findViewById(R.id.dt);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "late updated", Toast.LENGTH_SHORT).show();
            }
        });
        lvfood = (ListView)findViewById(R.id.listview);
        dataCollects = new ArrayList<DataCollect>();
        dataCollects.add(new DataCollect("mot",R.drawable.catrungtambot,"Cá trứng tẩm bột chiên giòn rụm","2000000 xem"));
        dataCollects.add(new DataCollect("hai",R.drawable.misoibingoi,"Mỳ sợi bí ngòi sốt tôm","300000 xem"));
        dataCollects.add(new DataCollect("tu",R.drawable.chacasotcay,"Chả cá sốt cay Hàn Quốc","5000 xem"));
        dataCollects.add(new DataCollect("nam",R.drawable.rau_cau_dua,"Rau câu dừa béo","6000 xem"));
        dataCollects.add(new DataCollect("ba",R.drawable.gabocladua,"Gà bọc lá dứa chiên","400000 xem"));
        CollectAdapter collectAdapter = new CollectAdapter(dataCollects,MainActivity.this,R.layout.item_row);
        lvfood.setAdapter(collectAdapter);
        lvfood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(view.getContext(),Main3Activity.class);
                    startActivity(intent);
                }
                if(position == 1) {
                    Intent intent = new Intent(view.getContext(),Main5Activity.class);
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(view.getContext(),Main4Activity.class);
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(view.getContext(),Main2Activity.class);
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(view.getContext(),Main3Activity.class);
                    startActivity(intent);
                }

            }
        });
        icon = (ImageView)findViewById(R.id.video);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,video.class);
                startActivity(intent);
            }
        });

//        initView();
//        initView1();

    }
//    public void initView() {
//        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//        //Tối ưu hóa dữ liệu,không bị ảnh hưởng nội dung của  adapter
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);
////        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),DividerItemDecoration.HORIZONTAL);
////        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.custom_divider);
////        dividerItemDecoration.setDrawable(drawable);
////        recyclerView.addItemDecoration(dividerItemDecoration);
////
////        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
////        recyclerView.addItemDecoration(dividerItemDecoration);
//        final ArrayList<DataShop> arrayList = new ArrayList<>();
//        arrayList.add(new DataShop("mot",R.drawable.catrungtambot,"Cá trứng tẩm bột chiên giòn rụm","2000000 xem"));
//        arrayList.add(new DataShop("hai",R.drawable.misoibingoi,"Mỳ sợi bí ngòi sốt tôm","300000 xem"));
//        arrayList.add(new DataShop("tu",R.drawable.chacasotcay,"Chả cá sốt cay Hàn Quốc","5000 xem"));
//        arrayList.add(new DataShop("nam",R.drawable.rau_cau_dua,"Rau câu dừa béo","6000 xem"));
//        arrayList.add(new DataShop("ba",R.drawable.gabocladua,"Gà bọc lá dứa chiên","400000 xem"));
//        ShopAdapter shopAdapter = new ShopAdapter(arrayList,getApplicationContext());
//        recyclerView.setAdapter(shopAdapter);
//        recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int i=0;
//                if (i == 0) {
//                    Intent intent = new Intent(v.getContext(),Main2Activity.class);
//                    context.startActivity(intent);
//
//                }
//            }
//        });
//
//
////        shopAdapter.setOnClickItemListener(new ShopAdapter.OnItemClickListener() {
////            @Override
////            public void onItemClick(int position) {
////               Intent intent = new Intent(MainActivity.this,SomeActivity.class);
////               intent.putExtra("Example Item",arrayList.get(position));
////               startActivity(intent);
////            }
////        });
//
//    }
//    public void  initView1() {
//        RecyclerView recyclerView1 = (RecyclerView)findViewById(R.id.recycler_view1);
//        //Tối ưu hóa dữ liệu,không bị ảnh hưởng nội dung của  adapter
//        recyclerView1.setHasFixedSize(true);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView1.setLayoutManager(layoutManager);
//        ArrayList<DataCollect> arrayList = new ArrayList<>();
//        arrayList.add(new DataCollect("mot",R.drawable.catrungtambot,"Cá trứng tẩm bột chiên giòn rụm","2000000 xem"));
//        arrayList.add(new DataCollect("hai",R.drawable.misoibingoi,"Mỳ sợi bí ngòi sốt tôm","300000 xem"));
//        arrayList.add(new DataCollect("tu",R.drawable.chacasotcay,"Chả cá sốt cay Hàn Quốc","5000 xem"));
//        arrayList.add(new DataCollect("nam",R.drawable.rau_cau_dua,"Rau câu dừa béo","6000 xem"));
//        arrayList.add(new DataCollect("ba",R.drawable.gabocladua,"Gà bọc lá dứa chiên","400000 xem"));
//        CollectAdapter collectAdapter = new CollectAdapter(arrayList,getApplicationContext());
//        recyclerView1.setAdapter(collectAdapter);
//
//    }


}
