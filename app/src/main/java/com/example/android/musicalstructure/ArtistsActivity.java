package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(searchIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumsIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playlistsIntent = new Intent(ArtistsActivity.this, PlaylistsAvctivity.class);
                startActivity(playlistsIntent);
            }
        });
    }



}
