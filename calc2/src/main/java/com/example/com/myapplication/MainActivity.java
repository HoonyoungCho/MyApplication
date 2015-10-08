package com.example.com.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText edit1, edit2;
    TextView textresult;
    String num1, num2;
    Float result;
    Integer i;
    Button btnAdd, btnSub, btnMul, btnDiv;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = { R.id.Btn0 , R.id.Btn1, R.id.Btn2, R.id.Btn3, R.id.Btn4,
            R.id.Btn5, R.id.Btn6, R.id.Btn7, R.id.Btn8, R.id.Btn9};



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블레이아웃계산기");
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        textresult = (TextView) findViewById(R.id.Result);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);

        for(i=0; i< numBtnIDs.length;i++){
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }
        for(i=0;i<numBtnIDs.length;i++) {
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edit1.isFocused() == true) {
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    } else if (edit2.isFocused() == true) {
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(),"먼저 에디트텍스트를 선택하세요",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() || (num1.isEmpty() && num2.isEmpty())) {
                    Toast.makeText(getApplicationContext(), "값이 없습니다", Toast.LENGTH_LONG).show();


                } else {

                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textresult.setText("계산 결과: " + result.toString());

                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() || (num1.isEmpty() && num2.isEmpty())) {
                    Toast.makeText(getApplicationContext(), "값이 없습니다", Toast.LENGTH_LONG).show();


                } else {

                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textresult.setText("계산 결과: " + result.toString());

                }

            }


        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() || (num1.isEmpty() && num2.isEmpty())) {
                    Toast.makeText(getApplicationContext(), "값이 없습니다", Toast.LENGTH_LONG).show();


                } else if (Float.parseFloat(num1) == 0 || Float.parseFloat(num2) == 0) {
                    Toast.makeText(getApplicationContext(), "오류입니다", Toast.LENGTH_LONG).show();
                } else {

                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textresult.setText("계산 결과: " + result.toString());

                }

            }


        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() || (num1.isEmpty() && num2.isEmpty())) {
                    Toast.makeText(getApplicationContext(), "값이 없습니다", Toast.LENGTH_LONG).show();
                } else if (Float.parseFloat(num1) == 0 || Float.parseFloat(num2) == 0) {
                    Toast.makeText(getApplicationContext(), "오류입니다", Toast.LENGTH_LONG).show();
                } else {

                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textresult.setText("계산 결과: " + result.toString());

                }

            }


        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() || (num1.isEmpty() && num2.isEmpty())) {
                    Toast.makeText(getApplicationContext(), "값이 없습니다", Toast.LENGTH_LONG).show();


                } else if (Float.parseFloat(num1) == 0 || Float.parseFloat(num2) == 0) {
                    Toast.makeText(getApplicationContext(), "오류입니다", Toast.LENGTH_LONG).show();
                } else {

                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textresult.setText("계산 결과: " + result.toString());

                }

            }


        });


    }
}