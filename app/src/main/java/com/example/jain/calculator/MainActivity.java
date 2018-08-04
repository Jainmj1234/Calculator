package com.example.jain.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonMul, buttonDiv, buttonAdd, buttonSub, buttonEql, buttonClc, buttonDot;
    TextView disp;
    double val1, val2;
    Boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonClc = (Button) findViewById(R.id.buttonClc);
        button0 = (Button) findViewById(R.id.button0);
        disp = (TextView) findViewById(R.id.Disp);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "0");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + ".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(disp.getText() + "");
                add = true;
                disp.setText(null);

            }

        });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(disp.getText() + "");
                sub = true;
                disp.setText(null);

            }

        });


        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(disp.getText() + "");
                div = true;
                disp.setText(null);

            }

        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(disp.getText() + "");
                mul = true;
                disp.setText(null);

            }

        });
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Integer.parseInt(disp.getText() + "");
                disp.setText(null);
                if (add == true) {
                    disp.setText(val1 + val2 + "");
                    add = false;
                }
                if (sub == true) {
                    disp.setText(val1 - val2 + "");
                    sub = false;

                }
                if (mul == true) {
                    disp.setText(val1 * val2 + "");
                    mul = false;
                }
                if (div == true) {
                    disp.setText(val1 / val2 + "");
                    div = false;
                }


            }

        });
        buttonClc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(null);
            }


        });

    }
}
