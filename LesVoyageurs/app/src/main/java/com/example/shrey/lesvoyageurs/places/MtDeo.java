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


public class MtDeo extends AppCompatActivity {

    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sar_pass);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this, 6);
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
        TV1.setText("MT. DEO TIBBA");

        String s="<p style=\"font-size:22px\"><b>Mt. Deo Tibba</b> - ";
        s+="Mt. Deo Tibba is a beautiful 6001Mts. High peak quite famous among the young climbers. It is the 2nd highest peak in Pir Panjal Range of the Himalayas in Manali, Himachal Pradesh. <br><br>";
        s+="<b>Belief:</b> The Hindu religion believes that Deo Tibba is the assembly site of the gods. The gods are believed to sit on this peak, while the Lord of War and Weather- India, carries out a meeting from his throne- Indrasdan. <br><br>";
        s+="<b>Location:</b> Located at the Dhungan Nalla and Malana Glacier. <br><br>";
        s+="<b>How to get there:</b> The peak can be reached from Manali and it’s surrounding areas.<br></p>";
        s+="<b>Grade of Climb:</b> Difficult<br></p>";
        TextView TV2 = (TextView)findViewById(R.id.TV2);
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
