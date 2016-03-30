package com.example.calendarquickstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button) findViewById(R.id.see);
        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                       startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                    }
                }
        );

    }
}