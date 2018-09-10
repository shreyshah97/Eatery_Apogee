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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

import static com.example.shrey.lesvoyageurs.R.string.app_name;

public class MainActivity extends AppCompatActivity {

    int flag;
    Spinner spin;
    DrawerLayout dLayout;
    ActionBarDrawerToggle mDrawerToggle;
    ViewFlipper viewFlipper;

    String spinnerlist[] = {"All Places", "Beaches", "Hilly Terrain", "Wildlife"};
    static int[][] sliderID = {
            {R.drawable.chopta3, R.drawable.chopta2, R.drawable.chopta1, R.drawable.chopta4},
            {R.drawable.vb3, R.drawable.vb2, R.drawable.vb1, R.drawable.vb4},
            {R.drawable.sojha3, R.drawable.sojha2, R.drawable.sojha1, R.drawable.sojha4},
            {R.drawable.vof3, R.drawable.vof2, R.drawable.vof1},
            {R.drawable.tv3, R.drawable.tv2, R.drawable.tv1, R.drawable.tv4},
            {R.drawable.sp3, R.drawable.sp2, R.drawable.sp1, R.drawable.sp4, R.drawable.sp5, R.drawable.sp6},
            {R.drawable.mtd3, R.drawable.mtd2, R.drawable.mtd1, R.drawable.mtd4, R.drawable.mtd5},
            {R.drawable.kabini3, R.drawable.kabini2, R.drawable.kabini1, R.drawable.kabini4, R.drawable.kabini5, R.drawable.kabini6},
            {R.drawable.dandeli3, R.drawable.dandeli2, R.drawable.dandeli1},
            {R.drawable.chik3, R.drawable.chik2, R.drawable.chik1, R.drawable.chik4, R.drawable.chik5, R.drawable.chik6, R.drawable.chik7}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.flipper);

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.id.flipper, options);
        int imageHeight = options.outHeight;
        int imageWidth = options.outWidth;
        String imageType = options.outMimeType;

        viewFlipper.setFlipInterval(1500);
        viewFlipper.startFlipping();

        spin = (Spinner) findViewById(R.id.spinner1);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, R.layout.spinner_item, spinnerlist);
        aa.setDropDownViewResource(R.layout.spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int position, long id) {
                spinnerlist[0] = "All Places";
                switch (position) {
                    case 0:
                        flag = 0;
                        break;
                    case 1:
                        flag = 1;
                        break;
                    case 2:
                        flag = 2;
                        break;
                    case 3:
                        flag = 3;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // sometimes you need nothing here
            }
        });

        for (
                int i = 0;
                i < sliderID.length; i++)

        {
            for (int j = 0; j < sliderID[i].length; j++)
                //  This will create dynamic image view and add them to ViewFlipper
                setFlipperImage(sliderID[i][j]);
        }

        setNavigationDrawer();
    }

    private void setFlipperImage(int res) {
        ImageView image = new ImageView(getApplicationContext());
        Bitmap mbitmap = decodeSampledBitmapFromResource(getResources(), res, 200, 200);
        Bitmap resized = Bitmap.createScaledBitmap(mbitmap, (getWindowManager().getDefaultDisplay().getWidth() - ((int) (5 * this.getResources().getDisplayMetrics().density))), (int) (300 * this.getResources().getDisplayMetrics().density), false);
        image.setImageBitmap(resized);
        viewFlipper.addView(image);
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
                    finish();
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

    public void next(View view) {
        switch (flag) {
            case 0:
                Intent intent = new Intent(this, GalleryActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }
}
