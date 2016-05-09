package com.example.emmancipatemusemwa.C77172238Task1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.emmancipatemusemwa.countingthemedgame.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    EditText EditTextInput;
    String strInput;
    Button checkBtn;
    TextView txtLenght;
    TextView resultV;

    String[] names = new String[]{
            "Eman",
           "Emmancipate",
            "Peter",
            "Ivy",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         checkBtn = (Button)findViewById(R.id.checkBtn);
        EditTextInput = (EditText)findViewById(R.id.editText);




       txtLenght = (TextView)findViewById(R.id.nameView);
        resultV = (TextView)findViewById(R.id.resultView);

        Random random = new Random();
        txtLenght.setText(names[random.nextInt(3)]);

        checkBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int length = Integer.parseInt(EditTextInput.getText().toString());
                if(length== txtLenght.getText().toString().length()){
                    //Toast.makeText(getApplicationContext(), "Your Guess is correct", Toast.LENGTH_LONG).show();
                    resultV.setText("Good Guess, That's correct");

                }
                else {
                    //Toast.makeText(getApplicationContext(), "Your Guess is wrong!!!", Toast.LENGTH_LONG).show();
                    resultV.setText("Wrong Guess, Try Again");
                }
            };
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }


}
