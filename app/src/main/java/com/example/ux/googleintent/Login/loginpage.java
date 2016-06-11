package com.example.ux.googleintent.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ux.googleintent.R;

/**
 * Created by Ravi on 6/10/2016.
 */
public class loginpage extends Activity {
    EditText edit1,edit2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        edit1=(EditText)findViewById(R.id.username);
        edit2=(EditText)findViewById(R.id.password);
        btn1=(Button)findViewById(R.id.loginbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edit1.getText().toString().equals("admin"))&&(edit2.getText().toString().equals("admin")))
                {
                    Toast.makeText(getBaseContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getBaseContext(),welcomelogin.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Wrong Username/Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
