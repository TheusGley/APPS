package com.teste.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int escolhaUsu;
    public int Apl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view) {
        //System.out.println("Pedra");
        this.escolhaUsu(1);
    }

    public void papel(View view) {
        //System.out.println("Papel");
        this.escolhaUsu(2);
    }

    public void tesoura(View view) {
        //System.out.println("Tesoura");
        this.escolhaUsu(3);
    }


    public void escolhaUsu(int escolhaUsu) {

        Random num = new Random();
        int Apl = num.nextInt(3);
        ImageView imagemResult = findViewById(R.id.imageApp);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[Apl];

        switch (opcaoApp) {
            case "pedra":
                imagemResult.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imagemResult.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imagemResult.setImageResource(R.drawable.tesoura);
                break;
       }



        String[] frase = {"Você Perdeu, Tente novamente.", "Voçê Ganhou, Vamos de Novo"};
        TextView texto = findViewById(R.id.texto1);

        if (escolhaUsu == 1 && Apl == 1){
            texto.setText(frase[0]); }
        else if (escolhaUsu == 1 && Apl == 2){
            texto.setText(frase[1]);}
        else if (escolhaUsu == 2 && Apl == 0){
            texto.setText(frase[1]);}
        else if (escolhaUsu == 2 && Apl == 2){
            texto.setText(frase[0]);}
        else if (escolhaUsu == 3 && Apl == 1){
            texto.setText(frase[1]);}
        else if (escolhaUsu == 3 && Apl == 0){
            texto.setText(frase[0]);}

        else{
            texto.setText("Empate, tente Novamente");}

        String ultimaesc = ("Sua escolha foi essa --> ");
        TextView texto2 = findViewById(R.id.texto2);
        texto2.setText(ultimaesc);
        ImageView imagemult = findViewById(R.id.imageult);
        switch (escolhaUsu) {
            case 1:
                imagemult.setImageResource(R.drawable.pedra);
                break;

            case 2:
                imagemult.setImageResource(R.drawable.papel);
                break;

            case 3:
                imagemult.setImageResource(R.drawable.tesoura);
                break;
        }


    }

}








