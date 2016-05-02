package com.example.clickbutton;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button changeMessageButton;
    Button showToastButton;

    TextView messageTextView;
    EditText inputEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeMessageButton = (Button)findViewById(R.id.changemessage);
        showToastButton = (Button)findViewById(R.id.showtoast);

        messageTextView = (TextView)findViewById(R.id.message);
        inputEditText = (EditText)findViewById(R.id.input);

        // When the change message button is clicked
        changeMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get the text from the user
                String inputText = inputEditText.getText().toString();

                // Show the user's input text
                messageTextView.setText(inputText);

            }
        });


        // When the show toast button is clicked
        showToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // This is what we want to display in the toast
                String toastText = "Hello World";

                // This is how long we want to show the toast
                int duration = Toast.LENGTH_SHORT;

                // Get the context
                Context context = getApplicationContext();

                // Create the toast
                Toast toast = Toast.makeText(context, toastText, duration);

                // Show the toast
                toast.show();
            }
        });

    }




}
