package br.com.digitalhouse.digitalhousegroceryapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pegar a intent
        Intent intent = getIntent();

        // Pegar o bundle da intent
        Bundle bundle = intent.getExtras();

        // Pegar no bundle o valor que está guardado na chave EMAIL
        String email = bundle.getString("EMAIL");

        // Buscar elemento na tela por id
       // TextView emailText = findViewById(R.id.email_text);

        // Alterar o texto
       // emailText.setText("Usuário: "+email);

        Button comprasButton = findViewById(R.id.button);
        comprasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirComprasFragment();
            }
        });

        Button listaButton = findViewById(R.id.button2);
        listaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibirListaFragment();
            }
        });

        Button promocaoButton = findViewById(R.id.button3);
        promocaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibirPromocao();
            }
        });
    }
    private void exibirComprasFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fundo_01,new FragmentCompras());
        transaction.commit();
    }

    private void exibirListaFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fundo_01,new FragmentLista());
        transaction.commit();

    }

    private void exibirPromocao(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction  = manager.beginTransaction();
        transaction.replace(R.id.fundo_01,new FragmentPromocao());
        transaction.commit();
    }

}
