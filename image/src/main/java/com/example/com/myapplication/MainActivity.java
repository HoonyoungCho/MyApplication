package com.example.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch swit;
    RadioGroup rGroup;
    RadioButton jellybean, kitkat, lollipop;
    Button btnExit, btnInitial;
    ImageView ImgSys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");
        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        rGroup = (RadioGroup) findViewById(R.id.Rgroup);
        jellybean = (RadioButton) findViewById(R.id.jellybean);
        kitkat = (RadioButton) findViewById(R.id.kitkat);
        lollipop = (RadioButton) findViewById(R.id.lollipop);
        swit = (Switch) findViewById(R.id.Swit);
        ImgSys = (ImageView) findViewById(R.id.ImgSys);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnInitial = (Button) findViewById(R.id.btnInitial);

        swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (swit.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnInitial.setVisibility(View.VISIBLE);
                    ImgSys.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(View.INVISIBLE);
                    btnInitial.setVisibility(View.INVISIBLE);
                    ImgSys.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (rGroup.getCheckedRadioButtonId()) {
                    case R.id.jellybean:
                        ImgSys.setImageResource(R.drawable.jellybean);
                        break;
                    case R.id.kitkat:
                        ImgSys.setImageResource(R.drawable.kitkat);
                        break;
                    case R.id.lollipop:
                        ImgSys.setImageResource(R.drawable.lollipop);
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnInitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swit.setChecked(false);
                text2.setVisibility(View.INVISIBLE);
                rGroup.setVisibility(View.INVISIBLE);
                btnExit.setVisibility(View.INVISIBLE);
                btnInitial.setVisibility(View.INVISIBLE);
                ImgSys.setVisibility(View.INVISIBLE);
            }
        });


    }


    }

