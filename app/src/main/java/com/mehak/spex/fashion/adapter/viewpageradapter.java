package com.mehak.spex.fashion.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.android.volley.toolbox.ImageLoader;
import com.mehak.spex.R;
import com.mehak.spex.fashion.mode.CustomeVollyRequest;
import com.mehak.spex.fashion.mode.SliderUtils;

import java.util.List;
//import com.mehak.ui.R;

public class viewpageradapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<SliderUtils> sliderImg;
    private ImageLoader imageLoader;
   // private  Integer [] images = {R.drawable.layer_866,R.drawable.layer_8,R.drawable.layer_23,R.drawable.layer_27};

    public viewpageradapter(List<SliderUtils>sliderImg,Context context) {
        this.sliderImg=sliderImg;
        this.context = context;
    }

    @Override
    public int getCount() {
        return sliderImg.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    //@SuppressLint("ServiceCast")
    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       // return null;
        View view=layoutInflater.inflate(R.layout.custom_layout,null);
        SliderUtils utils=sliderImg.get(position);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
      //  imageView.setImageResource(images[position]);
        imageLoader= CustomeVollyRequest.getInstance(context).getImageLoader();
        imageLoader.get(utils.getSliderImageUrl(),ImageLoader.getImageListener(imageView,R.mipmap.ic_launcher,android.R.drawable.ic_dialog_alert));
        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
