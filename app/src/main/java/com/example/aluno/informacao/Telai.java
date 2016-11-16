package com.example.aluno.informacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Telai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telai);
        Button Btnok = (Button) findViewById(R.id.Btnok);
        Btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(Telai.this,Telar.class);
                TextView info = (TextView) findViewById(R.id.informacao);
                String valor = info.getText().toString();
                Bundle parametros = new Bundle();
                parametros.putString("chaves",valor);

                intencao.putExtras(parametros);



                startActivity(intencao);



            }
        });
    }
}
