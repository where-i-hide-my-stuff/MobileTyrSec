package com.example.mobiletyrsec;




import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class myDBClass2 extends SQLiteOpenHelper {


    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "mydatabase";

    // Table Name
    private static final String TABLE_MEMBER = "members";

    public myDBClass2(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        // Create Table Name
        db.execSQL("CREATE TABLE " + TABLE_MEMBER +
                "(MemberID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " Name TEXT(100)," +
                " Tel TEXT(100));");

        Log.d("CREATE TABLE","Create Table Successfully.");
    }

    // Select All Data
    public Cursor SelectAllData() {
        // TODO Auto-generated method stub

        try {
            SQLiteDatabase db;
            db = this.getReadableDatabase(); // Read Data

            String strSQL = "SELECT  MemberID As _id , * FROM " + TABLE_MEMBER;
            Cursor cursor = db.rawQuery(strSQL, null);

            return cursor;

        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);

        // Re Create on method  onCreate
        onCreate(db);
    }

}
