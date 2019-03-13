package com.example.takehomeassignment06_qinyanz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private double amount;
    private double tax;
    private double tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        double myAmount = Double.parseDouble(((EditText) findViewById(R.id.amount)).getText().toString());
        double myTax = Double.parseDouble(((EditText) findViewById(R.id.tax)).getText().toString());
        double myTip = Double.parseDouble(((EditText) findViewById(R.id.tip)).getText().toString());
        double totalTax = myAmount * myTax;
        String totalTaxString = NumberFormat.getCurrencyInstance().format(totalTax);
        double totalTip = myAmount * myTip;
        String totalTipString = NumberFormat.getCurrencyInstance().format(totalTip);
        String grandTotal = NumberFormat.getCurrencyInstance().format(myAmount + totalTax + totalTip);

        String receiptMessage = "Total: " + myAmount + "\n" +
                "Sales Tax: " + (totalTaxString) + "\n" +
                "Tip: " + (totalTipString) + "\n" +
                "Grand total: " + (grandTotal);

        YourReceipt total = new YourReceipt(myAmount,myTax,myTip);
        Intent intent = new Intent(this, YourReceipt.class);
        intent.putExtra(Keys.STRING, tax);
        startActivity(intent);
    }
}

