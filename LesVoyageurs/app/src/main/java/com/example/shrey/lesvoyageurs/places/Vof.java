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


public class Vof extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sojha);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 3);
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
        TV1.setText("VALLEY OF FLOWERS");

        String s="<p style=\"font-size:22px\"><b>Valley of Flowers</b> - ";
        s+="Valley of flowers is a vibrant and splendid national park reposing in western Himalayas. Nestled in Uttarakhand, this alluring place is famous for its charming meadows of Alpine flowers. Emerald mountain ranges, green meadows and white clouds fuse to create a dream like locale called Valley of flowers. <br><br>";
        s+="<b>Wildlife:</b> This richly diverse area is also home to rare and endangered animals, including the Asiatic black beer, snow leopard, musk bear, red fox and blue sheep. Birds found in the park include Himalayan moral pheasant and other high altitude birds.<br><br>";
        s+="<b>Nearby Attractions:</b> At 3352 to 3658 meters above the sea level, the gentle landscape of the valley of Flowers national park complements the rugged mountain wilderness of nanda Devi national park to the east. <br><br>";
        s+="<b>How to get there:</b> Valley of flowers is located 300kms north of Rishikesh, near Badrinath. One needs to travel by road up till Govindghat and from there the trek to Valley of flowers starts. Ghangaria is the base camp for the valley of flowers trek. A beautiful world awaits here at the endearing spot. We offer attractive trekking packages at a very reliable budget. <br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
