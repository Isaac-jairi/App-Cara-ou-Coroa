package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView btnJogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.imageJogar);

    }

    public void jogada(View view){
        //criar novaintent (activity)
        Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

        //gerador de jogada
        int jogada = new Random().nextInt(2);

        //passar dados
        intent.putExtra("Jogada", jogada);

        startActivity(intent);

    }

}
