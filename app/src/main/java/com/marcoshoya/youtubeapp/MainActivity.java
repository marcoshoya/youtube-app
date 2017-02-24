package com.marcoshoya.youtubeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = (Button) findViewById(R.id.btnPlaSingle);
        Button btnStandAlone = (Button) findViewById(R.id.btnStandAlone);

        btnSingle.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlaSingle:
                intent = new Intent(this, YoutubeActivity.class);
                break;

            case R.id.btnStandAlone:
                intent = new Intent(this, StandaloneActivity.class);
                break;

            default:
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
