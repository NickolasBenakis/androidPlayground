package com.example.protal2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button1, button2;
    TextView textView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
//        textView1.setText(textView1.getText()+"\non Create OMG I am Fired!");

    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        textView1.setText(textView1.getText()+"\nonResume OMG I am Fired!");
//
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1){
            Toast.makeText(this,"You are so Beautiful no1",Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.item2){
            Toast.makeText(this,"You are so Beautiful no2",Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item2) {
            button1.setText("Nooo");
        }
            return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void go4(View view) {
        Button button3 = findViewById(R.id.button3);
        button3.setText("I am pressed!");
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        //textView1.setText('OMG I am Fired!!!');
    }
}
