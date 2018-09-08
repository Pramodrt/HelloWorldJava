package com.pramoduniverse.helloworldjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGreet = (Button) findViewById(R.id.buttonGreet);
        buttonGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFullName = (EditText) findViewById(R.id.editFullName);
                TextView textOutput = (TextView) findViewById(R.id.textOutput);

                String strFullName = editFullName.getText().toString();
                String strOutput;
                if (!strFullName.isEmpty()) {
                    strOutput = getResources().getString(R.string.hello_text) + " " +
                            strFullName.trim() + getResources().getString(R.string.welcome_text);
                } else {
                    strOutput = getResources().getString(R.string.hello_init);
                }

                textOutput.setText(strOutput);
            }
        });

    }
}
