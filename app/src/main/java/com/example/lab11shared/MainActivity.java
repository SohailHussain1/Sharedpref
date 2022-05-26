package com.example.lab11shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,mail,contact;
    Button btn1,btn2;
    SharedPreferences sp;
    String na,em,co;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editTextTextPersonName);
        mail=findViewById(R.id.editTextTextPersonName2);
        contact=findViewById(R.id.editTextTextPersonName3);

        btn1=findViewById(R.id.solo);
        btn2=findViewById(R.id.solo2);

        sp=getSharedPreferences("User info", Context.MODE_PRIVATE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                na=name.getText().toString();
                em=mail.getText().toString();
                co=contact.getText().toString();

                SharedPreferences.Editor editor= sp.edit();
                editor.putString("name",na);
                editor.putString("mail",em);
                editor.putString("contact",co);
                editor.commit();
                Toast.makeText(MainActivity.this, "Data entered", Toast.LENGTH_SHORT).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,other.class);
                startActivity(intent);


            }
        });
    }
}