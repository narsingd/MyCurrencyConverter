package com.example.ndyavani.mycurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToINR(View view) {
        Log.i("convertToINR", "Hello");
        EditText usdEditText = (EditText)findViewById(R.id.usdCurrency);
        double usd = Double.parseDouble(usdEditText.getText().toString());
        Log.i("convertToINR", usd+"");
        double inr = usd * 68;
        Log.i("convertToINR", inr+"");
        String msg = String.format("%.2f USD = %.2f INR", usd, inr);
        Log.i("convertToINR", msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
