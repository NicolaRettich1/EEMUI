package com.eemui.team7.maps20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Edit Text
    private EditText txtFindLocationOne = null;

    //Button
    private Button cmdKompass = null;
    private Button cmdZumRoutenplaner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        //EditText
        txtFindLocationOne = (EditText) findViewById(R.id.txtFindLocationOne);

        //Button
        cmdKompass = (Button) findViewById(R.id.cmdKompass);
        cmdZumRoutenplaner = (Button) findViewById(R.id.cmdZumRoutenplaner);

        //TODO OnClickListener



    }
}
