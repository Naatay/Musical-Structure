package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistsAvctivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists_avctivity);

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent = new Intent(PlaylistsAvctivity.this, MainActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumsIntent = new Intent(PlaylistsAvctivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent songsIntent = new Intent(PlaylistsAvctivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent = new Intent(PlaylistsAvctivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
    }
}
