package com.example.lab11shared;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class other extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        TextView t1,t2,t3;
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);

        SharedPreferences sp=getApplicationContext().getSharedPreferences("User info", Context.MODE_PRIVATE);
        String nam= sp.getString("name","");
        String mai= sp.getString("mail","");
        String cont= sp.getString("contact","");

        t1.setText(nam);
        t2.setText(mai);
        t3.setText(cont);
    }
}
