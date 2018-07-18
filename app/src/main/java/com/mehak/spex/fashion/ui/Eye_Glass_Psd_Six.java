package com.mehak.spex.fashion.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mehak.spex.R;
import com.mehak.spex.fashion.adapter.viewpageradapter;
import com.mehak.spex.fashion.adapter.viewpageradapter1;
import com.mehak.spex.fashion.mode.BottomNavigationViewHelper;

public class Eye_Glass_Psd_Six extends AppCompatActivity {
    ImageView im1,im2,im3,im4,im5;
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye__glass__psd__six);
        im1=findViewById(R.id.dot1);
        im2=findViewById(R.id.line1);
        im3=findViewById(R.id.dot2);
        im4=findViewById(R.id.line2);
        im5=findViewById(R.id.dot3);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);


        viewPager = (ViewPager) findViewById(R.id.vpager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.linearLayout3);

        viewpageradapter1 viewPagerAdapter = new viewpageradapter1(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


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
        Intent intent = new Intent(Eye_Glass_Psd_Six.this,LogIn.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void cart1(View view) {
        Intent intent = new Intent(Eye_Glass_Psd_Six.this,cart.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void c2(View view) {
    }
}
