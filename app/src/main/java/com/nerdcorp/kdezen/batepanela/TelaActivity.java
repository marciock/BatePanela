package com.nerdcorp.kdezen.batepanela;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import utilities.MediaHelpers;

public class TelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        MediaHelpers mediaHelpers=new MediaHelpers();

        mediaHelpers.playMusic(this, R.raw.tampas, R.id.LayoutTampas);
        mediaHelpers.playMusic(this, R.raw.panelas, R.id.LayoutPanela);
        mediaHelpers.playMusic(this, R.raw.tambor, R.id.LayoutTambor);
        mediaHelpers.playMusic(this, R.raw.buzina, R.id.LayoutBuzina);


    }

}
