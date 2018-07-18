package com.mehak.spex.fashion.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mehak.spex.R;
import com.mehak.spex.fashion.mode.BottomNavigationViewHelper;

public class EyeGlass extends AppCompatActivity {
ImageView im1,im2,im3,im4,im5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_glass);
        im1=findViewById(R.id.dot1);
        im2=findViewById(R.id.line1);
        im3=findViewById(R.id.dot2);
        im4=findViewById(R.id.line2);
        im5=findViewById(R.id.dot3);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);




    }

    public void dot1(View view) {
        im1.setBackground(ContextCompat.getDrawable(this, R.drawable.dot2));
        im3.setBackground(ContextCompat.getDrawable(this, R.drawable.dot));
        im5.setBackground(ContextCompat.getDrawable(this, R.drawable.dot));
        im2.setBackgroundColor(getResources().getColor(R.color.grey2));
        im4.setBackgroundColor(getResources().getColor(R.color.grey2));
    }

    public void dot2(View view) {
        im1.setBackground(ContextCompat.getDrawable(this, R.drawable.dot2));
        im3.setBackground(ContextCompat.getDrawable(this, R.drawable.dot2));
        im5.setBackground(ContextCompat.getDrawable(this, R.drawable.dot));
      //  im2.setBackgroundColor(514848);
        im2.setBackgroundColor(getResources().getColor(R.color.black));
        im4.setBackgroundColor(getResources().getColor(R.color.grey2));
       // im4.setBackgroundColor(dad9d9);
        //im4.getBackground().setColorFilter(Color.parseColor("#dad9d9"), PorterDuff.Mode.DARKEN);
    }

    public void dot3(View view) {
        im1.setBackground(ContextCompat.getDrawable(this, R.drawable.dot2));
        im3.setBackground(ContextCompat.getDrawable(this, R.drawable.dot2));
        im5.setBackground(ContextCompat.getDrawable(this, R.drawable.dot2));
        im2.setBackgroundColor(getResources().getColor(R.color.black));
        im4.setBackgroundColor(getResources().getColor(R.color.black));
    }

    public void backhere(View view) {
        Intent intent = new Intent(EyeGlass.this,LogIn.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void cart1(View view) {
        Intent intent = new Intent(EyeGlass.this,cart.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
