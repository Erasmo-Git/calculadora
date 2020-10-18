package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private String digitado1 = "";
    private String digitado2 = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        resultado = findViewById(R.id.text_resultado);
    }

    public void pegaTexto (String texto){
        String textoResultado = resultado.getText().toString();
        textoResultado = textoResultado + texto;
        resultado.setText(textoResultado);
    }

    public void onClickDelete (View v){
        TextView deleta = findViewById(R.id.text_resultado);
        deleta.setText("");
    }

    private void resultadoOperacao (String num){
        if (operacao.isEmpty()){
            digitado1 = digitado1 + num;
        } else {
            digitado2 = digitado2 + num;
        }
    }
    public void onClickSoma (View v){
        if (!digitado1.isEmpty()) {
            operacao = "+";
            pegaTexto("+");
        } else {
            Toast.makeText(MainActivity.this, "Digite um numero", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickSubtrai (View v){
        if (!digitado1.isEmpty()) {
            operacao = "-";
            pegaTexto("-");
        } else {
            Toast.makeText(MainActivity.this, "Digite um numero", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMultiplica (View v){
        if (!digitado1.isEmpty()) {
            operacao = "x";
            pegaTexto("x");
        } else {
            Toast.makeText(MainActivity.this, "Digite um numero", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDivisao (View v){
        if (!digitado1.isEmpty()) {
            operacao = "/";
            pegaTexto("/");
        } else {
            Toast.makeText(MainActivity.this, "Digite um numero", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickIgual (View v){
        if (!digitado1.isEmpty() && !digitado2.isEmpty()){
            int n1 = Integer.parseInt(digitado1);
            int n2 = Integer.parseInt(digitado2);
            if (operacao.equals("+")){
                int total = n1 + n2;
                resultado.setText(String.valueOf(total));
            }
            if (operacao.equals("-")){
                int total = n1 - n2;
                resultado.setText(String.valueOf(total));
            }
            if (operacao.equals("x")){
                int total = n1 * n2;
                resultado.setText(String.valueOf(total));
            }
            if (operacao.equals("/") && n2 != 0) {
                int total = n1 / n2;
                resultado.setText(String.valueOf(total));
            }else {
                    Toast.makeText(MainActivity.this, "Digite um numero acima de zero!", Toast.LENGTH_LONG).show();
                }
        } else {
            Toast.makeText( MainActivity.this, "Digite numero e operacao", Toast.LENGTH_LONG).show();
        }

    }

    public void onClickBotao1 (View v){
        resultadoOperacao("1");
        pegaTexto("1");
    }

    public void onClickBotao2 (View v){
        resultadoOperacao("2");
        pegaTexto("2");
    }

    public void onClickBotao3 (View v){
        resultadoOperacao("3");
        pegaTexto("3");
    }

    public void onClickBotao4 (View v){
        resultadoOperacao("4");
        pegaTexto("4");
    }

    public void onClickBotao5 (View v){
        resultadoOperacao("5");
        pegaTexto("5");
    }

    public void onClickBotao6 (View v){
        resultadoOperacao("6");
        pegaTexto("6");
    }

    public void onClickBotao7 (View v){
        resultadoOperacao("7");
        pegaTexto("7");
    }

    public void onClickBotao8 (View v){
        resultadoOperacao("8");
        pegaTexto("8");
    }

    public void onClickBotao9 (View v){
        resultadoOperacao("9");
        pegaTexto("9");
    }

    public void onClickBotao0 (View v){
        resultadoOperacao("0");
        pegaTexto("0");
    }
}
