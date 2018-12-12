package com.example.kaist.tripstrapstrull;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class nimed extends AppCompatActivity implements Serializable {


    private View mängija1;
    private View mängija2;
    private Button jätka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nimed);

        mängija1 = findViewById(R.id.mängija1);
        mängija2=findViewById(R.id.mängija2);
        jätka=findViewById(R.id.jätka);
    }
    public void jätka(View view){
        Intent intent=new Intent(nimed.this,MainActivity.class);
        startActivity(intent);
    }
}
