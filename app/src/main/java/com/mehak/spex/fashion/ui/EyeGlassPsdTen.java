package com.mehak.spex.fashion.ui;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.mehak.spex.R;
import com.mehak.spex.fashion.mode.BottomNavigationViewHelper;

public class EyeGlassPsdTen extends AppCompatActivity {
    ImageButton img1,img2,img3,img4;
    ImageView imageView;
    int i1=1;
    ImageView im1,im2,im3,im4,im5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_glass_psd_ten);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        img1=findViewById(R.id.btnc1);
        img2=findViewById(R.id.btnc2);
        img3=findViewById(R.id.btnc3);
        img4=findViewById(R.id.btnc4);
        imageView=findViewById(R.id.viewpager);
        im1=findViewById(R.id.dot1);
        im2=findViewById(R.id.line1);
        im3=findViewById(R.id.dot2);
        im4=findViewById(R.id.line2);
        im5=findViewById(R.id.dot3);
    }

    public void c1(View view) {

        img1.setImageResource(R.drawable.c5);
        img2.setImageResource(R.drawable.c1);
        img3.setImageResource(R.drawable.c2);
        img4.setImageResource(R.drawable.c3);
        imageView.setImageResource(R.drawable.layer_866);
        i1=1;
        // img1.setBackground(ContextCompat.getDrawable(this, R.drawable.c5));
    }
    public void c2(View view) {
        img2.setImageResource(R.drawable.c5);
        img1.setImageResource(R.drawable.c4);
        img3.setImageResource(R.drawable.c2);
        img4.setImageResource(R.drawable.c3);
        imageView.setImageResource(R.drawable.l33);
        i1=2;
        // img1.setBackground(ContextCompat.getDrawable(this, R.drawable.c5));
    }
    public void c3(View view) {
        img3.setImageResource(R.drawable.c5);
        img2.setImageResource(R.drawable.c1);
        img4.setImageResource(R.drawable.c3);
        img1.setImageResource(R.drawable.c4);
        imageView.setImageResource(R.drawable.layer34);
        i1=3;
        // img1.setBackground(ContextCompat.getDrawable(this, R.drawable.c5));
    }
    public void c4(View view) {
        img4.setImageResource(R.drawable.c5);
        img2.setImageResource(R.drawable.c1);
        img3.setImageResource(R.drawable.c2);
        img1.setImageResource(R.drawable.c4);
        imageView.setImageResource(R.drawable.layer_29);
        i1=4;
        // img1.setBackground(ContextCompat.getDrawable(this, R.drawable.c5));
    }

    public void image(View view) {
        if(i1!=0){
            // Toast.makeText(Spex.this, "1="+i1, Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, EyeGlass.class);
            //for sending the image to next activity
            //  i.putExtra("MY_KEY", i1);
            startActivity(i);
        }
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
}
