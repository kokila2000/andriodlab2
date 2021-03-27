package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View arg0)
            {
                String uName = e1.getText().toString();
                String pass = e2.getText().toString();
                if(uName.equals("test")&&pass.equals("test"))
                {

                    Intent intent = new Intent(MainActivity.this,second.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getBaseContext(), "Login failed",Toast.LENGTH_LONG) .show();
                }



            }
        });
    }
}

