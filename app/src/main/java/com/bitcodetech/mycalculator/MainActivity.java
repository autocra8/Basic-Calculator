package com.bitcodetech.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
 TextView resultScreen,screen;
 Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDivide,btnEqual,btnMultiply,btnAdd,btnSub,btnAc;
    boolean Addition, Subtract, Multiplication, Division, decimal;
    Integer input1 = 0, input2 = 0;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        value="";

        setContentView(R.layout.activity_main);
        resultScreen=findViewById(R.id.resultScreen);
        screen=findViewById(R.id.screen);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnEqual=findViewById(R.id.btnEqual);
        btnAc=findViewById(R.id.btnAc);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "1");
                value=value+"1";
                screen.setText(value);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "2");
                value=value+"2";
                screen.setText(value);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "3");
                value=value+"3";
                screen.setText(value);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "4");
                value=value+"4";
                screen.setText(value);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "5");
                value=value+"5";
                screen.setText(value);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "6");
                value=value+"6";
                screen.setText(value);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "7");
                value=value+"7";
                screen.setText(value);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "8");
                value=value+"8";
                screen.setText(value);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "9");
                value=value+"9";
                screen.setText(value);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultScreen.setText(resultScreen.getText() + "0");
                value=value+"0";
                screen.setText(value);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultScreen.getText().length() != 0) {
                    input1 = Integer.parseInt(resultScreen.getText() + "");
                    Addition = true;
                    decimal = false;
                    resultScreen.setText(null);
                    value=value+"+";
                    screen.setText(value);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultScreen.getText().length() != 0) {
                    input1 = Integer.parseInt(resultScreen.getText() + "");
                    Subtract = true;
                    decimal = false;
                    resultScreen.setText(null);
                    value=value+"-";
                    screen.setText(value);
                }
            }
        });
         btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
    public void onClick(View view) {
        resultScreen.setText(null);

        value=" ";
        screen.setText(value);
    }
});
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultScreen.getText().length() != 0) {
                    input1 = Integer.parseInt(resultScreen.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    resultScreen.setText(null);
                    value=value+"*";
                    screen.setText(value);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultScreen.getText().length() != 0) {
                    input1 = Integer.parseInt(resultScreen.getText() + "");
                    Division = true;
                    decimal = false;
                    resultScreen.setText(null);
                    value=value+"/";
                    screen.setText(value);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division ) {
                    if(resultScreen.getText()!=null){
                        input2 = Integer.parseInt(resultScreen.getText() + "");
                    }
                    else{
                 Toast.makeText(MainActivity.this,"No Value",Toast.LENGTH_LONG).show();
                    }
                }

                if (Addition) {

                    resultScreen.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    resultScreen.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    resultScreen.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    resultScreen.setText(input1 / input2 + "");
                    Division = false;
                }

            }
        });
    }
}