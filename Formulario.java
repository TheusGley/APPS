package com.teste.caixas_de_texto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText CampoNome;
    private EditText CampoEmail;
    private TextView Texto1;
    private CheckBox vermelho,verde,azul;
    private boolean resultadoVer, resultadoVerd, resultadoazu;
    private RadioButton masculino, feminino;
    private RadioGroup opcao;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CampoNome = findViewById(R.id.Cnome);
        Texto1 = findViewById(R.id.Texto1);
        CampoEmail = findViewById(R.id.Cemail);
        vermelho = findViewById(R.id.verm);
        verde = findViewById(R.id.verde);
        azul = findViewById(R.id.azul);
        masculino = findViewById(R.id.masc);
        feminino = findViewById(R.id.fem);
        opcao = findViewById(R.id.grupo);

        //Ouvinte Muda a mensagem conforme a escolha do usuario.
        opcao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.masc) {
                    Texto1.setText("Meu pintao");
                } else if (i == R.id.fem) {
                    Texto1.setText("Minha xana");
                }
            }
        });
    }








    public void checkbox () {

        resultadoVer = vermelho.isChecked();
        resultadoVerd = verde.isChecked();
        resultadoazu = azul.isChecked();
        String texto = "";


        if (vermelho.isChecked()) {
            String get = vermelho.getText().toString();
            texto = texto + get;
        }
        if (verde.isChecked()) {
            texto = texto + " Verde";
        }
        if (azul.isChecked()) {
            texto = texto + " Azul";
        }
        //Texto1.setText(texto);
    }

    public void sexo() {}




        /*
        if (masculino.isChecked()){
            }
        else if (feminino.isChecked()){

        }/

         */







    public void Enviar (View view){


        checkbox();
        sexo();
        String nome = CampoNome.getText().toString();
        String email = CampoEmail.getText().toString();
       // Texto1.setText("Nome: " + nome + "            email: "+ email);


    }
    public void limpar (View view){
        CampoNome.setText("");
        CampoEmail.setText("");
        Texto1.setText(" ");

    }
}
