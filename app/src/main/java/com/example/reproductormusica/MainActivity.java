package com.example.reproductormusica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play, pause, stop;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Castear los botones*/
        play = (Button) findViewById(R.id.play);
        pause = (Button) findViewById(R.id.pause);
        stop = (Button) findViewById(R.id.stop);

        /*Crear el media player y castearlo*/
        mp = MediaPlayer.create(MainActivity.this,R.raw.audio1);


        /*Agregar el escuchador*/
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                mp.start(); ///////reproducir
                break;
            case R.id.pause:
                mp.pause();   /////pausar
                break;

            case R.id.stop:
                mp.stop(); /////parar
                break;
                default:
                    break;
        }
    }
}
