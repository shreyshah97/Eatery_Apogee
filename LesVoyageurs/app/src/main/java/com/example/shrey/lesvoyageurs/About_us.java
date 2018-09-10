package com.example.shrey.lesvoyageurs;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.shrey.lesvoyageurs.R.id.TV2;

public class About_us extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView TV1= (TextView)findViewById(R.id.TV1);
        TV1.setText("ABOUT US");
        TextView TV2= (TextView)findViewById(R.id.TV2);
        TV2.setText("Les voyageur is a travel group which let you connect to the travelers nearby. We aim at helping you expand your circle of friends along with letting you experience the culture and the beauty that the unexplored places has to offer. Travel with us not just to conquer the destination but also connect with oneself. Join Les Voyageurs to wander to places where the Wifi is weak!");
    }
    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}