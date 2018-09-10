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


public class SarPass extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sar_pass);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 5);
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
        TV1.setText("SAR PASS");

        String s="<p style=\"font-size:22px\"><b>Sar Pass</b> - ";
        s+="The Sar pass is in Parvati Valley of kullu at the height of 4220 metres in district of Himachal Pradesh, India. Sar, in the local dialect, means a lake. While trekking, across the path from Tila Lotni to Biskeri Ridge, one has to pass by a small, normally frozen lake and hence the name Sar Pass trek. <br><br>";
        s+="<b>Ambience:</b> Trekking to the Himalayas in India is an experience of a lifetime and a mélange of adventure and self- realization! You’ll not only discover some beautiful places, but also rediscover yourself amidst the beauty of majestic Himalayan Ranges! Just remember it’s not about the mountain we conquer, but overselves. Every mountain is reachable if you just keep walking towards it. If your passion starts with adventure and trekking then this is the best way to get away from all the stress of the noisy cities. <br><br>";
        s+="<b>Major Attraction:</b> Take the adventure trekking to sar Pass, a place that offers eternal beauty, tranquility and adventure. Take in the beauty of enchanting vistas of Kasol and start walking towards Grahan Village through verdant forest!  Next day, the steeper trail into the forest will take you to the nagaru Campsite. The enthralling views of parvati Valley will leave you breathless. An early trek via Biskeri thatch will take you to to the magical Sar Pass! <br><br>";
        s+="<b>How to get there:</b> Sar Pass trek starts from  the base camp Kasol, Himachal Pradesh. One can easily reach Kullu from delhi or Chandigarh by bus. Kasol is just 30 minutes from Kullu and well connected by HPSRTC buses. Nearest airport is Bhuntar which is just 32 kms from kasol. Chandigarh airport is 290 kms from Kasol. Nearest railway station is Chandigarh.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
