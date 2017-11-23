package com.google.android.gms.samples.vision.barcodereader;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Activity that show QRCode ResultActivity, in a TextView
 */
public class ResultActivity extends AppCompatActivity {
    private String QRCodeReceived="";
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //getting the result of BarcodeCaptureActivity by intent
        Intent intent = getIntent();
        QRCodeReceived = intent.getExtras().getString("qrResult");
        resultView = (TextView) findViewById(R.id.resultView);
        resultView.setText(QRCodeReceived);


    }

}
