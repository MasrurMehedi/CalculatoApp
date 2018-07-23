package com.example.masror_mehedi.calculatoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {


    Button btnplus,btnsub,btnmulti,btndiv,btnclear;
    TextView txtResult;
    EditText etxtNumber1,etxtNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txt_result);
        btnplus=findViewById(R.id.btn_plus);
        btnsub=findViewById(R.id.btn_sub);
        btnmulti=findViewById(R.id.btn_multi);
        btndiv=findViewById(R.id.btn_div);
        btnclear=findViewById(R.id.btn_clear);

        etxtNumber1 =findViewById(R.id.etxt_number1);
        etxtNumber2 =findViewById(R.id.etxt_number2);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etxtNumber1.getText().toString();
                String value2 = etxtNumber2.getText().toString();
                if (!value1.isEmpty()&& !value2.isEmpty())

                {
                    double n1 = Double.parseDouble(value1); //convert string to double
                    double n2 = Double.parseDouble(value2);
                    double result =  n1+n2;

                    txtResult.setText(" "+result);
                }

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etxtNumber1.getText().toString();
                String value2 = etxtNumber2.getText().toString();
                if (!value1.isEmpty()&& !value2.isEmpty())

                {
                    double n1 = Double.parseDouble(value1); //convert string to double
                    double n2 = Double.parseDouble(value2);
                    double result =  n1-n2;

                    txtResult.setText(" "+result);
                }
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etxtNumber1.getText().toString();
                String value2 = etxtNumber2.getText().toString();
                if (!value1.isEmpty()&& !value2.isEmpty())

                {
                    double n1 = Double.parseDouble(value1); //convert string to double
                    double n2 = Double.parseDouble(value2);
                    double result =  n1*n2;

                    txtResult.setText(" "+result);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etxtNumber1.getText().toString();
                String value2 = etxtNumber2.getText().toString();
                if (!value1.isEmpty()&& !value2.isEmpty())

                {
                    double n1 = Double.parseDouble(value1); //convert string to double
                    double n2 = Double.parseDouble(value2);
                    double result =  n1/n2;

                    txtResult.setText(" "+result);
                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             txtResult.setText("0");
             etxtNumber1.setText("");
             etxtNumber2.setText("");
            }
        });

    }
}
