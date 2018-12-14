package com.example.jay.practice3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MusicActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private ListView musicListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        String[] musiclist = getResources().getStringArray(R.array.musiclist);
        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, musiclist);
        musicListView = (ListView) findViewById(R.id.musicListView);
        musicListView.setAdapter(adapter);

        musicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MediaPlayer mp;

                switch (position) {
                    case 0:
                        mp = MediaPlayer.create(MusicActivity.this, R.raw.happy);
                        mp.start();
                        break;
                    case 1:
                        mp = MediaPlayer.create(MusicActivity.this, R.raw.twice);
                        mp.start();
                        break;
                    case 2:
                        mp = MediaPlayer.create(MusicActivity.this, R.raw.wildflower);
                        mp.start();
                        break;
                }
            }
        });
    }
}