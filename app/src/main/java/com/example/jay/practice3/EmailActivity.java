package com.example.jay.practice3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    private EditText sendertxt, receivertxt, subjecttxt, contexttxt;
    private Button sendbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        sendertxt = (EditText) findViewById(R.id.sendertxt);
        receivertxt = (EditText) findViewById(R.id.receivertxt);
        contexttxt = (EditText) findViewById(R.id.contenttxt);
        subjecttxt = (EditText) findViewById(R.id.subjecttxt);
        sendbtn = (Button) findViewById(R.id.sendbtn);

        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL,receivertxt.getText() );
                intent.putExtra(Intent.EXTRA_SUBJECT,subjecttxt.getText());
                intent.putExtra(Intent.EXTRA_TEXT,contexttxt.getText());
                startActivity(Intent.createChooser(intent,"Send Email"));
            }
        });

    }
}
