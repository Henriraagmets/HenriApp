package com.example.opilane.henriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button üks, kaks, kolm, neli, viis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        üks = findViewById(R.id.nupp1);

        üks. setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
            String url = "http://noortehaal.delfi.ee/news/ajaviide/20-uskumatut-fakti-mis-ullataval-kombel-toele-vastavad?id=79842062";
            Intent faktid = new Intent(Intent.ACTION_VIEW);
            faktid.setData(Uri.Parse(url));
            }
        }

    }
}
