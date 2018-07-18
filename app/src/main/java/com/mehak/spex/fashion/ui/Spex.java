package com.mehak.spex.fashion.ui;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mehak.spex.R;
import com.mehak.spex.fashion.adapter.viewpageradapter;
import com.mehak.spex.fashion.mode.BottomNavigationViewHelper;

public class Spex extends AppCompatActivity {
    TextView im1,im2,im3;
    ImageButton img1,img2,img3,img4;
    ImageView imageView;
    int i1=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spex);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        im1=findViewById(R.id.dot1);
        im2=findViewById(R.id.dot2);
        im3=findViewById(R.id.dot3);
        img1=findViewById(R.id.btnc1);
        img2=findViewById(R.id.btnc2);
        img3=findViewById(R.id.btnc3);
        img4=findViewById(R.id.btnc4);
        imageView=findViewById(R.id.viewpager);



    }

    public void im1(View view) {

        im1.setBackground(ContextCompat.getDrawable(this, R.drawable.blackbtn));
        im1.setTextColor(getResources().getColor(R.color.purewhite));
        im2.setBackground(ContextCompat.getDrawable(this, R.drawable.tab));
        im2.setTextColor(getResources().getColor(R.color.black));
        im3.setBackground(ContextCompat.getDrawable(this, R.drawable.tab));
        im3.setTextColor(getResources().getColor(R.color.black));
    }

    public void im2(View view) {
        im1.setBackground(ContextCompat.getDrawable(this, R.drawable.tab));
        im1.setTextColor(getResources().getColor(R.color.black));
        im2.setBackground(ContextCompat.getDrawable(this, R.drawable.blackbtn));
        im2.setTextColor(getResources().getColor(R.color.purewhite));
        im3.setBackground(ContextCompat.getDrawable(this, R.drawable.tab));
        im3.setTextColor(getResources().getColor(R.color.black));

    }

    public void im3(View view) {
        im1.setBackground(ContextCompat.getDrawable(this, R.drawable.tab));
        im1.setTextColor(getResources().getColor(R.color.black));
        im3.setBackground(ContextCompat.getDrawable(this, R.drawable.blackbtn));
        im3.setTextColor(getResources().getColor(R.color.purewhite));
        im2.setBackground(ContextCompat.getDrawable(this, R.drawable.tab));
        im2.setTextColor(getResources().getColor(R.color.black));
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
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }
}
