package com.example.studentdbapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    static String DbName="College.db";
    static String TableName="students";
    static String Col1="id";
    static String Col2="name";
    static String Col3="rollno";
    static String Col4="admno";
    static String Col5="college";

    public DatabaseHelper(Context context)
    {
        super(context, DbName, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table "+TableName+ "("+Col1+" Integer primary key autoincrement,"
                +Col2+" text,"
                +Col3+" text,"
                +Col4+" text,"
                +Col5+" text)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
