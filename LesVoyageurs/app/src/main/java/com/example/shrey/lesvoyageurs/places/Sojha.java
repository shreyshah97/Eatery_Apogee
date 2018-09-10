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


public class Sojha extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sojha);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 2);
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
        TV1.setText("SHOJHA");

        String s="<p style=\"font-size:22px\"><b>Shojha</b> - The Unexplored region in Himachal <br><br>";
        s+="Shojha is a small hill station of Himachal Pradesh, now a paradise for the tourists. It is the best place to sit quietly in the middle of wilderness and panorama.<br><br>";
        s+="<b>Climate:</b> At a mere distance of 5 Kms from Jalori pass, Shojha has pleasant weather throughout the year. With verdant deodar forest covering the area with snow-peaked Himalayan Mountain Range hovering on one side this village is packed with tourist attractions like fort, lake and waterfall.<br><br>";
        s+="<b>Ambience:</b> This small hill station in Himachal Pradesh is untouched by the beauty which might be just the thing that a city dweller needs to relax and unwind. It is a small village hidden between the huge Himalayan Mountain Ranges, and it does not offer many options of eating joints.<br><br>";
        s+="<b>Major Attraction:</b> As Shojha is an attractive place here, one can have morning walk. The nature will beckon after a walk of nearly 1 Km from Shojha to Waterfall Point. Tirthan Valley here is one of the prime attractions in Shojha. This in the vicinity of the village is a great spot for lazing around and for fishing.<br><br>";
        s+="<b>Nearby Attractions:</b> Jalori Pass is next destination after Tirthan Valley. Jalori Pass offers the trekking points to amateur trekkers and it is one of the easiest trekking area in Shojha region. Raghupur Fort which is about 1 km from the pass and Serolsar Lake is 5km from the pass can be visited from there.<br><br>";
        s+="<b>How to get there:</b> Shojha is a small Village/hamlet in Banjar Valley in Sundarnagar Tehsil in Mandi District of Himachal Pradesh State, India. It is located 33 KM towards South from District head quarters Mandi. Daily buses are operating from Delhi /Chandigarh to Manali via Mandi. One can get taxi from Mandi to Sojha.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
