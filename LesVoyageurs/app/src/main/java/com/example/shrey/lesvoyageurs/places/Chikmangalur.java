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


public class Chikmangalur extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chikmangalur);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 9);
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
        TV1.setText("CHIKMANGALUR");

        String s="<p style=\"font-size:22px\"><b>Chikmangalur</b> - ";
        s+="Chikmangalur is a beautiful district situated on the western part of Karnataka. It is most popular for its coffee plantations and pleasant climate.<br><br>";
        s+="<b>Major Attraction:</b> Though it was among unexplored destinations, the hill station thanks to its picturesque landscapes and greenery gained lots of attention from tourists across. Apart from all this, the waterfalls of this region has also attracted travelers. There are many waterfalls located in this district like the famous hebbe falls, Shanti waterfalls and several others. Situated at the height of 3400 feets, the district never fails to impress you. <br><br>";
        s+="<b>Places to Visit:</b> Mullayangiri, Agumbe, Bababudan Giri, Kalhatti falls, Bhadra wildlife sanctuary, Manikyadhara falls, Kudramukh national park and Kadambi falls. <br><br>";
        s+="<b>How to get there:</b> Chikmangalur is easily accessible from Manglore. Thogh Chikmangalur does not have any airport, it is well connected to major cities like Banglore and Manglore.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
