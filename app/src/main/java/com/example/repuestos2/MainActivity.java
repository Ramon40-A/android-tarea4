package com.example.repuestos2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;






public class MainActivity extends AppCompatActivity  {


    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.botonempresa);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            // EVENTO ONCLICK DEL BOTON
            public void onClick(View v)
            {

                Intent a = new Intent( MainActivity.this, ProductoActivity.class);
                startActivity(a);


                // CODIGO PARA CAMBIAR UN TEXTO AL HACER CLICK
           /* setContentView(R.layout.activity_main);
            TextView fono = (TextView)findViewById(R.id.textofono);
            fono.setText("Este texto ha cambiado");
            */

            }
        });








    }






}