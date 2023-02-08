package com.example.hazard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnOpenMap, btnNews, btnCurrentLoc, btnReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenMap = (ImageButton) findViewById(R.id.btnOpenMap);
        btnNews = (ImageButton) findViewById(R.id.btnNews);
        btnCurrentLoc = (ImageButton) findViewById(R.id.btnCurrentLoc);
        btnReport = (ImageButton) findViewById(R.id.btnReport);

        btnOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MapsActivity.class);
                startActivity(intent);

            }
        });

        btnNews.setOnClickListener(this);

        btnCurrentLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), LocationsActivity.class);
                startActivity(intent);

            }
        });

        btnReport.setOnClickListener(this);

    }

    public void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnReport:
                onReportClicked();

                break;

            case R.id.btnNews:
                onNewsClicked();

                break;
        }
    }

    public void onReportClicked() {
        openUrl("http://azrinaz24.epizy.com/hazard2.php");
    }

    public void onNewsClicked() {
        openUrl("http://azrinaz24.epizy.com/news2.php");
    }
}

