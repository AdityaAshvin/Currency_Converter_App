package io.github.adityaashvin.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view){
        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
        String dollars = dollarAmount.getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleInr = 76.90 * doubleDollars;
        String ToastText = "" + doubleInr.toString();
        Toast.makeText(this, ToastText, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
