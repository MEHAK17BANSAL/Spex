package com.mehak.spex.fashion.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.mehak.spex.R;
import com.mehak.spex.fashion.adapter.viewpageradapter;
import com.mehak.spex.fashion.mode.BottomNavigationViewHelper;
import com.mehak.spex.fashion.mode.SliderUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
private DrawerLayout drawerLayout;
private ActionBarDrawerToggle actionBarDrawerToggle;

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    RequestQueue req;
    List<SliderUtils> sliderImg;
    viewpageradapter viewPagerAdapter;
    String request_url="http://www.json-generator.com/api/json/get/ceoWxCmlxK?indent=2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        req= Volley.newRequestQueue(this);
        sliderImg=new ArrayList<>();
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
       // toolbar.getNavigationIcon().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
        // toolbar.setNavigationIcon(R.drawable.layer11);
        //navigationbar
        drawerLayout=findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black1));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //slider

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

sendrequest();
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
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.SHOP:
                        Intent intent = new Intent(MainActivity.this,cart.class);
                        startActivity(intent);
                        return true ;
                    case R.id.RECENT:

                        return true ;
                    case R.id.STORE:
                        Intent intent1 = new Intent(MainActivity.this,MyLocationActivity.class);
                        startActivity(intent1);
                        return true ;
                    case R.id.SIGNIN:

                        return true ;
                    default:
                        return false;
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            int id = item.getItemId();


            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    public void cart(View view) {
        Intent intent = new Intent(MainActivity.this,cart.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void eyeglass(View view) {
        Intent intent = new Intent(MainActivity.this,Spex.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.explore) {
            // Handle the camera action
           // mwebView.loadUrl("http://newspexart.onlinedemos.xyz/index.php/home/category/21/1");
            Intent intent=new Intent(MainActivity.this,LogIn.class);
            startActivity(intent);

            Toast.makeText(this,"this is a explore",Toast.LENGTH_LONG).show();

        } else if (id == R.id.oh) {
          //  mwebView.loadUrl("http://newspexart.onlinedemos.xyz/index.php/home/coupons");
        } else if (id == R.id.ci) {
         //   mwebView.loadUrl("http://newspexart.onlinedemos.xyz/index.php/home/legal/gift_offers");
        } else if (id == R.id.nl) {
          //  mwebView.loadUrl("http://newspexart.onlinedemos.xyz/index.php/home/legal/terms_conditions");
        } else if (id == R.id.au) {
           // mwebView.loadUrl("http://newspexart.onlinedemos.xyz/index.php/home/about/");

        } else if (id == R.id.t) {
           // mwebView.loadUrl("http://newspexart.onlinedemos.xyz/index.php/home/contact");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void fb(View view) {
        Toast.makeText(this,"fb on navigation drawer",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(MainActivity.this,LogIn.class);
        startActivity(intent);

    }
    public void sendrequest(){
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, request_url, null, new Response.Listener<JSONArray>() {
           // JSONObject jsonObject = new JSONObject(content);
            //JSONArray jsonArray =  jsonObject.getJSONArray("products");
           // JSONArray jsonArray =  jsonObject.getJSONArray("products");
            @Override
            public void onResponse(JSONArray response) {
                for(int i=0;i<response.length();i++) {
                    SliderUtils sliderUtils = new SliderUtils();
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                     //
                        sliderUtils.setSliderImageUrl(jsonObject.getString("image_url"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    sliderImg.add(sliderUtils);
                }
                viewPagerAdapter = new viewpageradapter(sliderImg,MainActivity.this);

                viewPager.setAdapter(viewPagerAdapter);

                dotscount = viewPagerAdapter.getCount();
                dots = new ImageView[dotscount];

                for(int i = 0; i < dotscount; i++){

                    dots[i] = new ImageView(MainActivity.this);
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                    params.setMargins(8, 0, 8, 0);

                    sliderDotspanel.addView(dots[i], params);

                }

                dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        req.add(jsonArrayRequest);
    }
}
