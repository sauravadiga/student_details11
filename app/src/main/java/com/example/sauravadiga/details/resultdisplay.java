package com.example.sauravadiga.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;


/**
 * Created by saurav adiga on 06-03-2017.
 */

public class resultdisplay extends MainActivity {
    String[] name1,name2;
    String res1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView tex=(TextView) findViewById(R.id.restext);
        Intent i=getIntent();
        res1= getIntent().getStringExtra("res");
        String[] name1=getResources().getStringArray(R.array.RAMESH);
        String[] name2=getResources().getStringArray(R.array.SURESH);
        //ArrayAdapter<String> adapter;
        //adapter=new ArrayAdapter<String>(
               // this,android.R.layout.simple_list_item_1,name1
       // );
        if(res1.contentEquals("RAMESH"))
        {
            tex.setText(Arrays.toString(name1));
        }else if(res1.contentEquals("SURESH"))
        {
            tex.setText(Arrays.toString(name2));
        }else
        {
            tex.setText("invalid");
        }

           // tex.setText(getString(R.array.RAMESH))



       // tex.setText(getIntent().getExtras().getString("res"));
        Button but=(Button)findViewById(R.id.button2);
        but.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent i=new Intent(resultdisplay.this,MainActivity.class);

                        startActivity(i);
                    }

                }

        );

    }
}
