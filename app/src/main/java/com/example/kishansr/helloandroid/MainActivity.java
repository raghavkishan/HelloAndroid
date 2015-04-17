package com.example.kishansr.helloandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView textview;
    public final static String thirdmessage_key="thirdmessagekey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView)findViewById(R.id.greetings_text_view);
    }

/*  public void showGreetings(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();

        if(button_text.equals("Open Second Activity")) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("Open Third Activity"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
    }*/

    public void showdata1(View view)
    {
        String message1;
        TextView textView1;
        textView1=(EditText)findViewById(R.id.button2_edit_text);
        message1=textView1.getText().toString();
        Intent intent=new Intent(this,ThirdActivity.class);
        intent.putExtra(thirdmessage_key,message1);
        startActivity(intent);
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
