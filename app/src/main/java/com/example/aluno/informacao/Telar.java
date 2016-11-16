package com.example.aluno.informacao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by aluno on 04/10/2016.
 */
public class Telar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telar);
        TextView msg = (TextView) findViewById(R.id.mensagem);

        Intent intencao = getIntent();

        Bundle bundle = intencao.getExtras();

        String valor = bundle.getString("chaves");

        msg.setText(valor);

    }
}
