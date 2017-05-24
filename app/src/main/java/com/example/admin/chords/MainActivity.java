package com.example.admin.chords;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.midi.MidiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Context context = this;
    //midi manager
 //  MidiManager m = (MidiManager)context.getSystemService(Context.MIDI_SERVICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.ima);
       // img.setImageResource(R.drawable.lansc);

        String imgur = "lansc";
        // ---get reasorce from drawble in res
        //int res = getResources().getIdentifier(imgur,"drawable",getPackageName());
       // img.setImageResource(res);
        ////////////////////////////

        //////////////////-- get reasorce from asset folder
        try {
            InputStream stream = getAssets().open(imgur + ".png");
            Drawable d = Drawable.createFromStream(stream,null);
            img.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_MIDI)) {
         //   Toast.makeText(getApplicationContext(), "Your phone has midi", Toast.LENGTH_SHORT).show();

       // }

    }
}
