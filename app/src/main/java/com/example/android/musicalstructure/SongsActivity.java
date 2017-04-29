package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumsIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(searchIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playlistsIntent = new Intent(SongsActivity.this, PlaylistsAvctivity.class);
                startActivity(playlistsIntent);
            }
        });
    }
}
