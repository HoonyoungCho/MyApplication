package com.example.com.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRemainder;
    TextView textResult;
    String num1, num2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRemainder = (Button) findViewById(R.id.btnRemainder);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값이 없습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값이 없습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값이 없습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값이 없습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });
        btnRemainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값이 없습니다.", Toast.LENGTH_SHORT).show();
                else if(Float.parseFloat(num2) == 0){
                    Toast.makeText(getApplicationContext(), "Error:0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    textResult.setText("값 없음");
                }
                else {
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
