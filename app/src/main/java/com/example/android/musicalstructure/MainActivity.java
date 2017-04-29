package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsAvctivity.class);
                startActivity(playlistsIntent);
            }
        });

    }



}
