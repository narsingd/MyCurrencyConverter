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
        int usd = Integer.parseInt(usdEditText.getText().toString());
        Log.i("convertToINR", usd+"");
        int inr = usd * 68;
        Log.i("convertToINR", inr+"");
        String msg = usd + " USD = " + inr + " INR";
        Log.i("convertToINR", msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
