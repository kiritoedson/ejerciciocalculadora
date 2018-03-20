package com.example.edson.ejerciciosemana2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,punto,igual,menos,mas,por,div,limpia,unomenos,resultado;
    double num1,num2;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculadora);

        cero=findViewById(R.id.num_0);
        uno=findViewById(R.id.num_1);
        dos=findViewById(R.id.num_2);
        tres=findViewById(R.id.num_3);
        cuatro=findViewById(R.id.num_4);
        cinco=findViewById(R.id.num_5);
        seis=findViewById(R.id.num_6);
        siete=findViewById(R.id.num_7);
        ocho=findViewById(R.id.num_8);
        nueve=findViewById(R.id.num_9);
        punto=findViewById(R.id.punto);
        div=findViewById(R.id.division);
        por=findViewById(R.id.multi);
        menos=findViewById(R.id.resta);
        mas=findViewById(R.id.suma);
        igual=findViewById(R.id.igual);
        limpia=findViewById(R.id.limpiar);
        unomenos=findViewById(R.id.menosuno);
        resultado=findViewById(R.id.resultado);

        Toast.makeText(getApplicationContext(), "Solo Se permiten operaciones de dos operandos", Toast.LENGTH_LONG).show();

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("0");
                }else {
                    resultado.setText(res+"0");
                }
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("1");
                }else {
                    resultado.setText(res+"1");
                }
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("2");
                }else {
                    resultado.setText(res+"2");
                }
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("3");
                }else {
                    resultado.setText(res+"3");
                }

            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("4");
                }else {
                    resultado.setText(res+"4");
                }
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("5");
                }else {
                    resultado.setText(res+"5");
                }
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("6");
                }else {
                    resultado.setText(res+"6");
                }
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("7");
                }else {
                    resultado.setText(res+"7");
                }
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("8");
                }else {
                    resultado.setText(res+"8");
                }
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText("9");
                }else {
                    resultado.setText(res+"9");
                }
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                if (res.equals("")){
                    resultado.setText(".");
                }else {
                    resultado.setText(res+".");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                resultado.setText(res+"/");
            }
        });

        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                resultado.setText(res+"*");
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                resultado.setText(res+"-");
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= resultado.getText().toString();
                resultado.setText(res+"+");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=resultado.getText().toString();
                String n1="";
                double resultadoo=0;
                char [] cadena=res.toCharArray();
                for (int x=0;x<cadena.length;x++){
                    if (x<=cadena.length) {
                        if (cadena[x] == 48) {
                            if (n1.equals("")) {
                                n1 = "0";
                            } else {
                                n1 = n1 + "0";
                            }
                        }

                        if (cadena[x] == 49) {
                            if (n1.equals("")) {
                                n1 = "1";
                            } else {
                                n1 = n1 + "1";
                            }
                        }

                        if (cadena[x] == 50) {
                            if (n1.equals("")) {
                                n1 = "2";
                            } else {
                                n1 = n1 + "2";
                            }
                        }

                        if (cadena[x] == 51) {
                            if (n1.equals("")) {
                                n1 = "3";
                            } else {
                                n1 = n1 + "3";
                            }
                        }

                        if (cadena[x] == 52) {
                            if (n1.equals("")) {
                                n1 = "4";
                            } else {
                                n1 = n1 + "4";
                            }
                        }

                        if (cadena[x] == 53) {
                            if (n1.equals("")) {
                                n1 = "5";
                            } else {
                                n1 = n1 + "5";
                            }
                        }

                        if (cadena[x] == 54) {
                            if (n1.equals("")) {
                                n1 = "6";
                            } else {
                                n1 = n1 + "6";
                            }
                        }

                        if (cadena[x] == 55) {
                            if (n1.equals("")) {
                                n1 = "7";
                            } else {
                                n1 = n1 + "7";
                            }
                        }

                        if (cadena[x] == 56) {
                            if (n1.equals("")) {
                                n1 = "8";
                            } else {
                                n1 = n1 + "8";
                            }
                        }

                        if (cadena[x] == 57) {
                            if (n1.equals("")) {
                                n1 = "8";
                            } else {
                                n1 = n1 + "8";
                            }
                        }

                        if (cadena[x] == 46) {
                            if (n1.equals("")) {
                                n1 = ".";
                            } else {
                                n1 = n1 + ".";
                            }
                        }
                        //operaciones

                        if (cadena[x] == 43) {
                            num1 = Integer.parseInt(n1);
                            operador = "+";
                            n1 = "";
                        }

                        if (cadena[x] == 45) {
                            num1 = Integer.parseInt(n1);
                            operador = "-";
                            n1 = "";
                        }

                        if (cadena[x] == 42) {
                            num1 = Integer.parseInt(n1);
                            operador = "*";
                            n1 = "";
                        }

                        if (cadena[x] == 47) {
                            num1 = Integer.parseInt(n1);
                            operador = "/";
                            n1 = "";
                        }
                    }
                }

                num2=Integer.parseInt(n1);
                if (operador.equals("+")){
                    resultadoo=num1+num2;
                    Toast.makeText(getApplicationContext(), "Resultado: "+resultadoo, Toast.LENGTH_LONG).show();
                }
                if (operador.equals("-")){
                    resultadoo=num1-num2;
                    Toast.makeText(getApplicationContext(), "Resultado: "+resultadoo, Toast.LENGTH_LONG).show();
                }
                if (operador.equals("/")){
                    resultadoo=num1/num2;
                    Toast.makeText(getApplicationContext(), "Resultado: "+resultadoo, Toast.LENGTH_LONG).show();
                }
                if (operador.equals("*")){
                    resultadoo=num1*num2;
                    Toast.makeText(getApplicationContext(), "Resultado: "+resultadoo, Toast.LENGTH_LONG).show();
                }
            }
        });

        limpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
            }
        });

        unomenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=resultado.getText().toString();
                res=res.substring(0,res.length()-1);
                resultado.setText(res);

            }
        });
    }
}
