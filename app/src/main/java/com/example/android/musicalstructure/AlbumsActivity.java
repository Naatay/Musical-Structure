package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalstructure.R.id.albums;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(searchIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playlistsIntent = new Intent(AlbumsActivity.this, PlaylistsAvctivity.class);
                startActivity(playlistsIntent);
            }
        });
    }
}
