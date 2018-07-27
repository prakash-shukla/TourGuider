package com.example.android.tourguider;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);

        Button signin = (Button) findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText temp = (EditText) findViewById(R.id.sign_user);
                EditText temp1 = (EditText) findViewById(R.id.sign_password);
                String user = temp.getText().toString().trim();
                String password = temp1.getText().toString().trim();
                String emailPattern = getString(R.string.pettern);
                int var = 0;
                if (user.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Sign_In.this, R.string.msg1, Toast.LENGTH_SHORT).show();
                } else {
                    Login_data data = new Login_data(Sign_In.this);
                    SQLiteDatabase db = data.getReadableDatabase();
                    String selectfromdata = getString(R.string.query);
                    Cursor cursor = db.rawQuery(selectfromdata, null);
                    if (cursor != null) {
                        if (cursor.moveToFirst()) {
                            do {
                                String s1 = cursor.getString(cursor.getColumnIndex(getString(R.string.uname)));
                                String s2 = cursor.getString(cursor.getColumnIndex(getString(R.string.pass)));
                                if (user.equals(s1) && password.equals(s2)) {
                                    var = 1;
                                    break;
                                }

                            } while (cursor.moveToNext());
                        }
                        if (var == 1) {
                            Intent i = new Intent(Sign_In.this, Home_page.class);
                            i.putExtra(getString(R.string.user), user);
                            startActivity(i);
                        }
                    } else {
                        Toast.makeText(Sign_In.this, R.string.msg2, Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });


    }
}
