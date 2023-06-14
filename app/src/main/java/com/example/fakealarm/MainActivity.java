package com.example.fakealarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ImageView imgAlarm;
    private Spinner spnUserSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnUserSelect=findViewById(R.id.spnUserSelect);

        imgAlarm=findViewById(R.id.btnAlarm);
        imgAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.alarm);
                mediaPlayer.start();

                String nombre=spnUserSelect.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),nombre,Toast.LENGTH_SHORT).show();
            }
        });



    }
}