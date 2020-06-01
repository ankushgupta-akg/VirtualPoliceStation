package com.ankush.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        ImageView symbol = (ImageView) findViewById(R.id.symbol);
        ImageView RegisterFIR = (ImageView) findViewById(R.id.Register_Fir);
        ImageView CriminalFinder = (ImageView) findViewById(R.id.CriminalFinder);
        ImageView RequestNOC = (ImageView) findViewById(R.id.RequestNOC);
        ImageView RptUnfairAcvty = (ImageView) findViewById(R.id.RptUnfairAcvty);
        ImageView Appointments = (ImageView) findViewById(R.id.Appointents);
        ImageView WantedList = (ImageView) findViewById(R.id.WantedList);



        symbol.setImageResource(R.drawable.icon);
        RegisterFIR.setImageResource(R.drawable.ic_note_add_black_24dp);
    }
}
