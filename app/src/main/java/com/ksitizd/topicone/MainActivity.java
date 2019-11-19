package com.ksitizd.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etFirstNum,etSecondNum;
    RadioButton btnRadd,btnRsubtract,btnRmultiply;
    Button btnCalculate;
    int etFirst, etSecond;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNum= findViewById(R.id.etFirstNum);
        etSecondNum= findViewById(R.id.etSecondNum);
        btnRadd=findViewById(R.id.btnRadd);
        btnRsubtract=findViewById(R.id.btnRsubtract);
        btnRmultiply=findViewById(R.id.btnRmultiply);
        btnCalculate=findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etFirst=Integer.parseInt(etFirstNum.getText().toString());
                etSecond=Integer.parseInt(etSecondNum.getText().toString());

                if(btnRadd.isChecked()){
                    result= etFirst+etSecond;

                }else if (btnRsubtract.isChecked()){
                    result=etFirst-etSecond;

                }else if (btnRmultiply.isChecked()){
                    result=etFirst*etSecond;
                }
                Toast.makeText(MainActivity.this, "Result is: " + result, Toast.LENGTH_LONG).show();

            }

        });
    }
}
