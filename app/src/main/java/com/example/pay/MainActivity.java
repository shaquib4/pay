package com.example.pay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
    int GOOGLE_PAY_REQUEST_CODE = 123;

    Uri uri =
            new Uri.Builder()
                    .scheme("upi")
                    .authority("pay")
                    .appendQueryParameter("pa", "your-merchant-vpa@xxx")
                    .appendQueryParameter("pn", "your-merchant-name")
                    .appendQueryParameter("mc", "your-merchant-code")
                    .appendQueryParameter("tr", "your-transaction-ref-id")
                    .appendQueryParameter("tn", "your-transaction-note")
                    .appendQueryParameter("am", "your-order-amount")
                    .appendQueryParameter("cu", "INR")
                    .appendQueryParameter("url", "your-transaction-url")
                    .build();
    Intent intent = new Intent(Intent.ACTION_VIEW);
}