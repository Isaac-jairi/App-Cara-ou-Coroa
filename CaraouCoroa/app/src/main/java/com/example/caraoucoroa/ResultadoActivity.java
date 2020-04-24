package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView resultado, voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = findViewById(R.id.imageResultado);
        voltar = findViewById(R.id.imageVoltar);

        Bundle dados = getIntent().getExtras();

        if(dados.getInt("Jogada")==0){
            resultado.setImageResource(R.drawable.moeda_cara);
        }else{
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

    }

    public void fechar(View view){
        finish();
    }




}
