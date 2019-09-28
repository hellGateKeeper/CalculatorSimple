package sdu.cs_60.auttapon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1EditText,num2EditText;
        final TextView resultTextView;
        Button addButton;
        Button minusButton;
        Button multiplyButton;
        Button diviveButton;

        num1EditText = findViewById(R.id.edtNum1);
        num2EditText = findViewById(R.id.edtNum2);
        resultTextView = findViewById(R.id.txvResult);
        addButton = findViewById(R.id.btnAdd);
        minusButton= findViewById(R.id.btnMinus);
        multiplyButton = findViewById(R.id.btnMultiple);
        diviveButton = findViewById(R.id.btnDivive);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                int num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                int result = num1 + num2;
                resultTextView.setText(result +"");
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                int num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                int result = num1 - num2;
                resultTextView.setText(result +"");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                int num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                int result = num1 * num2;
                resultTextView.setText(result +"");
            }
        });

        diviveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                int num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                int result = num1 / num2;
                resultTextView.setText(result +"");
            }
        });


    }
}
