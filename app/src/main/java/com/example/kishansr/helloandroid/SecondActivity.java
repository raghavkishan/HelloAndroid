package com.example.kishansr.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by HP on 3/31/2015.
 */
public class SecondActivity extends Activity {
    TextView textview;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        textview = (TextView)findViewById(R.id.Display_name);
        edittext = (EditText)findViewById(R.id.Enter_your_name);
    }

    public void Showname(View view){
        String message1;
        message1=edittext.getText().toString();
       // String message ="Raghav";
        textview.setText(message1);
    }
}