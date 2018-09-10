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


public class Dandeli extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dandeli);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 8);
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
        TV1.setText("DANDELI");

        String s="<p style=\"font-size:22px\"><b>Dandeli</b> - A Home to Nature Lovers.";
        s+="named after Dandelappa, a local deity, a servant of the Mirashi landlords, who lost his because of his loyalty is a town place located in the North- Western part of Karnataka near Goa border. <br><br>";
        s+="<b>Major Attraction:</b> Dandeli is a natural habitat for wildlife, including tigers, leopards, black panthers, elephants, gaur, deer, antelops and bears. It is the second largest wildlife sanctuary in Karnataka and was designated as a tiger reserve in 2007. The jungle is also home for several varieties of reptiles and almost 300 varieties of birds. <br><br>";
        s+="<b>Nearby Attraction:</b> The sanctuary provide rafting oppurtunities at the Virnoli Rapids connected to the Kali river. Other tourist activities include nature walks, boating, bird watching , crocodile spotting and angling. Nearby tourist spots include Ulavi, syntheri Rocks, Anashi National Park and Moulangi. The biodiversity in the forest has attracted sufficient tourism to support a number of resorts in the vicinity of Dandeli. The government has promoted eco-tourism with proper planning of healthy breeding of wild animals. <br><br>";
        s+="<b>Best Time to Visit:</b> Between November and February<br><br>";
        s+="<b>Accomodation:</b> Lodges and guesthouses are available which offer excellent services.<br><br>";
        s+="<b>How to get there:</b> Dandeli is 78 km from Hubli and 32kms from Alnavar. The nearest railway stations are Londa, Alnavar, Dharwar and Hubli. Direct buses are available. Dandeli lies connected by Konkan rail route.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
