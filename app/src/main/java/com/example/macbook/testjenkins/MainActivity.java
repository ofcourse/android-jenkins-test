package com.example.macbook.testjenkins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public  static  String RUrl= BuildConfig.HTTP_REG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView = findViewById(R.id.lblShowModel);
        txtView.setText(RUrl);
    }
}
