package com.example.shrey.lesvoyageurs;

/**
 * Created by Shrey on 22-06-2017.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static android.content.ContentValues.TAG;
import static com.example.shrey.lesvoyageurs.MainActivity.sliderID;

public class ImageAdapter extends PagerAdapter{
    Context mContext;
    int j;
    public int[] sliderImagesId;

    public ImageAdapter(Context context, int i) {
        this.mContext = context;
        this.j=i;
        sliderImagesId = sliderID[j];
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v == ((ImageView) obj);
    }

    @Override
    public Object instantiateItem(View container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mImageView.setImageResource(sliderImagesId[i]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }
}