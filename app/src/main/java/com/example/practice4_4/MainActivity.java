package com.example.practice4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch SwtAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    Button btnExit, btnReset;
    ImageView imgAnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        SwtAgree = (Switch) findViewById(R.id.SwtAgree);
        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        rdoR = (RadioButton) findViewById(R.id.RdoR);
        rdoS = (RadioButton) findViewById(R.id.RdoS);
        btnExit = (Button) findViewById(R.id.BtnExit);
        btnReset = (Button) findViewById(R.id.BtnReset);
        imgAnd = (ImageView) findViewById(R.id.ImgAnd);

        SwtAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SwtAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                    imgAnd.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                    imgAnd.setVisibility(View.INVISIBLE);
                }
            }
        });

        rdoQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.android10);
            }
        });

        rdoR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.android11);
            }
        });

        rdoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.android12);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdoQ.setChecked(false);
                rdoR.setChecked(false);
                rdoS.setChecked(false);
                imgAnd.setImageResource(0);
                SwtAgree.toggle();
            }
        });

    }
}