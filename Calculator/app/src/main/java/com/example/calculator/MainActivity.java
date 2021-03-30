package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button btnEqual,btnDot,btn0,btnAddition,btn1,btn2,
    btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnClear,btnSubtract,btnMultiply,btnDivision,btnBracket,btnPercent;
   TextView tvInput,tvOutput;
   String process;
   boolean checkBracket=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        btn0=findViewById(R.id.btn0);
        btn0=findViewById(R.id.btn0);

        btnAddition=findViewById(R.id.btnAddition);
        btnSubtract=findViewById(R.id.btnSubtract);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivision=findViewById(R.id.btnDivision);

        btnEqual=findViewById(R.id.btnEqual);

        btnClear=findViewById(R.id.btnClear);
        btnDot=findViewById(R.id.btnDot);
        btnPercent=findViewById(R.id.btnPercent);
        btnBracket=findViewById(R.id.btnBracket);

        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);
    btnClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvInput.setText("");
            tvOutput.setText("");
        }
    });
    btn0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            process=tvInput.getText().toString();
            tvInput.setText(process + "0");
        }
    });
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            process=tvInput.getText().toString();
            tvInput.setText(process + "1");
        }
    });
     btn2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
         process=tvInput.getText().toString();
         tvInput.setText(process + "2");
         }
     });
     btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          process=tvInput.getText().toString();
          tvInput.setText(process + "3");
        }
     });
     btn4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            process=tvInput.getText().toString();
            tvInput.setText(process + "4");
            }
      });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "9");
            }
        });
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "+");
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "*");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "÷");
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + "%");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process + ".");
            }
        });
        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBracket){
                    process=tvInput.getText().toString();
                    tvInput.setText(process + ")");
                    checkBracket=false;
                }else {
                    process=tvInput.getText().toString();
                    tvInput.setText(process + "(");
                    checkBracket=true;
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
            }
        });
    }
}