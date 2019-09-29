package com.rajeshdonepudi.myapplication;

/** Author : DONEPUDI RAJESH
 *
 * EMAIL ID : rajeshdonepudi1@gmail.com
 *
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import static com.rajeshdonepudi.myapplication.MainActivity.IMAGE;
import static com.rajeshdonepudi.myapplication.MainActivity.TEXT;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String image = intent.getStringExtra(TEXT);
        String text = intent.getStringExtra(IMAGE);

        ImageView imageView = (ImageView) findViewById(R.id.imageV);
        TextView textView = (TextView) findViewById(R.id.textV);

        Glide.with(getApplicationContext())
                .asBitmap()
                .load(image)
                .into(imageView);

        textView.setText(text);


    }

    public void backButton(View view) {

        finish();
    }

    @Override
    public void onBackPressed() {
        finish();
    }


}
