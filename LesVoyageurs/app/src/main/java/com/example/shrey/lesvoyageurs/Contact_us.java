package com.example.shrey.lesvoyageurs;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Contact_us extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView TV1 = (TextView) findViewById(R.id.TV1);
        TV1.setText("CONTACT US");
        TextView TV2 = (TextView) findViewById(R.id.TV2);
        String s="<p style=\"font-size:22px\"><b>Phone</b> - 07016123494<br><br>";
        s+="<b>Whatsapp</b> - 07016123494<br><br>";
        s+="<b>Facebook</b> - http://m.facebook.com/Les-Voyageurs-For-Those-Who-Live-To-Travel-484523515272712/?ref=page_internal&mt_nav=1 <br><br>";
        s+="<b>Instagram</b> - http://www.instagram.com/les_voyageurs_<br></p>";
        TV2.setText(Html.fromHtml(s));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }
}