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


public class TirthanValley extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirthan_valley);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 4);
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
        TV1.setText("TIRTHAN VALLEY");

        String s="<p style=\"font-size:22px\"><b>Tirthan Valley</b> - ";
        s+="Tirthan valley is actually home to India’s most recent national parks- the GHNP (Great Himalayan National Park).  This is one of the unexplored places which has something to offer for everyone. <br><br>";
        s+="<b>Ambience:</b> The best part about Tirthan is that there are no designated tourist spots. The whole valley is a spot itself. A trek here and you see a new view of the river, a trek there and you see a new view of the valley.<br><br>";
        s+="<b>Major Attraction:</b> Adventure sports, trout fishing , exploration of an un-explored  hill town, all punched into one lovely combination called Tirthan Valley. Oh ! also, there is an option of doing absolutely nothing and chilling in the pine-studded landscape of Tirthan valley!<br><br>";
        s+="<b>How to get there:</b> Easiest possible route to Tirthan is from Delhi as follow:<br><br>Delhi- ambala- Chandigarh- Roopnagar-kiratpur-Bilaspur-Mandi-Pandoh-Aut-Larji-Gushaini-Tirthan<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
