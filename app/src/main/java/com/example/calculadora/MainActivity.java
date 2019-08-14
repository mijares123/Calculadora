package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean puntoestado = false;
    private boolean sumaestado=false;
    private boolean restaestado = false;
    private boolean divisionestado = false;
    private boolean porestado= false;
    private Double[] numeros = new Double[20];
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btnpun = (Button)findViewById(R.id.btnpun);
        btnpun.setOnClickListener(this);
        Button btnigu = (Button)findViewById(R.id.btnigu);
        btnigu.setOnClickListener(this);
        Button btnsum = (Button)findViewById(R.id.btnsum);
        btnsum.setOnClickListener(this);
        Button btnres = (Button)findViewById(R.id.btnres);
        btnres.setOnClickListener(this);
        Button btnpor = (Button)findViewById(R.id.btnpor);
        btnpor.setOnClickListener(this);
        Button btndiv = (Button)findViewById(R.id.btndiv);
        btndiv.setOnClickListener(this);
        Button btnbor = (Button)findViewById(R.id.btnbor);
        btnbor.setOnClickListener(this);
        Button btnfac = (Button)findViewById(R.id.btnfac);
        btnfac.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        TextView vista = (TextView)findViewById(R.id.textView2);
        int selector = view.getId();
        String var =vista.getText().toString();
        try{
            switch (selector){
                case R.id.btn0: vista.setText(var +"0" );
                                break;
                case R.id.btn1: vista.setText(var +"1" );
                    break;
                case R.id.btn2: vista.setText(var +"2" );
                    break;
                case R.id.btn3: vista.setText(var +"3" );
                    break;
                case R.id.btn4: vista.setText(var +"4" );
                    break;
                case R.id.btn5: vista.setText(var +"5" );
                    break;
                case R.id.btn6: vista.setText(var +"6" );
                    break;
                case R.id.btn7: vista.setText(var +"7" );
                    break;
                case R.id.btn8: vista.setText(var +"8" );
                    break;
                case R.id.btn9: vista.setText(var +"9" );
                    break;
                    //others
                case R.id.btnpun:
                    if(this.puntoestado==false){
                        vista.setText(var +"." );
                        puntoestado=true;
                    }else{
                            return;
                    }

                    break;
                case R.id.btnigu:
                    this.numeros[1]=Double.parseDouble(var);
                    if(this.sumaestado==true){
                        this.resultado=this.numeros[0]+this.numeros[1];
                        vista.setText(String.valueOf(this.resultado));
                    }else if(this.restaestado==true){
                        this.resultado=this.numeros[0]-this.numeros[1];
                        vista.setText(String.valueOf(this.resultado));
                    }else if(this.porestado==true){
                        this.resultado=this.numeros[0] * this.numeros[1];
                        vista.setText(String.valueOf(this.resultado));
                    }else if(this.divisionestado==true){
                        this.resultado=this.numeros[0] / this.numeros[1];
                        vista.setText(String.valueOf(this.resultado));
                    }
                    this.sumaestado=false;
                    this.restaestado=false;
                    this.porestado=false;
                    this.divisionestado=false;
                    break;
                case R.id.btnsum:
                    this.sumaestado=true;
                    this.numeros[0]=Double.parseDouble(var);
                    this.puntoestado=false;
                    vista.setText("" );
                    break;
                case R.id.btnres:
                    this.restaestado=true;
                    this.numeros[0]=Double.parseDouble(var);
                    this.puntoestado=false;
                    vista.setText("" );
                    break;
                case R.id.btnpor:
                    this.porestado=true;
                    this.numeros[0]=Double.parseDouble(var);
                    this.puntoestado=false;
                    vista.setText("" );
                    break;
                case R.id.btndiv:
                    this.divisionestado=true;
                    this.numeros[0]=Double.parseDouble(var);
                    this.puntoestado=false;
                    vista.setText("" );
                    break;
                case R.id.btnfac:
                    vista.setText("");
                    double num = 1;

                    Double factorial = 0.0;
                    factorial=Double.parseDouble(var);
                    while ( factorial!=0) {
                        num=num*factorial;
                        factorial--;
                    }
                    vista.setText(String.valueOf(num));
                    this.sumaestado=false;
                    this.restaestado=false;
                    this.porestado=false;
                    this.divisionestado=false;

                    break;
                case R.id.btnbor:
                    vista.setText("");
                    this.puntoestado=false;
                    break;


            }
        }catch (Exception e){
            vista.setText("fallo o error");
        }
    }
}
