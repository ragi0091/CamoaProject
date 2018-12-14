package com.example.jay.practice3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {
    private EditText calltxt;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, numstar, num0, numhashtag, callbtn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        calltxt = (EditText) findViewById(R.id.calltxt);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        numstar = (Button) findViewById(R.id.numstar);
        num0 = (Button) findViewById(R.id.num0);
        numhashtag = (Button) findViewById(R.id.numhashtag);
        callbtn2 = (Button) findViewById(R.id.callbtn2);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "9");
            }
        });
        numstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "*");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "0");
            }
        });
        numhashtag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calltxt.setText(calltxt.getText() + "#");
            }
        });
        callbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel = "tel:" + calltxt.getText();
                Intent intent = new Intent("android.intent.action.CALL",Uri.parse(tel));
                startActivity(intent);
            }
        });

    }
}
