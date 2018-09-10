package com.example.shrey.lesvoyageurs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.shrey.lesvoyageurs.places.Chikmangalur;
import com.example.shrey.lesvoyageurs.places.Chopta;
import com.example.shrey.lesvoyageurs.places.Dandeli;
import com.example.shrey.lesvoyageurs.places.Kabini;
import com.example.shrey.lesvoyageurs.places.MtDeo;
import com.example.shrey.lesvoyageurs.places.SarPass;
import com.example.shrey.lesvoyageurs.places.Sojha;
import com.example.shrey.lesvoyageurs.places.TirthanValley;
import com.example.shrey.lesvoyageurs.places.Velas_Beach;
import com.example.shrey.lesvoyageurs.places.Vof;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Places> mPlacesDataSet = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Prepare DataSet
        mPlacesDataSet = prepareDataSet();

        //Initialize Grid View for programming
        GridView gridview = (GridView) findViewById(R.id.gridView);

        //Connect DataSet to Adapter
        PlacesAdapter PlacesAdapter = new PlacesAdapter(this, mPlacesDataSet);

        //Now Connect Adapter To GridView
        gridview.setAdapter(PlacesAdapter);

        //Add Listener For Grid View Item Click
        gridview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Intent intent;
        //Show Name Of The Places
        switch(position){
            case 0:
                intent = new Intent(this, Chopta.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 1:
                intent = new Intent(this, Velas_Beach.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 2:
                intent = new Intent(this, Sojha.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 3:
                intent = new Intent(this, Vof.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 4:
                intent = new Intent(this, SarPass.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 5:
                intent = new Intent(this, TirthanValley.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 6:
                intent = new Intent(this, MtDeo.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 7:
                intent = new Intent(this, Kabini.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 8:
                intent = new Intent(this, Dandeli.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
            case 9:
                intent = new Intent(this, Chikmangalur.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
                break;
        }
    }


    //Creating Data Set By Adding 6 Places objects
    private ArrayList<Places> prepareDataSet() {

        ArrayList<Places> PlacesData = new ArrayList<>();

        Places Places;

        //1st Item
        Places = new Places();
        Places.setPlacesName("Chopta");
        Places.setPhotoPath(R.drawable.chopta1);
        PlacesData.add(Places);

        //2nd Item
        Places = new Places();
        Places.setPlacesName("Velas Beach");
        Places.setPhotoPath(R.drawable.vb1);
        PlacesData.add(Places);


        //3rd Item
        Places = new Places();
        Places.setPlacesName("Shojha");
        Places.setPhotoPath(R.drawable.sojha1);
        PlacesData.add(Places);


        //4th Item
        Places = new Places();
        Places.setPlacesName("Valley of Flowers");
        Places.setPhotoPath(R.drawable.vof1);
        PlacesData.add(Places);


        //5th Item
        Places = new Places();
        Places.setPlacesName("Sar Pass");
        Places.setPhotoPath(R.drawable.sp1);
        PlacesData.add(Places);


        //6th Item
        Places = new Places();
        Places.setPlacesName("Tirthan Valley");
        Places.setPhotoPath(R.drawable.tv1);
        PlacesData.add(Places);


        //7th Item
        Places = new Places();
        Places.setPlacesName("Mt. Deo Tibba");
        Places.setPhotoPath(R.drawable.mtd1);
        PlacesData.add(Places);


        //8th Item
        Places = new Places();
        Places.setPlacesName("Kabini Wildlife Sanctuary");
        Places.setPhotoPath(R.drawable.kabini1);
        PlacesData.add(Places);


        //9th Item
        Places = new Places();
        Places.setPlacesName("Dandeli");
        Places.setPhotoPath(R.drawable.dandeli1);
        PlacesData.add(Places);


        //10th Item
        Places = new Places();
        Places.setPlacesName("Chikmangalur");
        Places.setPhotoPath(R.drawable.chik1);
        PlacesData.add(Places);
        return PlacesData;

    }
    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
