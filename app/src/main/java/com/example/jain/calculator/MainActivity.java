package com.example.jain.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonMul, buttonDiv, buttonAdd, buttonSub, buttonEql, buttonClc, buttonDot,buttonDel,buttonPer;
    TextView disp, result;
    int len,val1,val2,oper=0;
    double val=0;
    String val2Str="",textdel;


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
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEql = (Button) findViewById(R.id.buttonEql);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        button0 = (Button) findViewById(R.id.button0);
        disp = (TextView) findViewById(R.id.Disp);
        result = (TextView) findViewById(R.id.Res);

        disp.setText(null);
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
                len = disp.getText().length();
                disp.setText(disp.getText() + "+");

                oper = 1;


            }

        });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1 = Integer.parseInt(disp.getText() + "");
                len = disp.getText().length();
                disp.setText(disp.getText() + "-");

                oper = 2;


            }

        });


        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1 = Integer.parseInt(disp.getText() + "");
                len = disp.getText().length();
                disp.setText(disp.getText() + "/");

                oper = 3;


            }

        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1 = Integer.parseInt(disp.getText() + "");
                len = disp.getText().length();
                disp.setText(disp.getText() + "*");
                oper = 4;


            }

        });
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (int i = len + 1; i < disp.getText().length(); i++) {
                    val2Str = val2Str + disp.getText().charAt(i);
                }

                val2 = Integer.parseInt(val2Str + "");
                switch (oper) {

                    case 1:
                        val = val1 + val2;

                        break;
                    case 2:
                        val = val1 - val2;

                        break;
                    case 3:

                        val = val1 / val2;

                        break;

                    case 4:
                        val = val1 * val2;

                }

                result.setText(Double.toString(val));
                oper = 0;
                val = 0;
                val2Str = "";

            }
        });
        buttonClc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(null);
                result.setText(null);
                val = 0;
                oper = 0;
                val1 = 0;
                val2 = 0;
                len = 0;
            }


        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int d = disp.getText().length();
                if (d != 0) {
                    StringBuilder display = new StringBuilder(disp.getText());
                    display = display.deleteCharAt(d - 1);
                    disp.setText(display + "");
                }

            }
        });

    }
}
