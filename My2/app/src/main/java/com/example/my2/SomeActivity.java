package com.example.my2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my2.doituong.DataShop;

public class SomeActivity extends AppCompatActivity {
    ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.);
        Intent intent = getIntent();
        DataShop dataShop = intent.getParcelableExtra("Example Item");

        int image = dataShop.getHinhAnh();
        String ten = dataShop.getTen();
        String tieude = dataShop.getTieude();

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(image);
        TextView textView1 = findViewById(R.id.txtName1);
        textView1.setText(ten);
        TextView textView2 = findViewById(R.id.txtName2);
        textView2.setText(tieude);
    }
}
