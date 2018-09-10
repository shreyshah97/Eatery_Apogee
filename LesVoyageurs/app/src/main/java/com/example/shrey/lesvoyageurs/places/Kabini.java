package com.example.shrey.lesvoyageurs.places;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.shrey.lesvoyageurs.ImageAdapter;
import com.example.shrey.lesvoyageurs.R;
import com.viewpagerindicator.CirclePageIndicator;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;


public class Kabini extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabini);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 7);
        mViewPager.setAdapter(adapterView);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mViewPager);
        final float density = getResources().getDisplayMetrics().density;
        indicator.setRadius(5 * density);

        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                currentPage = position;
            }
            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {
            }
            @Override
            public void onPageScrollStateChanged(int pos) {
            }
        });

        TextView TV1 = (TextView)findViewById(R.id.TV1);
        TV1.setText("KABINI");

        String s="<p style=\"font-size:22px\"><b>Kabini</b> - ";
        s+="The district of Kabini is located about 94 kms from Mysore, Karnataka. It is situated between Mysore and Kodagu district and on the northwestof bandipur National Park and Nagarhole National Park. The vicinity is a part of Nilgiri Biospere Reservewhich has been declared as UNESCO World Heritage Site. <br><br>";
        s+="<b>Major Attraction:</b> A popular tourist destination in southern India, the sanctuary offers different kinds of animals, birds and wildlife. The dam at Kabini wildlife Sanctuary across the river “Kabini” near Beechanahalli is a special attraction. Some of the animals found here are leopard, panther, sambhar, spotted deer, cheetah and 250 speices of birds. <br><br>";
        s+="<b>Best Time to Visit:</b> The best time to visit the Kabini wildlife sanctuary is between October and May. It is advisable not to visit the sanctuary between June and September as the region experiences heavy rain showers.<br><br>";
        s+="<b>Accomodation:</b> Lodges and guesthouses are available which offer excellent services.<br><br>";
        s+="<b>How to get there:</b> Nearest airport is the Banglore airport.<br><br>Nearest railway station: Mysore city railway station.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
