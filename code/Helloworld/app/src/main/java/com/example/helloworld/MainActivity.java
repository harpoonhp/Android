package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity");
        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);
        Switch swithch1 = findViewById(R.id.switch1);
        final  TextView mText = findViewById(R.id.text);
        final  TextView tv = findViewById(R.id.tv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello World!");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Happy Everyday!");
            }
        });
        swithch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,	boolean isChecked)
            {				// TODO Auto-generated method stub
                if (isChecked){
                    mText.setText("开");
                    button.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.GONE);
                }
                else {
                    mText.setText("关");
                    button.setVisibility(View.GONE);
                    button2.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
