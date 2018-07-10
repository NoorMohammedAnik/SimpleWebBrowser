package com.aniik.simplewebbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGo,btnFB,btnGoogle,btnOfflinePage;
    EditText etxtURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo=findViewById(R.id.btn_go);
        btnFB=findViewById(R.id.btn_fb);
        btnGoogle=findViewById(R.id.btn_google);
        btnOfflinePage=findViewById(R.id.btn_offline_page);
        etxtURL=findViewById(R.id.etxt_url);


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=etxtURL.getText().toString();
                if(url.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter URL!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);

                }

            }
        });



        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);
            }
        });



        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);
            }
        });



        btnOfflinePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","offline");
                startActivity(intent);
            }
        });

    }
}
