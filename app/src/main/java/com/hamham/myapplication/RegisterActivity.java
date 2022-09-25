package com.hamham.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText etUsernameRegister;
    private EditText etPasswordRegister;
    private Button btRegister;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        back();
    }

    private void initView() {
        etUsernameRegister = findViewById(R.id.etUsernameRegister);
        etPasswordRegister = findViewById(R.id.etPasswordRegister);
        btRegister = findViewById(R.id.btRegister);
        btnBack = findViewById(R.id.btBack);
    }
    private void back() {
        btnBack.setOnClickListener(V -> {
            Intent back = new Intent(this, LoginActivity.class);
            startActivity(back);
            finish();}
        );
    }
}
