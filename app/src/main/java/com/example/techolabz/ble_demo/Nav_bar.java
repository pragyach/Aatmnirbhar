package com.example.techolabz.ble_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Locale;
import android.widget.Toast;

public class Nav_bar extends Activity {

    TextToSpeech t1;

    Button b1;
    public String kp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bar);
        Intent intent = getIntent();
        final String easyPuzzle = intent.getExtras().getString("epuzzle");
        String address =easyPuzzle;


        switch (address) {
            case "00:A0:50:E6:94:65":
                kp = "Welcome to Delhi Metro.Turn right for the ticket counter.";

                break;
            case "00:A0:50:E6:93:E4":
                kp = "You have reached ticket counter. After booking, move towards left for platform number 1 and towards right for platform number 2";

                break;
            case "00:A0:50:E6:C7:76":
                kp = "You have reached platform number 1";

                break;
            case "00:A0:50:E6:87:F0":
                kp = "You have reached platform number 2";

                break;}

        b1=(Button)findViewById(R.id.button);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = kp;
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}
