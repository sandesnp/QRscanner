package com.example.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BarcodeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnScanBarcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

        initViews();
    }

    private void initViews() {

        btnScanBarcode = findViewById(R.id.btnScanBarcode);
        btnScanBarcode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnScanBarcode:
                startActivity(new Intent(BarcodeActivity.this, ScannedBarcodeActivity.class));
                break;
        }

    }
}