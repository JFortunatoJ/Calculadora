package com.example.joaob.calculadora;

import android.app.AlertDialog;
import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.*;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActCalculadora extends AppCompatActivity implements View.OnClickListener{

    private EditText txtNum1;
    private EditText txtNum2;
    private Button btnCalcular;
    private Spinner spnOperacoes;
    private Button btnLimpar;
    private Button btnFechar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_calculadora);

        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        spnOperacoes = (Spinner)findViewById(R.id.spnOperacoes);
        btnLimpar = (Button)findViewById(R.id.btnLimpar);
        btnFechar = (Button)findViewById(R.id.btnFechar);
        lblResultado = (TextView)findViewById(R.id.lblResultado);

        btnCalcular.setOnClickListener(this);

    }

    public void onClick (View v) {
        /*double Num1 = Double.parseDouble(txtNum1.getText().toString());
        double Num2 = Double.parseDouble(txtNum2.getText().toString());*/

        Contas c = new Contas();

        c.setNum1(Double.valueOf(txtNum1.getText().toString()));
        c.setNum2(Double.valueOf(txtNum2.getText().toString()));

        double resultado = 0;
        if (spnOperacoes.getSelectedItem().equals("+")) {
            lblResultado.setText(c.somar());//Com Classe
            //Sem Classe
            /*resultado = Num1 + Num2;
            lblResultado.setText(""+resultado);
            AlertDialog.Builder dig = new AlertDialog.Builder(this);
            dig.setMessage("O resultado é: " + resultado);
            dig.setNeutralButton("OK", null);
            dig.show();*/
        } else if (spnOperacoes.getSelectedItem().equals("-")) {
            lblResultado.setText(c.subtrair());
            /*resultado = Num1 - Num2;
            lblResultado.setText(""+resultado);
            AlertDialog.Builder dig = new AlertDialog.Builder(this);
            dig.setMessage("O resultado é: " + resultado);
            dig.setNeutralButton("OK", null);
            dig.show();*/
        } else if (spnOperacoes.getSelectedItem().equals("*")) {
            lblResultado.setText(c.multiplicar());
            /*resultado = Num1 * Num2;
            lblResultado.setText(""+resultado);
            AlertDialog.Builder dig = new AlertDialog.Builder(this);
            dig.setMessage("O resultado é: " + resultado);
            dig.setNeutralButton("OK", null);
            dig.show();*/
        } else if (spnOperacoes.getSelectedItem().equals("/")) {
            lblResultado.setText(c.dividir());
            /*AlertDialog.Builder dig = new AlertDialog.Builder(this);
            if(Num2 == 0){
                dig.setMessage("Impossível divisão por 0(zero)!");
                dig.setNeutralButton("OK", null);
                dig.show();
                txtNum2.setText("");
                txtNum2.requestFocus();
            }else {
                resultado = Num1 / Num2;
                lblResultado.setText(""+resultado);
               dig.setMessage("O resultado é: " + resultado);
                dig.setNeutralButton("OK", null);
                dig.show();*/
        }

        if (btnLimpar.performClick() == true) {
            txtNum1.setText("");
            txtNum2.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
