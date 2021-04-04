package com.example.hw1_2_20172127;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    EditText editText;
    RadioGroup Rgroup;
    RadioButton oreoBtn, pieBtn;
    ImageView ImgCookie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        editText = (EditText)findViewById(R.id.editText);
        Rgroup = (RadioGroup) findViewById(R.id.Rgroup);
        oreoBtn = (RadioButton)findViewById(R.id.oreoBtn);
        pieBtn = (RadioButton) findViewById(R.id.pieBtn);
        ImgCookie = (ImageView) findViewById(R.id.ImgCookie);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                Toast.makeText(getApplicationContext(),editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
                startActivity(mIntent);
            }
        });

        oreoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                ImgCookie.setImageResource(R.drawable.oreo);
            }
        });

        pieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                ImgCookie.setImageResource(R.drawable.pie);
            }
        });
    }

}