package com.example.himanshuahuja.themoviedb.DrawerMenuItem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.himanshuahuja.themoviedb.R;

public class AboutActivity extends AppCompatActivity {

    private CardView sourceCodeOnGitHubCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle(R.string.about);
        sourceCodeOnGitHubCardView = (CardView) findViewById(R.id.card_view_source_code_on_github);

        ontouch();


    }
    private void ontouch() {
        sourceCodeOnGitHubCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String githubLink = "https://github.com/HimanshuAhuja3/MovieDb.git";
                Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubLink));
                startActivity(githubIntent);
            }
        });
    }

}
