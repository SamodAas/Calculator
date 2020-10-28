package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public float firstNumber=0;
    public float secondNumber;
    private float result;
    private boolean isSecondNumber=false;
    private boolean afterEqual=false;
    private boolean afterOperator=false;
    private String sFirstNumber="0";
    private String sSecondNumber="";
    private String sResult="0";
    private String sHistory;
    private TextView resultText;
    private TextView historyText;
    public char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.historyText=findViewById(R.id.historyText);
        this.resultText= findViewById(R.id.resultText);
        resultText.setText("0");
    }

    public void numberEntering(View view) {
        if(sFirstNumber.equals("0")||afterEqual){
            sFirstNumber="";
            sHistory="";
            historyText.setText(sHistory);
        }

        Button but= (Button)findViewById(view.getId());
        String sNumber=but.getText().toString();

        if(isSecondNumber==false){
            if(sFirstNumber.length()<11){
            sFirstNumber+=sNumber;
            resultText.setText(sFirstNumber);
            }
            afterEqual=false;
        }
        else {
            if(sSecondNumber.length()<11){
            sSecondNumber+=sNumber;
            resultText.setText(sSecondNumber)
            ;}
            afterEqual=false;
            afterOperator=false;
        }
    }

    public void operation(View view) {

        Button but= (Button)findViewById(view.getId());
        operator=but.getText().charAt(0);

        firstNumber = Float.parseFloat(sFirstNumber);
        isSecondNumber=true;
        afterOperator=true;
        sHistory=sFirstNumber+operator;
        historyText.setText(sHistory);
        if(afterEqual)resultText.setText(sFirstNumber);

    }

    public void calculation(View view) {

        if(afterEqual||sSecondNumber.equals(""))return;

        secondNumber = Float.parseFloat(sSecondNumber);
        sHistory=sFirstNumber+operator+sSecondNumber+"=";
        historyText.setText(sHistory);

        if(secondNumber==0&&operator=='/'){
            Context context = getApplicationContext();
            CharSequence text = "division from 0 is unavailable";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            clear(view);
            return;
        }

        result = CalculationFunctions.calculate(operator, firstNumber, secondNumber);
        sResult = Float.toString(result);
        resultText.setText(sResult);

        firstNumber=result;
        sFirstNumber=sResult;
        afterEqual=true;
        afterOperator=false;
        secondNumber=0;
        sSecondNumber="";
        isSecondNumber=false;

    }

    public void clear(View view) {
        afterEqual=false;
        afterOperator=false;
        isSecondNumber=false;
        firstNumber=0;
        sFirstNumber="0";
        sSecondNumber="";
        sResult="0";
        resultText.setText(sResult);
        sHistory="";
        historyText.setText(sHistory);
    }

    public void noFunction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Function not available";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void delete(View view) {

        if(afterOperator)return;

        if(isSecondNumber==false){
            if(sFirstNumber.length()==1){
                sFirstNumber="0";
                resultText.setText(sFirstNumber);
            }
            else {
                sFirstNumber = sFirstNumber.substring(0, sFirstNumber.length() - 1);
                resultText.setText(sFirstNumber);

            }
        }
        else{
            if(sSecondNumber.length()==1){
                sSecondNumber="0";
                resultText.setText(sSecondNumber);

            }
            else{
                sSecondNumber=sSecondNumber.substring(0,sSecondNumber.length() - 1);
                resultText.setText(sSecondNumber);

            }
        }
    }

    public void squareRoot(View view) {

        if(isSecondNumber){
            secondNumber = Float.parseFloat(sSecondNumber);
            result = CalculationFunctions.squareRoot(secondNumber);
            sResult = Float.toString(result);
            resultText.setText(sResult);
            sSecondNumber = sResult;
            secondNumber = result;
        }
        else{
            firstNumber = Float.parseFloat(sFirstNumber);
            result = CalculationFunctions.squareRoot(firstNumber);
            sResult = Float.toString(result);
            resultText.setText(sResult);
            sFirstNumber = sResult;
            firstNumber = result;
        }

    }

    public void negative(View view) {
        if (isSecondNumber) {
            secondNumber = Float.parseFloat(sSecondNumber);
            result=secondNumber*-1;
            sResult = Float.toString(result);
            resultText.setText(sResult);
            sSecondNumber = sResult;
            secondNumber = result;
        }
        else{
            firstNumber = Float.parseFloat(sFirstNumber);
            result=firstNumber*-1;
            sResult = Float.toString(result);
            resultText.setText(sResult);
            sFirstNumber = sResult;
            firstNumber = result;
        }
    }
}