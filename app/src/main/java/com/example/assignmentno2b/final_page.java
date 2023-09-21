package com.example.assignmentno2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class final_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);
        Toast.makeText(final_page.this, "Account Is Created", Toast.LENGTH_LONG).show();
    }
}