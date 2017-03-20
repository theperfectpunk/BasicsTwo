package com.mohit.tokas.basicstwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        //define an onclick listener
        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an intent with a context of ActivityOne and reference to java class of ActivityTwo
                Intent activityIntent = new Intent(getBaseContext(), ActivityTwo.class);
                startActivity(activityIntent);
            }
        };

        //set listener to button click as the function defined above
        Button activitiyBtn = (Button)findViewById(R.id.start_activity_btn);
        activitiyBtn.setOnClickListener(buttonListener);
    }
}