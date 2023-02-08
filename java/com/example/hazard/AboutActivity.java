package com.example.hazard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnGitHub, btnYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_main);

        btnGitHub = (ImageButton) findViewById(R.id.btnGitHub);
        btnYoutube = (ImageButton) findViewById(R.id.btnYoutube);

        btnGitHub.setOnClickListener(this);
        btnYoutube.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnGitHub:
                onGithubClicked();

                break;

            case R.id.btnYoutube:
                onYoutubeClicked();

                break;
        }
    }

    public void onGithubClicked() {
        openUrl("https://github.com/1Ryo7/Hazard-Application");
    }

    private void onYoutubeClicked() {
        openUrl("https://youtu.be/bv4SEphN9gY");
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
