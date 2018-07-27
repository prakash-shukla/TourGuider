package com.example.android.tourguider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {


    public static final String DON_T_LEAVE_ANYTHING_EMPTY = "don.t.leave.anything.empty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText name = (EditText) findViewById(R.id.name);
                EditText pass = (EditText) findViewById(R.id.password);
                EditText uname = (EditText) findViewById(R.id.username);
                EditText pass2 = (EditText) findViewById(R.id.confirmpass);
                Login_data data = new Login_data(MainActivity.this);
                SQLiteDatabase db = data.getWritableDatabase();
                String namestr=name.getText().toString().trim();
                String user=uname.getText().toString().trim();
                String passstr = pass.getText().toString().trim();
                String pass2str = pass2.getText().toString().trim();
                if (passstr.equals(pass2str)) {
                    if(user.isEmpty() || passstr.isEmpty()){
                    Toast.makeText(MainActivity.this, "DON_T_LEAVE_ANYTHING_EMPTY",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        ContentValues c = new ContentValues();
                        c.put(getString(R.string.name),namestr);
                        c.put(getString(R.string.uname), user);
                        c.put(getString(R.string.pass), passstr);
                        db.insert(getString(R.string.tname), null, c);
                        Intent i = new Intent(MainActivity.this, Sign_In.class);
                        startActivity(i);
                    }

                } else {

                    Toast.makeText(MainActivity.this, R.string.msg, Toast.LENGTH_SHORT).show();
                }

            }
        });
        Button signpage=(Button) findViewById(R.id.signinpage);
        signpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Sign_In.class);
                startActivity(i);
            }
        });


    }
}
