package com.example.reversestringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputStringEditText;
    private Button reverseButton;
    private TextView reverseStringTextView;

    private String inputString;
    private  String reverseString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get view resource
        reverseButton = (Button)  findViewById(R.id.reverse_button);


        //call button listener
        reverseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get view resource input_string_edit_text
                inputStringEditText = (EditText) findViewById(R.id.input_string_edit_text);
                inputString = inputStringEditText.getText().toString();
                reverseString="";
                for (int i =inputString.length()-1;i>=0;i--)
                {
                    reverseString += inputString.charAt(i);
                }
                //Get view Resource reverse_string_text_view
                reverseStringTextView = (TextView)  findViewById(R.id.reverse_string_text_view);

                reverseStringTextView.setText(reverseString);

            }
        });
    }
}