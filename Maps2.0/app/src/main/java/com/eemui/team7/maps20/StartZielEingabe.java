package com.eemui.team7.maps20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class StartZielEingabe extends AppCompatActivity {
    //ImageView
    private ImageView ivStartZielKarte = null;

    //EditText
    private EditText txtStart = null;
    private EditText txtZiel = null;

    //Button
    private Button cmdZwischenzielHinzufuegenEins = null;
    private Button cmdZurRoutenauswahlEins = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_ziel_eingabe_layout);

        //ImageView
        ivStartZielKarte = (ImageView) findViewById(R.id.ivStartZielKarte);

        //EditText
        txtStart = (EditText) findViewById(R.id.txtStart);
        txtZiel = (EditText) findViewById(R.id.txtZiel);
        cmdZwischenzielHinzufuegenEins = (Button) findViewById(R.id.cmdZwischenzielHinzufuegenEins);
        cmdZurRoutenauswahlEins = (Button) findViewById(R.id.cmdZurRoutenauswahlEins);

        //TODO OnClickListener
    }
}
