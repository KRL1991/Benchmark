package com.example.benchmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mMessageText;

    public static String EXTRA_MESSAGE = "Word sent!";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageText = findViewById(R.id.editText_Word);

        Button button = findViewById(R.id.button_SendToBackwards);

        button.setOnClickListener(this::sendWord);


    }

    public void sendWord (View view) {
        Intent intent = new Intent(this,Backwards.class);
        mMessageText = findViewById(R.id.editText_Word);

        String message = mMessageText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }


}