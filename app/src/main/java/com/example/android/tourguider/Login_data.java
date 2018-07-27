package com.example.android.tourguider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Login_data extends SQLiteOpenHelper {

    private Context actvity;
    public Login_data(Context context) {

            super(context, context.getString(R.string.databasename), null, 1);
            actvity=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(actvity.getString(R.string.oncreatequery));

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(actvity.getString(R.string.upgradequery1));
        onCreate(db);

    }
}
