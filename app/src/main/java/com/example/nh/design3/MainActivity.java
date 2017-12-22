package com.example.nh.design3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1= (ImageView) findViewById(R.id.img1);
        ImageView img2= (ImageView) findViewById(R.id.img2);
        ImageView img3= (ImageView) findViewById(R.id.img3);
        ImageView img4= (ImageView) findViewById(R.id.img4);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img1:
                Toast.makeText(this, "number 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.img2:
                Toast.makeText(this, "number2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img3:
                Toast.makeText(this, "number3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img4:
                Toast.makeText(this, "number4", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
