package com.example.sauravadiga.details;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Text=(EditText)findViewById(R.id.edit);
        Button but=(Button)findViewById(R.id.button1);
        but.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent i=new Intent(MainActivity.this,resultdisplay.class);
                        i.putExtra("res",Text.getText().toString());
                        startActivity(i);
                    }

                }

        );
    }






}
