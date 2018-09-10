package com.example.shrey.lesvoyageurs;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.shrey.lesvoyageurs.places.*;
import static com.example.shrey.lesvoyageurs.R.string.app_name;

public class Main2Activity extends AppCompatActivity {

    DrawerLayout dLayout;
    ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setNavigationDrawer();
        Bitmap mbitmap, resized;
        ImageView iv=null;
        ImageView[] image={iv,iv,iv,iv,iv,iv,iv,iv,iv,iv};
        int[] id={R.id.IM1,R.id.IM2,R.id.IM3,R.id.IM4,R.id.IM5,R.id.IM6,R.id.IM7,R.id.IM8,R.id.IM9,R.id.IM10};

        for(int i=0;i<10;i++){
            image[i] = (ImageView) findViewById(id[i]);
            mbitmap = decodeSampledBitmapFromResource(getResources(), id[i], 60, 60);
            //resized = Bitmap.createScaledBitmap(mbitmap, 60, 60, false);
            image[i].setImageBitmap(mbitmap);
        }
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {

// First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
// Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }
        return inSampleSize;
    }

    private void setNavigationDrawer() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout); // initiate a DrawerLayout
        NavigationView navView = (NavigationView) findViewById(R.id.navigation); // initiate a Navigation View
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            mDrawerToggle = new ActionBarDrawerToggle(this, dLayout, toolbar, app_name, app_name) {

                public void onDrawerClosed(View view) {
                    supportInvalidateOptionsMenu();
                    //drawerOpened = false;
                }

                public void onDrawerOpened(View drawerView) {
                    supportInvalidateOptionsMenu();
                    //drawerOpened = true;
                }
            };
            mDrawerToggle.setDrawerIndicatorEnabled(true);
            dLayout.setDrawerListener(mDrawerToggle);
            mDrawerToggle.syncState();
        }

        // implement setNavigationItemSelectedListener event on NavigationView
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int itemId = menuItem.getItemId(); // get selected menu item's id
                // check selected menu item's id and replace a Fragment Accordingly
                if (itemId == R.id.first) {
                    Intent intent = new Intent(getApplication(), MainActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.second) {
                    Intent intent = new Intent(getApplication(), About_us.class);
                    startActivity(intent);
                } else if (itemId == R.id.third) {
                    Intent intent = new Intent(getApplication(), Contact_us.class);
                    startActivity(intent);
                } else if (itemId == R.id.fourth) {
                    Intent intent = new Intent(getApplication(), Exit.class);
                    startActivity(intent);
                }
                return false;
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    public void VelasBeach(View v) {
        Intent intent = new Intent(this, Velas_Beach.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void Shojha(View v) {
        Intent intent = new Intent(this, Sojha.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void Chopta(View v) {
        Intent intent = new Intent(this, Chopta.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void Vof(View v) {
        Intent intent = new Intent(this, Vof.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void TirthanValley(View v) {
        Intent intent = new Intent(this, TirthanValley.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void SarPass(View v) {
        Intent intent = new Intent(this, SarPass.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void MtDeo(View v) {
        Intent intent = new Intent(this, MtDeo.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void Kabini(View v) {
        Intent intent = new Intent(this, Kabini.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void Dandeli(View v) {
        Intent intent = new Intent(this, Dandeli.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

    public void Chikmangalur(View v) {
        Intent intent = new Intent(this, Chikmangalur.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }

}
