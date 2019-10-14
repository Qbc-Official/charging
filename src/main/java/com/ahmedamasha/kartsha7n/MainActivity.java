package com.ahmedamasha.kartsha7n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void raseedConverter(View view) {

    Log.i("info", "Button Pressed");

    EditText editText = (EditText) findViewById(R.id.raseedText);

    String amountToBePaid = editText.getText().toString();

    double amountToConvert = Double.parseDouble(amountToBePaid);

    double amountToBePaidDouble = amountToConvert + (amountToConvert * 0.3);


    String amountInDollarsString = String.format("%.2f", amountToBePaidDouble);

    Toast.makeText(this, "hatko33" + amountToBePaid + " is Gondy" + amountInDollarsString, Toast.LENGTH_LONG).show();
}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
