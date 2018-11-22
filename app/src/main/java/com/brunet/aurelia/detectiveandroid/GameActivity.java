package com.brunet.aurelia.detectiveandroid;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;


/**
 * Created by Aurelia Brunet on 19/11/2018.
 */
public class GameActivity extends AppCompatActivity {

    private ImageView mImgSuitcase = null;
    public boolean suitcase = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hall_room);

        mImgSuitcase = findViewById(R.id.imgSuitcase);
        suitcaseEmpty();
    }


    public void suitcaseEmpty() {
        if (!suitcase){
            Log.d("Suitcase","Votre valise est vide.");
        } else{
            Log.d("Suitcase","Votre valise est pleine.");
        }
    }


}
