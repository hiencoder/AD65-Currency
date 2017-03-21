package com.example.mrphonglinh.ad65_currency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txtForeignCurrency, txtHomeCurrency, btnCalculate, txtResultHomeCurrency;
    private EditText txtInputMoney;
    private ImageView btnForeign, btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();
    }

    private void initView() {
        txtForeignCurrency = (TextView) findViewById(R.id.txtForeignCurrency);
        txtHomeCurrency = (TextView) findViewById(R.id.txtHomeCurrency);
        btnCalculate = (TextView) findViewById(R.id.btnCalculate);
        btnForeign = (ImageView) findViewById(R.id.btnChooseHome);
        btnHome = (ImageView) findViewById(R.id.btnChooseHome);
        txtResultHomeCurrency = (TextView) findViewById(R.id.txtResultHomeCurrency);
        txtInputMoney = (EditText) findViewById(R.id.txtInputMoney);

    }

    private void initEvent() {
        btnForeign.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalculate:
                break;
            case R.id.btnChooseForeign:
                break;
            case R.id.btnChooseHome:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_view_active_code:
                break;
            case R.id.menu_invert_code:
                break;
            case R.id.menu_exit:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
