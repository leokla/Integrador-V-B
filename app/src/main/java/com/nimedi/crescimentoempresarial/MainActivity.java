package com.nimedi.crescimentoempresarial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void googleOnClick(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/")));
    }

    public void faceOnClick(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt-br.facebook.com/")));
    }
}