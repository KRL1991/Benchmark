package com.example.benchmark;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.icu.lang.UCharacter.toLowerCase;

public class Backwards extends AppCompatActivity {


    ArrayList<String> ArrayListsavedWords = new ArrayList();

    private String toastMessage = "Word was saved!";
    private int toastDuration = Toast.LENGTH_SHORT;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backwards);

        Button buttonsaved = findViewById(R.id.button2_Save);

        buttonsaved.setOnClickListener(this::savedWords);



        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        StringBuilder message1 = new StringBuilder();

        message1.append(toLowerCase(message));

        message1.reverse();


        TextView textView = findViewById(R.id.textView_Backwards);
        textView.setText(message1);







    }

    public void savedWords (View view) {
        TextView textView = findViewById(R.id.textView_Backwards);
        String word = textView.getText().toString();
        ArrayListsavedWords.add(word);

        System.out.println(ArrayListsavedWords.size());

        Log.d("Krl", "Word saved to arraylist");

       // Intent intentMain = new












    }
}