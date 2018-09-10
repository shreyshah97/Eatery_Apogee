package com.example.shrey.lesvoyageurs.places;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.shrey.lesvoyageurs.ImageAdapter;
import com.example.shrey.lesvoyageurs.R;
import com.viewpagerindicator.CirclePageIndicator;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;


public class Velas_Beach extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velas__beach);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 1);
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
        TV1.setText("VELAS BEACH");

        String s="<p style=\"font-size:22px\"><b>Velas</b> - a small village situated in Ratnagiri, along the Konkan Coast. <br><br>";
        s+="<b>Major Attraction:</b> It was only when a large population of Olive Ridley Turtles, which is an endangered species, was discovered along its shoreline did it become famous.These turtles, which are the migrating kind, lay their eggs on this beach every year. And to protect these endangered species, the villagers, with support from other organizations, have founded the Sahyadri Nisaraga Mitra Organization, which conducts a Turtle Festival every year to spread awareness about their cause.<br><br>";
        s+="<b>Nearby Attractions:</b> Apart from the Turtles, this beach also as other scenic attractions around it. Some of these attractions are the Bankot Fort, Mahalakshmi Temple and an old temple of Shri Bhairi Rameshwar.<br><br>";
        s+="<b>Best Time to Visit:</b> The best time to visit this place is November to May. And the popular Turtle festival is generally held in the month of March.<br><br>";
        s+="<b>How to get there:</b> The nearest city to Velas is Ratnagiri at about 197kms.<br>From Mumbai, Velas is about 263 kms and it takes approximately 6hrs to reach there via Mumbai – Pune Express Highway.<br><br>";
        s+="<b>Accommodation:</b> Once you arrive in Velas, you could find decent dormitory style accommodation with Kasav Mitra Mandal, an organization, that provides lodging & boarding along with good home-cooked food at a very reasonable price.There are also a few individually owned small home stays, which provide separate rooms with basic facilities at a nominal price.<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
