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


public class Chopta extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sojha);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 0);
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
        TV1.setText("CHOPTA");

        String s="<p style=\"font-size:22px\"><b>Chopta</b> - Less is More <br><br>";
        s+="Watch the slopes of chopta undulate gently and smell the grass of its meadows and relax in it's idyllic vibe. Chopta a small village in uttarakhand is perfect for those who need tocatch their breath after a haranguing run in urban life. Partake in some adventure sports, or trek or just open a picnic baskey in the beautiful meadows, perfection is the keyword here. Unwind, take a break!<br><br>";
        s+="<b>Major Attraction:</b> Chopta is a region of meadows and evergreen forest area which is a part of Kedarnath Wildlife Sanctuary located in Uttarakhand State, India and a base for trekking to Tungnath, third temple of Panch Kedar.<br><br>";
        s+="<b>Nearby Attractions:</b> The Chopta region has many treks and trails cutting through jungles and grasslands. Because of an abundance of birds, Chopta is becoming popular among bird watchers.<br><br>";
        s+="<b>Activities:</b> Activities in Chopta include:<br>1.) Camping and trekking, yoga, survival activities.<br>2.) Snow trekking, snow skiing.<br>3.) Rock craft, rock climbing, rappelling.<br>4.) Photography of rare himalayan speices of monal and musk deer.<br><br>";
        s+="<b>Time to Visit:</b> It is a place that is yet to be fully explored and one of the best hill stations in India. Chopta is a must visit destination for nature lovers and those passionate for trekking. Chopta has a very cool and pleasant climate from March to May with a temperature between 10 degrees to 30 degree celsius. After that comes monsoon season that starts from July and ends in October. Chopta vitnesses snowfall from November to March and the temperature is between -15 degrees and 15 degrees celsius. So, trekkers must visit the place during winters if the want to see snowfields.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
